package models;

import models.interfaces.ClosedShape;

public class Rectangle implements ClosedShape {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return width * length;
    }

    public int perimeter() {
        return 2 * (length + width);
    }
}
