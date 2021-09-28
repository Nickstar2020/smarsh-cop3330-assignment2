/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex29;
import java.util.Scanner;
import java.util.regex.*;

public class App {

    public static double yearsToDouble(double r) {
        return (72 / r) ;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //create pattern to detect correct input
        Pattern p = Pattern.compile("^[0-9]*$");

        //ask for input in a while loop
        while(true) {
            System.out.println("What is the rate of return?");

            String input = scan.nextLine();
            Matcher m = p.matcher(input);

            if(m.find()) {
                //set r to double
                double r = Double.parseDouble(input);
                if(r == 0) {
                    System.out.println("Sorry, that is not a valid input.");
                    continue;
                } else {
                    double years = yearsToDouble(r);

                    System.out.println("It will take " + (int)years + " years to double your initial investment.");

                    break;
                }

            }
            //print out error if its not a number
            System.out.println("Sorry, that is not a valid input.");

        }
    }
}
