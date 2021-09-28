/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Smarsh
 */
package ex37;

import static org.hamcrest.CoreMatchers.*;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void shufflePassword() {
        //ensure that the function is able to shuffle the password
        String notShuffledPassword = "thisisatest123";
        String shuffledPassword = App.shufflePassword(notShuffledPassword);

        System.out.println(shuffledPassword);

        MatcherAssert.assertThat(shuffledPassword, is(not(notShuffledPassword)));
    }
}