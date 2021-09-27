/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex39;
import java.util.*;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        //create hashmap to store all the data for each person.
        Map<String, String[]> hm = new HashMap<>();

        String[] John       = {"John            |", "Johnson        |", "Manager                |", "2016-12-31      |"};
        String[] Tou        = {"Tou             |", "Xiong          |", "Software Engineer      |", "2016-10-05      |"};
        String[] Michaela   = {"Michaela        |", "Michaelson     |", "District Manager       |", "2015-12-19      |"};
        String[] Jake       = {"Jake            |", "Jacobson       |", "Programmer             |", "                |"};
        String[] Jacquelyn  = {"Jacquelyn       |", "Jackson        |", "DBA                    |", "                |"};
        String[] Sally      = {"Sally           |", "Webber         |", "Web Developer          |", "2015-12-18      |"};

        //takes in last name, and a string array with information regarding person
        hm.put("Johnson", John);
        hm.put("Xiong", Tou);
        hm.put("Michaelson", Michaela);
        hm.put("Jacobson", Jake);
        hm.put("Jackson", Jacquelyn);
        hm.put("Webber", Sally);

        //sort names in alphabetical order when printing out

        //first create an array that stores all the last names
        String[] LastNames = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
        //Then sort the array from first name to last name
        Arrays.sort(LastNames);
        //after that, then use a for loop to then print out the information in order
        System.out.println(    " First Name      |    Last Name    |        Position         | Separation Date  |");
        System.out.println(    "---------------------------------------------------------------------------------");
        for(int i=0;i<6;i++) {
            System.out.println(Arrays.toString(hm.get(LastNames[i])));
        }
    }
}
