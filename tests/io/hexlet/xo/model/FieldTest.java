package io.hexlet.xo.model;

import java.awt.*;

import io.hexlet.xo.model.exceptions.InvalidPointException;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void testGetSize() throws Exception {
        final Field field = new Field(3);

        assertEquals(3, field.getSize());
    }

    @Test
    public void testSetFigure() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.X;

        field.setFigure(inputPoint, inputFigure);
        final Figure actualFigure = field.getFigure(inputPoint);

        assertEquals(inputFigure, actualFigure);
    }

    @Test
    public void testGetFigureWhenFigureNotSet() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0, 0);

        final Figure actualFigure = field.getFigure(inputPoint);

        assertNull(actualFigure);
    }

    @Test
    public void testGetFigureWhenXIsLessThanZero() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(-1, 0);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {}
    }

    @Test
    public void testGetFigureWhenYIsLessThanZero() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0, -1);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {}
    }

    @Test
    public void testGetFigureWhenXIsMoreThanZero() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(field.getSize() + 1, 0);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {}
    }

    @Test
    public void testGetFigureWhenYIsMoreThanZero() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0, field.getSize() + 1);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {}
    }
}