package lab8;

import java.lang.Math;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, String color, double rad) {
        super(name, color);
        radius = rad;
    }

    public double area() {
        return Math.PI * radius * 2;
    }

    public String toString() {
        return 
    }
}
