/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex31;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
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
            Matcher m = p.matcher(restingHR);
            if(!m.find()) System.out.println("Invalid Input");
            else {
                restingHRNUM = Integer.parseInt(restingHR);
                break;
            }
        }


        while(true) {
            System.out.println("What is your age?");
            age = scan.nextLine();
            Matcher m1 = p.matcher(age);
            if(!m1.find()) System.out.println("Invalid Input");
            else {
                ageNUM = Integer.parseInt(age);
                break;
            }
        }

        //using for loop, compute the target heart rate
        System.out.println    ("INTENSITY        | RATE    ");
        System.out.println    ("-----------------|---------");

        for(int i=55; i<=95; i = i+5) {
            double intensity = (double)i /100;
            double TargetHeartRate = ((((220 - ageNUM) - restingHRNUM) * intensity) + restingHRNUM);
            System.out.println(i+"%              | " + String.format("%.0f", TargetHeartRate) + " bpm" );
        }

    }
}
