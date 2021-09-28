/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */
package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void firstNameChecker() {
        assertEquals(true, App.firstNameChecker("Nicholas"));
        assertEquals(false, App.firstNameChecker("N"));
    }

    @Test
    void lastNameChecker() {
        assertEquals(true, App.lastNameChecker("Smarsh"));
        assertEquals(false, App.lastNameChecker("S"));
    }

    @Test
    void zipCodeChecker() {
        assertEquals(true, App.zipCodeChecker("12345"));
        assertEquals(false, App.zipCodeChecker("1234"));
        assertEquals(false, App.zipCodeChecker("1234A"));
        assertEquals(false, App.zipCodeChecker("ABCDE"));
    }

    @Test
    void IDChecker() {
        assertEquals(true, App.IDChecker("NI-1234"));
        assertEquals(false, App.IDChecker("NI1234"));
        assertEquals(false, App.IDChecker("NI-123A"));
    }

    @Test
    void validateInput() {
        assertEquals(true, App.validateInput(true, true, true, true));
        assertEquals(false, App.validateInput(true, false, true, true));
    }
}