/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex27;

import java.util.Scanner;
import java.util.regex.*;

public class App {

    //create 4 classes that check each input for the statement
    public static boolean firstNameChecker(String firstName) {
        boolean fN = true;

        //checks if long enough and if inputted
        if(firstName.length() < 2) {
            System.out.println("first name must be at least 2 characters long.");
            fN = false;
        }
        if(firstName.length() == 0) {
            System.out.println("first name must be filled in.");
            fN = false;
        }

        return fN;
    }

    public static boolean lastNameChecker(String lastName) {
        boolean lN = true;

        //checks if long enough and if filled in
        if(lastName.length() < 2) {
            System.out.println("last name must be at least 2 characters long.");
            lN = false;
        }
        if(lastName.length() == 0) {
            System.out.println("last name must be filled in.");
            lN = false;
        }

        return lN;
    }

    public static boolean zipCodeChecker(String zipCode) {
        //create pattern to ensure that its only numbers
        Pattern p = Pattern.compile("^[0-9]{5}$");
        Matcher m = p.matcher(zipCode);
        boolean zC = m.find();

        if(!zC) {
            System.out.println("zipcode must be a 5 digit number");
        }

        return zC;
    }

    public static boolean IDChecker(String IDEN) {
        //create pattern to check if it follows format (example: AA-1234)
        Pattern p = Pattern.compile("^[A-Z]{2}[-][0-9]{4}$");
        Matcher m = p.matcher(IDEN);
        boolean ID = m.find();

        if(!ID) {
            System.out.println("ID must be in the format AA-1234");
        }

        return ID;
    }

    public static boolean validateInput(boolean fN, boolean lN, boolean zC, boolean ID) {
        //if everything checks out return no error statement
        if( fN && lN && zC && ID) return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ask for inputs
        System.out.println("Enter the first name:");
        String firstName = scan.nextLine();

        System.out.println("Enter the last name:");
        String lastName = scan.nextLine();

        System.out.println("Enter the ZIP code:");
        String zipCode = scan.nextLine();

        System.out.println("Enter the employee ID:");
        String IDEN = scan.nextLine();

        //check if everything is all good
        boolean fN = firstNameChecker(firstName);
        boolean lN = lastNameChecker(lastName);
        boolean zC = zipCodeChecker(zipCode);
        boolean ID = IDChecker(IDEN);

        if(validateInput(fN, lN, zC, ID)) {
            System.out.println("there were no errors found");
        }
    }
}
