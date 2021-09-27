/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex32;
import java.util.Scanner;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 1;
        String guess = null;
        int guesses = 1;
        int difficultyNum = 0;
        int guessNum = 0;
        int Random = 0;
        boolean IncorrectGuess = false;

        //create pattern to ensure input is valid (numbers only) and also pattern for difficulty checker
        Pattern p = Pattern.compile("^[0-9]*$");
        Pattern p1 = Pattern.compile("^[1]$|^[2]$|^[3]$");

        //print out asking for difficulty and check if input is valid
            System.out.println("Let's play Guess the Number!\n");
        while(true) {
            System.out.println("Enter the difficulty level (1, 2, or 3)");
            String difficulty = scan.nextLine();
            Matcher m = p1.matcher(difficulty);
            if(m.find()) {
                difficultyNum = Integer.parseInt(difficulty);
                break;
            } else {
                System.out.println("Invalid input please use numbers/ correct numbers.");
            }
        }

        //determines difficulty
        if(difficultyNum == 1) {
            //generate random number for easy mode
            int Max = 10;
            Random = new Random().nextInt(Max - min + 1) + min;
        } else if( difficultyNum == 2) {
            int Max = 100;
            Random = new Random().nextInt(Max - min + 1) + min;
        } else if( difficultyNum == 3) {
            int Max = 1000;
            Random = new Random().nextInt(Max - min + 1) + min;
        }

            //ask for guess and ensure guess is valid input

            System.out.println("I have my number. What is your guess?");
            guess = scan.nextLine();
            Matcher m = p.matcher(guess);
            if(m.find()) {
                guessNum = Integer.parseInt(guess);
            } else {
                System.out.println("Invalid input please use numbers. (warning, invalid input also counts towards guesses)");
                guesses++;
                //this is here, so it doesn't say "too low" or "too high" for an invalid guess
                IncorrectGuess = true;
            }

            while(guessNum != Random) {
                if(IncorrectGuess) {
                    System.out.println("Guess again");
                    IncorrectGuess = false;
                } else if (guessNum > Random) {
                    System.out.println("Too high. Guess again:");
                } else {
                    System.out.println("Too low. Guess again");
                }
                //re-ask and re-validate
                guess = scan.nextLine();
                m = p.matcher(guess);
                if(m.find()) {
                    guessNum = Integer.parseInt(guess);
                } else {
                    System.out.println("Invalid input please use numbers. (warning, invalid input also counts towards guesses)");
                    IncorrectGuess = true;
                }
                guesses++;
            }
            System.out.println("You got it in " + guesses + " guesses!");
    }
}
