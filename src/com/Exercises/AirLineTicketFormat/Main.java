package com.Exercises.AirLineTicketFormat;

public class Main {
    public static void main(String[] args) {
                System.out.printf("%.11S%.2S%S\n", "Mandl", "Thomas", "MR");
                System.out.printf("%.11S%.2S%S\n", "Hinteroberegginger", "Yolanda", "MRS");;

    }
}

/*
Synopsis

Generate names as they appear on airline tickets.
Assignment

Write a program AirLineTicketFormat that creates an airline ticket style formatting of name and salutation.

The format is <NAME><FIRSTNAME><SALUTATION> (without brackets) and all capitals where

    NAME is at most 11 charcters wide
    FIRSTNAME is at most 2 characters wide
    SALUTATION is either “MRS” or “MR”

Modify the format strings of this code

System.out.printf("%S%S%S\n", "Mandl", "Thomas", "MR");
System.out.printf("%S%S%S\n", "Hinteroberegginger", "Yolanda", "MRS");

to produce the output

    MANDLTHMR
    HINTEROBEREYOMRS


 */