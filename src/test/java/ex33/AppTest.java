/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */
package ex33;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void askQuestion() {

        assertEquals("Yes", App.askQuestion(1));
        assertEquals("No", App.askQuestion(2));
        assertEquals("Maybe", App.askQuestion(3));
        assertEquals("Ask again later.", App.askQuestion(4));
    }
}