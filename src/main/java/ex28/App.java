/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex28;
import java.util.Scanner;

public class App {

    public static int adder(int newNumber, int number) {
        number = newNumber + number;
        return number;
    }

    public static void main(String[] args) {
        int number = 0;
        int input = 0;
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<5; i++) {
            System.out.println("Enter a number");
            input = scan.nextInt();
            number = adder(input, number);
        }

        System.out.println("The total is " + number);
    }
}
