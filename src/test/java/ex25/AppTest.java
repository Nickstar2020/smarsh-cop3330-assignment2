/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */
package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void passwordValidator() {
        //ensure that these strings return the correct int
        assertEquals(1, App.passwordValidator("12345"));
        assertEquals(2, App.passwordValidator("test"));
        assertEquals(3, App.passwordValidator("testing123"));
        assertEquals(4, App.passwordValidator("Testing1234%$"));
    }
}