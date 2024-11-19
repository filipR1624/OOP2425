package lab8;

import java.lang.Math;

public class Cylinder extends ThreeDShape {
    private int radius;
    private int height;

    public Cylinder(String name, String color, int x, int y) {
        super(name, color);
        radius = x;
        height = y;
    }

    public double area() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
