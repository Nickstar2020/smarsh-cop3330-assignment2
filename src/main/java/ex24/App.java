/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex24;
import java.util.Scanner;
import java.util.Arrays;

public class App {


    public static boolean isAnagram(String a, String b) {
        //ensuring that they at least have the same number of letters before checking
        if(a.length() != b.length()) {
            return false;
        }

        //create arrays of strings and then sort to see if they have the same letters
        char[] ArrayA = a.toLowerCase().toCharArray();
        char[] ArrayB = b.toLowerCase().toCharArray();
        Arrays.sort(ArrayA);
        Arrays.sort(ArrayB);

        //returns true or false depending on if they have the same letters or not
        return Arrays.equals(ArrayA, ArrayB);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ask for the first and second string
        System.out.println("Please enter the first string...");
        String a = scan.nextLine();
        System.out.println("Please enter the second string...");
        String b = scan.nextLine();

        //send strings to func
        if(isAnagram(a, b)) {
            System.out.println( "'" + a + "'" + " and " + "'" + b + "'" + " are anagrams!");
        } else {
            System.out.println("They are not anagrams.");
        }
    }
}
