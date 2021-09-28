/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex30;

public class App {
    public static void printTable() {
        //need a nested for loop
        for (int y=1; y < 12; y++) {
            for (int x=1; x<12; x++) {
                //spaces them out by 5
                System.out.printf("%5d", y*x);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTable();
    }
}
