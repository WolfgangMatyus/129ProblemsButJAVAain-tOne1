package com.Exercises.ArrayEvenStatistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input = 1, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input");

        while(count < 1025){
            if(input == 0) {
                System.out.print("re-enter 0 to store as value. \n" +
                        "any other value ends input: ");
            }else {
                System.out.print(": ");
                input = sc.nextInt();
                if (input == 0) {
                    continue;
                }
                    System.out.print("Input finished");
                    break;
                }
            }
        }
    }

/*
Read at most 1024 integer numbers on the console and store them in an array. Then compute and display a series of statistical quantities.
Input

Users are prompted for input once (in the beginning). All integer numbers are accepted. Input ends automatically after the 1024th number. After input of one 0, users are asked whether to store value 0 or to exit with the following message re-enter 0 to store as value. any other value ends input:. Either another 0 is entered (message: value 0 stored.) or all other values end input (message: Input finished.)
Output

If no numbers are stored at all, the program displays message no values entered.

The following quantities are computed and printed:

    number of even numbers stored (count)

If even numbers were entered, the following is also displayed:

    index positions of the even numbers
    sum of the even numbers
    mean of the even numbers
    value of the maximum even number
    (all) index position(s) of the maximum even number

See examples for formatting details
Hint

    to keep things simple all index positions are displayed with a leading blank (see examples)

Examples

(text in red is user input)

    Input
    : 1
    : 2
    : 3
    : 4
    : 5
    : 4
    : 3
    : 4
    : 5
    : 4
    : 3
    : 0
    re-enter 0 to store as value.
    any other value ends input: 1
    Input finished.
              count: 5
    index positions: [ 1 3 5 7 9]
                sum: 18
               mean: 3.60
                max: 4 [ 3 5 7 9]

    Input
    : 5
    : 4
    : 3
    : 2
    : 1
    : 0
    re-enter 0 to store as value.
    any other value ends input: 0
    value 0 stored.
    : 0
    re-enter 0 to store as value.
    any other value ends input: 1
    Input finished.
              count: 3
    index positions: [ 1 3 5]
                sum: 6
               mean: 2.00
                max: 4 [ 1]

    Input
    : 1
    : 1
    : 1
    : 1
    : 1
    : 0
    re-enter 0 to store as value.
    any other value ends input: 1
    Input finished.
             count: 0


 */