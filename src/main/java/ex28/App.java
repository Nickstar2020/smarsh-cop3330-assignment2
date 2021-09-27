/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex28;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;

        //create loop that ask for input
        for(int i=0; i<5; i++) {
            System.out.println("Enter a number");
            number += scan.nextInt();
        }

        System.out.println("The total is " + number);
    }
}
