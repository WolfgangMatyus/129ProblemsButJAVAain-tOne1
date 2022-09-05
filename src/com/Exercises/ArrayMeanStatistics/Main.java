package com.Exercises.ArrayMeanStatistics;

public class Main {
}

/*
ArrayMeanStatistics

Read at most 1024 integer numbers on the console and store them in an array. Then compute and display a series of statistical quantities.
Input

Users are prompted for input with text (Input before the start of input and with a simple colon (:) before each number. All integer numbers are accepted. Input ends automatically after the 1024th number. After input of one 0, users are asked whether to store value 0 or to exit with the following message re-enter 0 to store as value. any other value ends input:. Either another 0 is entered (message: value 0 stored.) or all other values end input (message: Input finished.)
Output

If no numbers are stored at all, the program displays message no values entered.

The following quantities are computed and printed:

    mean of all numbers stored
    number of numbers greater than the mean
    If any of the entered numbers are greater than the mean the following is also displayed:
    index positions of the numbers greater than the mean
    sum of the numbers greater than the mean
    mean of the numbers greater than the (total) mean
    value of the minimum of the numbers greater than the mean
    (all) index position(s) of the minimum of the numbers greater than the mean

See examples for formatting details
Hints

    to keep things simple all index positions are displayed with a leading blank (see examples)

Examples

(text in red is user input)
Example 1

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
    total mean: 3.45
    ----------
              count: 6
    index positions: [ 3 4 5 7 8 9]
                sum: 26
               mean: 4.33
                min: 4 [ 3 5 7 9]

Example 2

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
    total mean: 2.50
    ----------
              count: 3
    index positions: [ 0 1 2]
                sum: 12
               mean: 4.00
                min: 3 [ 2]

Example 3

    Input
    : 1
    : 1
    : 1
    : 1
    : 1
    : 1
    : 1
    : 0
    re-enter 0 to store as value.
    any other value ends input: 1
    Input finished.
    total mean: 1.00
    ----------
             count: 0

Example 4

    Input
    : -99999
    : 1
    : 1
    : 1
    : 1
    : 1
    : 0
    re-enter 0 to store as value.
    any other value ends input: 1
    Input finished.
    total mean: -16665.67
    ----------
              count: 5
    index positions: [ 1 2 3 4 5]
                sum: 5
               mean: 1.00
                min: 1 [ 1 2 3 4 5]


 */