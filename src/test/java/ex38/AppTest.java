/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package ex38;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void filterEvenNumbers() {
        //confirms whether the function can take in a string of numbers and...
        //will sort out the even numbers only.
        String numbers = "10 2 1 7 8 9 4 6";
        assertEquals(" 10 2 8 4 6", App.filterEvenNumbers(numbers));
    }
}