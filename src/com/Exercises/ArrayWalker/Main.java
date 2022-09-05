package com.Exercises.ArrayWalker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] map = new String[10][10];
        for(int x = 0; x < map.length; x++){
            for(int y = 0; y < map[x].length; y++){
                map[x][y] = ".";
            }
        }
        String move = "";
        Position pos = new Position();
        int i = 65;
        String currPos = String.valueOf((char)i);
        map[0][0] = currPos;
        printMap(map);
        while(validMove(move) == true){
            System.out.print("Enter direction command: ");
            System.out.println();
            //System.out.println("8 = north , 6 = east, 2 = south, 4 = west");
            move = sc.nextLine();
            switch(move){
                case "8": //north
                    pos.x--;
                    if(validPos(pos.x, pos.y, map) == false){
                        System.out.println("You cannot go there!");
                        pos.x++;
                        break;
                    } else{
                        i++;
                        if(i > 90){i = 65;}
                        map[pos.x][pos.y] = String.valueOf((char)i);
                        printMap(map);
                    }
                    break;
                case "6": // east
                    pos.y++;
                    if(validPos(pos.x, pos.y, map) == false){
                        System.out.println("You cannot go there!");
                        pos.y--;
                        break;
                    } else{
                        i++;
                        if(i > 90){i = 65;}
                        map[pos.x][pos.y] = String.valueOf((char)i);
                        printMap(map);
                    }
                    break;
                case "2": // south
                    pos.x++;
                    if(validPos(pos.x, pos.y, map) == false){
                        System.out.println("You cannot go there!");
                        pos.x--;
                        break;
                    } else{
                        i++;
                        if(i > 90){i = 65;}
                        map[pos.x][pos.y] = String.valueOf((char)i);
                        printMap(map);
                    }
                    break;
                case "4": // west
                    pos.y--;
                    if(validPos(pos.x, pos.y, map) == false){
                        System.out.println("You cannot go there!");
                        pos.y++;
                        break;
                    } else{
                        i++;
                        if(i > 90){i = 65;}
                        map[pos.x][pos.y] = String.valueOf((char)i);
                        printMap(map);
                    }
                    break;
                }
            }

        }

    public static boolean validPos(int x, int y, String[][] map) {
        if (x < 0 || x > 9 || y < 0 || y > 9 || map[x][y] != ".") {
            return false;
        }
        return true;
    }

    public static boolean validMove(String move){
        if(move.equals("#") || move.equals("8") || move.equals("6") || move.equals("4") || move.equals("2") || move.equals("")){
            return true;
        }
        return false;
    }

    private static void printMap(String[][] map) {
        for(int x = 0; x < map.length; x++){
            for (int y = 0; y < map[x].length; y++){
                System.out.printf("%s", map[x][y]);
            }
            System.out.println();
        }
    }
}

class Position{
    int x = 0;
    int y = 0;
}

/*
ArrayWalker

Write a program that computes a “walk” (of a cute robot) across a 10x10 array.
The array contains characters (all initially ‘.’).
The user can enter four different directions north, east, south, west,
by entering the directions on the num block (8 = north , 6 = east, 2 = south, 4 = west) to control the walk.
If the user enters 5 the program exits.
After each direction-command the array is printed with the walk being display by capital letter starting with A to Z.
We use A for the starting point, with 25 remaining letters to denote the steps.
After having used letter Z to denote a step, we wrap around and start again with A.
To make the walk more interesting, the user is not allowed to revisit a location.
In this case the program does not print the array, but prints “You cannot go there!” - Yes, you can trap yourself.

We start in the upper left corner (position 0,0).
Examples

(Text in red = user input)

    A.........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........
    Enter direction command: 8

    You cannot go there!
    Enter direction command: 2

    A.........
    B.........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........
    Enter direction command: 6

    A.........
    BC........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........
    Enter direction command: 4

    You cannot go there!
    Enter direction command: 2

    A.........
    BC........
    .D........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........
    Enter direction command: 5


 */