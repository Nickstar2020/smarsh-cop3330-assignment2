/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex33;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //make scanner and random number
        int max = 4;
        int min = 1;
        Scanner scan = new Scanner(System.in);
        int Random = new Random().nextInt(max - min + 1) + min;

        //prompt for question
        System.out.println("What is your question?");
        String question = scan.nextLine();

        //print out case
        switch (Random) {
            case 1 :
                System.out.println("Yes");
                break;

            case 2 :
                System.out.println("No");
                break;

            case 3 :
                System.out.println("Maybe");
                break;

            case 4 :
                System.out.println("Ask again later.");
                break;
        }
    }
}
