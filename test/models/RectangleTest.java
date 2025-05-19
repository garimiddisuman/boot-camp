package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(2, rectangle.area(), "should return area of rect");

        Rectangle rectangle1 = new Rectangle(0, 1);
        assertEquals(0, rectangle1.area(), "should return zero If length is zero");

        Rectangle rectangle2 = new Rectangle(1, 0);
        assertEquals(0, rectangle2.area(), "should return zero if width is zero");
    }

    @Test
    void shouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(1, 1);
        assertEquals(4, rectangle.perimeter(), "should return perimeter");

        Rectangle rectangle1 = new Rectangle(0, 1);
        assertEquals(2, rectangle1.perimeter(), "should return double of width if length is zero");

        Rectangle rectangle2 = new Rectangle(1, 0);
        assertEquals(2, rectangle2.perimeter(), "should return double of length if the width is zero");
    }
}