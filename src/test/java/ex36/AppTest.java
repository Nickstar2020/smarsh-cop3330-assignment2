/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    ArrayList<Double> numbers = new ArrayList<>();

    public ArrayList<Double> getNumbers() {
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(10.0);
        return numbers;
    }

    @Test
    void average() {
        //ensure avg is accurate
        assertEquals(4, App.average(getNumbers()));
    }

    @Test
    void max() {
        //ensure max is accurate
        assertEquals(10.0, App.max(getNumbers()));
    }

    @Test
    void min() {
        //ensure min is accurate
        assertEquals(1, App.min(getNumbers()));
    }

    @Test
    void std() {
        //ensure inputs and std works as intended
        assertEquals(3.54, App.std(getNumbers()));

    }
}