package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldCalculateArea() {
        Square square = new Square(1);
        assertEquals(1, square.area(), "should calculate area");

        Square square1 = new Square(0.0);
        assertEquals(0, square1.area(), "should return zero if the side is zero");
    }

    @Test
    void shouldCalculatePerimeter() {
        Square square = new Square(2);
        assertEquals(8, square.perimeter());

        Square square1 = new Square(0);
        assertEquals(0, square1.area(), "should return zero if the side is zero");
    }
}