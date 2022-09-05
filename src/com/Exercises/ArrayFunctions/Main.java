package com.Exercises.ArrayFunctions;

import java.util.Scanner;

    public class Main {
        private static final int LINEAR_FILL = 1;
        private static final int CONTAINS = 2;
        private static final int COUNT_BELOW = 3;
        private static final int FIND_1 = 4;
        private static final int FIND_2 = 5;
        private static final int FILTER = 6;

    public static void main(String[] args) {
            go();
        }

        public static void go() {
            Scanner sc = new Scanner(System.in);
            double[] dArr = {1,4,23.3,12.3,0.5,432.53,-123.34,34.12};
            int[][] iArr2 = { { 0 }, { 10, 11 }, { 20, 21, 22 },
                    { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 },
                    { 5, 8, 58, 85, 5, 8, 8, 5, 8, 5 },{900,800,700,600,500,400,300,200,100} };
            String[] strings = null;

            System.out.println("choose method to test \\n(LINEAR_FILL = 1, "
                    + "CONTAINS = 2,    COUNT_BELOW = 3, "
                    + "FIND_1 = 4, FIND_2 = 5, FILTER = 6)");

            while (true) {

                System.out.println(":");
                int choice = sc.nextInt();
                int n;
                switch (choice) {
                    case LINEAR_FILL:
                        System.out.println("LinearFill");
                        System.out.println("enter array length, start value and inc value:");
                        linearFill(dArr = new double[sc.nextInt()], sc.nextDouble(), sc.nextDouble());
                        display(dArr);
                        continue;

                    case CONTAINS:
                        System.out.println("enter value to look for:");
                        System.out.println("contains: "
                                + contains(iArr2, n = sc.nextInt())
                                + " (" + n + ")");
                        continue;

                    case COUNT_BELOW:
                        System.out.println("CountBelow");
                        System.out.println("enter boundary:");
                        System.out.printf("%d",
                                countBelow(dArr, sc.nextDouble()));

                        continue;

                    case FIND_1:
                        System.out.println("enter value to find:");
                        System.out.println("find 1: "
                                + find(iArr2[3], n = sc.nextInt())
                                + " (" + n + ")");
                        continue;

                    case FIND_2:
                        System.out.println("enter value to find and starting index:");
                        System.out.println("find 2: "
                                + find(iArr2[4], n = sc.nextInt(),
                                sc.nextInt()) + " (" + n + ")");
                        continue;

                    case FILTER:
                        System.out.println("enter size of String array, and strings for each position:");
                        System.out.println("Filter");
                        strings = new String[sc.nextInt()];
                        for (int i = 0; i < strings.length; i++) {
                            String it;
                            System.out.print(": ");
                            while ((it = sc.nextLine()).equals(""))
                                ;
                            strings[i] = it;
                        }
                        System.out.print("enter regex: ");
                        String regex;
                        while ((regex = sc.nextLine()).equals(""))
                            ;
                        display(strings);
                        display(filter(strings, regex));
                        continue;
                }
                break;
            }
        }

        private static String[] filter(String[] arr, String regex) {
            String[] filtered = new String[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i].matches("[regex]")) {
                filtered = new String[filtered.length + 1];
                filtered[filtered.length-1] = arr[i];
            }
        }
        return filtered;
        }

        private static int find(int[] ints, int i, int startIdx) {
        if(startIdx < 0)  {startIdx = 0;}
            for(int x = startIdx; x < ints.length; x++){
                if(ints[x] == i){
                    return x;
            }
        }
            return -1;
        }

        private static int find(int[] ints, int i) {
        for(int x = 0; x < ints.length; x++){
            if(ints[x] == i){
                return x;
            }
        }
        return -1;
        }

        private static int countBelow(double[] dArr, double belowThis) {
        int countBelow = 0;
        for(int i = 0; i < dArr.length; i++){
            if(dArr[i] < belowThis){
                countBelow++;
            }
        }
        return countBelow;
        }

        private static String contains(int[][] iArr2, int i) {
            for (int x = 0; x < iArr2.length; x++) {
                for (int y = 0; y < iArr2[x].length; y++) {
                    if (iArr2[x][y] == i) {
                        return "true";
                    }
                }
            }
            return "false";
        }

        private static void linearFill(double[] dArr, double start, double increment) {
            if (dArr.length != 0) {
                dArr[0] = start;
                double value = start;
                for (int i = 1; i < dArr.length; i++) {
                    value += increment;
                    dArr[i] = value;
                }
            }
        }

        public static void display(double[] d) {
            System.out.print("[");
            for (double i : d)
                System.out.printf("%.2f ", i);
            System.out.println("]");
        }

        public static void display(int[] d) {
            System.out.print("[");
            for (int i : d)
                System.out.printf("%3d ", i);
            System.out.println("]");
        }

        public static void display(String[] d) {
            System.out.println("[");
            for (String s : d)
                System.out.printf("%s ", s);
            System.out.println("]");
        }
    }

/*
Assignment

This assignment is about some standard operations on arrays like searching, sorting or filtering.
Implement the following functions in class ArrayFunctions.

    public static void linearFill(double[] array, double start, double inc)
        fill array with double values.
        The values are linearly increasing with increment inc; the first value is start
        This function assumes a non-null first argument.

    double[] a=new double[5];
    linearFill(a, 2.1, 3.1); //content: 2.1, 5.2, 8.3, 11.4, 14.5

    public static boolean contains(int[][] array, int key)
        test if array contains key.
        The function returns true if array contains key, false otherwise.
        This function assumes a fully initialized, non-null first argument.
    public static int countBelow(double[] arr, double a)
        count the number of values in array that are less than a.
        This function assumes a fully initialized, non-null first argument.
    public static int find(int[] arr, int key)
        find the index of a key value
        returns the index of the first occurrence of key in array or -1 if key is not in array.
        This function assumes a fully initialized, non-null first argument.
    public static int find(int[] arr, int key, int startIdx)
        find the index of a key value
        returns the index of the first occurrence of key with an index greater than or equal to startIdx. Returns -1 if no value with an index of startIdx or higher in array is equal to key. Starts searching at index 0, if startIdx is below 0;
        This function assumes a fully initialized, non-null first argument.
    public static String[] filter(String[] arr, String regex)
        filter an array of String with a regular expression
        returns an array of all String in arr that match regex.{.java}
        Returns an array of size 0, if no items in arr match.
        The size of the array returned is equal to the number of elements that match. That means the returned array does NOT contain empty/null slots.
        This function assumes a fully initialized, non-null first argument.

6
5
abcdefgh
3bcdefgh
de12fgh
de34fgh
efgh
.*fgh
6
5
abcdefgh
3bcdefgh
de12fgh
de34fgh
efgh
\D*fgh
0

 */