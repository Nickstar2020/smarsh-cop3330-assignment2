/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */
package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void validInput() {
        //ensure that the inputs for the table generator are valid
        //if they are valid then the numbers on the table will print out correctly
        assertEquals(true, App.validInput("20"));
        assertEquals(false, App.validInput("test"));
    }
}