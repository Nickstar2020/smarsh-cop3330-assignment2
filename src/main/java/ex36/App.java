/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex36;
import java.util.Scanner;
import java.util.regex.*;
import java.util.ArrayList;

public class App {
    //funcs for each computation
    public static double average(ArrayList<Double> numbers) {
        double averageNum = 0;
        int size = numbers.size();

        for (Double number : numbers) averageNum += number;

        averageNum = averageNum / size;

        return averageNum;
    }

    public static double max(ArrayList<Double> numbers) {
        double maximum;
        int size = numbers.size();

        maximum = numbers.get(0);

        for(int i=1;i<size; i++)
            if(numbers.get(i) > maximum) maximum = numbers.get(i);

        return maximum;
    }

    public static double min(ArrayList<Double> numbers) {
        double minimum;
        int size = numbers.size();

        minimum = numbers.get(0);

        for(int i=1;i<size; i++)
            if(numbers.get(i) < minimum) minimum = numbers.get(i);

        return minimum;
    }

    public static double std(ArrayList<Double> numbers) {
        double standardDeviation = 0;
        int size = numbers.size();
        double mean = 0;

        for (Double aDouble : numbers) mean += aDouble;
        mean = mean / size;

        for (Double number : numbers) standardDeviation += Math.pow((number - mean), 2);

        double sq = standardDeviation / size;

        return Math.sqrt(sq);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        double inputNum;

        //create double arrayList
        ArrayList<Double> numbers = new ArrayList<>();

        //create pattern that accepts numbers and "done"
        Pattern p = Pattern.compile("^\\d+$");

        //ask for inputs until user enters "done"
        do {
            System.out.println("Enter a number:");
            input = scan.nextLine();
            Matcher m = p.matcher(input);
            //check and see if input is valid
            if(m.find()) {
                inputNum = Double.parseDouble(input);
                numbers.add(inputNum);
            } else if(!input.equals("done")){
                System.out.println("Incorrect input. please use numbers only, or type 'done' if you are done");
            }

        } while(!input.equals("done"));

        //once done, grab all the numbers and do math for all of them in all the functions
        double avg = average(numbers);
        double min = min(numbers);
        double max = max(numbers);
        double std = std(numbers);

        //print all the answers
        System.out.println("The Average is " + String.format("%.1f", avg));
        System.out.println("The Minimum is " + min);
        System.out.println("The Maximum is " + max);
        System.out.println("The Standard Deviation is " + String.format("%.2f", std));

    }
}
