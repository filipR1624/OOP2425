package lab8;

public class Triangle extends TwoDShape{
    private double base;
    private double height;

    public Triangle(String name, String color, double a, double h) {
        super(name, color);
        base = a;
        height = h;
    }

    public double area() {
        return 0.5 * base * height;
    }
}
