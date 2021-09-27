/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex35;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = null;
        int count = 0;
        int random = 0;


        //make arrayList
        ArrayList<String> names = new ArrayList<String>();

        //ask for inputs until next input is blank
        do {
            System.out.println("Enter a name:");
            input = scan.nextLine();
            names.add(input);
            count++;
        }
        while(!input.isEmpty());

        //generate random number based on how many numbers were inputted
        random = new Random().nextInt(count-1);

        //print winner
        System.out.println("The winner is " + names.get(random));
    }
}
