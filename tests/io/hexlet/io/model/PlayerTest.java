package io.hexlet.io.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testGetName() throws Exception {

        final String inputValue = "Alex";
        final String expectedValue = inputValue;

        final Player player = new Player(inputValue, null);
        final String actualValue = player.getName();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetFigure() throws Exception {

        final Figure inputValue = Figure.O;
        final Figure expectedValue = inputValue;

        final Player player = new Player(null, Figure.O);
        final Figure actualValue = player.getFigure();

        assertEquals(expectedValue, actualValue);

    }
}