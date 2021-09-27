/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex37;
import java.util.*;

public class App {
    public static String shufflePassword(String notShuffledPassword)
    {
        //shuffles the password using the Collections.
        List<String> password = Arrays.asList(notShuffledPassword.split(""));
        Collections.shuffle(password);
        String newShuffledPass = "";

        for (String character : password) {
            newShuffledPass += character;
        }

        return newShuffledPass;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ask for the min length
        System.out.println("What is the minimum length?");
        int minLength = scan.nextInt();

        //ask for how many special chars
        System.out.println("How many special characters?");
        int specialChars = scan.nextInt();

        //ask for how many numbers
        System.out.println("How many numbers?");
        int numbers = scan.nextInt();

        //list of all the things that might be used to create a random password.
        List<Character> alphabetList = new ArrayList<>();
        String stringChars = "abcdefghijklmnopqrstuvwxyz";

        List<Character> numbersList = new ArrayList<>();
        String stringNumbs = "1234567890";

        List<Character> specialList = new ArrayList<>();
        String stringSpecial = "/%^&*$#@!.<>+-";

        //adds password characters to separate list
        for(char ch: stringChars.toCharArray()) {
            alphabetList.add(ch);
        }

        for(char ch: stringNumbs.toCharArray()) {
            numbersList.add(ch);
        }

        for(char ch: stringSpecial.toCharArray()) {
            specialList.add(ch);
        }

        //print out password (also 1 challenge: print multiple passwords)
        System.out.println("Here are 5 passwords to choose from!");
        for(int i=0; i<5; i++) {
            //randomly generate each letter/number/special character
            StringBuilder password = new StringBuilder("");

            for(int j=0; j<minLength; j++) {
                int random = new Random().nextInt(alphabetList.size()-1);
                password.append(alphabetList.get(random));
            }
            for(int j=0; j<specialChars; j++) {
                int random = new Random().nextInt(specialList.size()-1);
                password.append(specialList.get(random));
            }
            for(int j=0; j<numbers; j++) {
                int random = new Random().nextInt(numbersList.size()-1);
                password.append(numbersList.get(random));
            }
            //shuffles password around
            String notShuffledPassword = password.toString();
            System.out.println(shufflePassword(notShuffledPassword));
        }
    }
}
