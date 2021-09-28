/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */
package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void adder() {
        //first test case (same int 5 times)

        int number = 0;
        for(int i=0; i<5; i++) {
             number = App.adder(1, number);
        }
        assertEquals(5, number);

        //initialize number to 0 for 2nd test case
        number = 0;

        //2nd test (this time with a bunch of random numbers rather than the same int 5 times
        number = App.adder(3, number);
        number = App.adder(4, number);
        number = App.adder(5, number);
        number = App.adder(6, number);
        number = App.adder(7, number);

        assertEquals(25, number);
    }
}