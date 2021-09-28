/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex33;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static String askQuestion(int Random) {
        String answer = null;

        switch (Random) {
            case 1 :
                answer = ("Yes");
                break;

            case 2 :
                answer = ("No");
                break;

            case 3 :
                answer = ("Maybe");
                break;

            case 4 :
                answer = ("Ask again later.");
                break;
        }
        return answer;
    }

    public static int randomNum() {
        //make scanner and random number
        int max = 4;
        int min = 1;
        int Random = new Random().nextInt(max - min + 1) + min;
        return Random;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //call random and print out answer
        int Random = randomNum();
        //prompt for question
        System.out.println("What is your question?");
        String question = scan.nextLine();

        String answer = askQuestion(Random);

        //print out answer
        System.out.println(answer);

    }
}
