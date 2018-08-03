package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void add() {
        assertEquals(3, Main.add(2, 1));
    }
}