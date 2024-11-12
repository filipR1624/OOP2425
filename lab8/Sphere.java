package lab8;

import java.lang.Math;

public class Sphere extends Shape{
    private int radius;

    public Sphere(String name, String color, int x) {
        super(name, color);
        radius = x;
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }
}
