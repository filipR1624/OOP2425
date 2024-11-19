package lab8;

import java.lang.Math;

public class Sphere extends ThreeDShape{
    private int radius;

    public Sphere(String name, String color, int x) {
        super(name, color);
        radius = x;
    }

    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double volume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }
}
