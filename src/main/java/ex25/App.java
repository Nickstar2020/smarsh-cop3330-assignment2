/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex25;
import java.util.Scanner;
import java.util.regex.*;

public class App {

    public static int passwordValidator(String password) {
        int caseNumber = 0;

        //determines if password is complex enough, does not return a string but a number

        //create patterns based on complexity
        Pattern p0 = Pattern.compile("[0-9]");
        Pattern p1 = Pattern.compile("[a-zA-Z]");
        Pattern p2 = Pattern.compile("^(?=.*[a-zA-Z])(?=.*[0-9])[a-zA-Z0-9].{7,}+$");
        Pattern p3 = Pattern.compile("^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[@#$%^&+=!*])[a-zA-Z0-9@#$%^&+=].{7,}+$");

        //Match patterns
        Matcher m0 = p0.matcher(password);
        Matcher m1 = p1.matcher(password);
        Matcher m2 = p2.matcher(password);
        Matcher m3 = p3.matcher(password);

        //convoluted but helps shows how strong the password is
        boolean passLevel0 = m0.find();
        boolean passLevel1 = m1.find();
        boolean passLevel2 = m2.find();
        boolean passLevel3 = m3.find();

        //cases to determine what the strength of the password is
        if(passLevel0) caseNumber = 1;
        if(passLevel1) caseNumber = 2;
        if(passLevel2) caseNumber = 3;
        if(passLevel3) caseNumber = 4;

        return caseNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String finalCase = null;

        //ask to input password to check
        System.out.println("please input a password to check");
        String password = scan.nextLine();

        //send password to func to check
        int passwordLevel = passwordValidator(password);

        //cases for output
        switch(passwordLevel) {
            case 0:
                finalCase = "invalid";
                break;

            case 1:
                finalCase = "Very Weak";
                break;

            case 2:
                finalCase = "Weak";
                break;

            case 3:
                finalCase = "Strong";
                break;

            case 4:
                finalCase = "Very Strong";
                break;
        }

        //print output
        System.out.println("'" + password + "'" + " is a " + finalCase + " password.");

    }
}
