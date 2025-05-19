package models;

import models.interfaces.Polygon;

public class Rectangle implements Polygon {
    private final int length;
    private final int width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return width * length;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}
