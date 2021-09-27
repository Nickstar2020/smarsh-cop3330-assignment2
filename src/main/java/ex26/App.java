/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex26;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ask for the numbers
        System.out.println("What is your balance?");
        double b = scan.nextDouble();

        System.out.println("What is the APR on the card (as a percent)?");
        double i = scan.nextDouble();

        System.out.println("What is the monthly payment you can make?");
        double p = scan.nextDouble();

        //print out n
        double n = PaymentCalculator.calculateMonthsUntilPaidOff(b, i, p);

        System.out.println("It will take you " + (int)n + " months to pay off this card.");
    }
}
