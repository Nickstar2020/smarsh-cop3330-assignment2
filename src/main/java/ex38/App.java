/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex38;
import java.util.Scanner;

public class App {
    public static String filterEvenNumbers(String input) {
        String filteredNumbs = "";
        int i=0;

        //create String

        //first put every number into an array of ints
        String[] numbers = input.split(" ");
        int[] numberArray = new int[numbers.length];
        for(String number : numbers) {
            numberArray[i++] = Integer.parseInt(number);
        }

        //now using an algorithm, detect all even numbers
        for(i=0; i<numberArray.length; i++) {
            if(numberArray[i] % 2 == 0) {
                filteredNumbs = filteredNumbs + " " + numberArray[i];
            }
        }

        return filteredNumbs;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ask user for numbers
        System.out.println("Please enter a list of numbers, separated by spaces:");
        String input = scan.nextLine();

        //call func to do the splitting and such
        String filteredNumbs = filterEvenNumbers(input);

        //print out filteredNumbs
        System.out.println("The even numbers are" + filteredNumbs);

    }
}
