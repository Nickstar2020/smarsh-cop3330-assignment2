/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex31;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void heartRateTable(int ageNUM, int restingHRNUM) {
        //using for loop, compute the target heart rate
        System.out.println    ("INTENSITY        | RATE    ");
        System.out.println    ("-----------------|---------");
        for(int i=55; i<=95; i = i+5) {
            double intensity = (double)i /100;
            double TargetHeartRate = ((((220 - ageNUM) - restingHRNUM) * intensity) + restingHRNUM);
            System.out.println(i+"%              | " + String.format("%.0f", TargetHeartRate) + " bpm" );
        }
    }

    public static boolean validInput(String input) {
        Pattern p = Pattern.compile("^[0-9]*$");
        Matcher m = p.matcher(input);

        if(!m.find()) {
            System.out.println("Invalid Input");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pattern p = Pattern.compile("^[0-9]*$");

        String restingHR;
        String age;
        int ageNUM;
        int restingHRNUM;

        //first ask for resting, and age
        //then make sure input is valid
        while(true) {
            System.out.println("What is your resting pulse?");
            restingHR = scan.nextLine();
            if(validInput(restingHR)) {
                restingHRNUM = Integer.parseInt(restingHR);
                break;
            }
        }


        while(true) {
            System.out.println("What is your age?");
            age = scan.nextLine();
            if(validInput(age)) {
                ageNUM = Integer.parseInt(age);
                break;
            }
        }
        //print out heartRateTable
        heartRateTable(ageNUM, restingHRNUM);
    }
}
