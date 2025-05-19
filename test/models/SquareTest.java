package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldCalculateArea() {
        Square square = new Square(1);
        assertEquals(1, square.area());
    }

    @Test
    void shouldCalculatePerimeter() {
        Square square = new Square(2);
        assertEquals(8, square.perimeter());
    }
}