/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex34;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int skip = 0;

        //create array, allocate mem, and also assign names to each slot
        String[] arrayList = new String[5];
        arrayList[0] = "John Smith";
        arrayList[1] = "Jackie Jackson";
        arrayList[2] = "Chris Jones";
        arrayList[3] = "Amanda Cullen";
        arrayList[4] = "Jeremy Goodwin";

        //print names out
        System.out.println("There are 5 employees:");
        for(int i=0; i<5; i++) {
            System.out.println(arrayList[i]);
        }

        //ask to remove a specific employee
        System.out.println("\nEnter an employee to remove:\n");
        String input = scan.nextLine();


        //take input and string compare into new array
        String[] newArrayList = new String[5];
        for(int i=0; i<5; i++) {
            if(Objects.equals(input, arrayList[i])) {
                skip = i;
                continue;
            }
            newArrayList[i] = arrayList[i];
        }

        //now print out new list
        System.out.println("There are now 4 employees:");
        for(int i=0;i<5; i++) {
            if(i == skip) {
                continue;
            }
            System.out.println(newArrayList[i]);
        }
    }
}
