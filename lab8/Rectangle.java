package lab8;

public class Rectangle extends TwoDShape{
    private double width;
    private double length;

    public Rectangle(String name, String color, double x, double y) {
        super(name, color);
        width = x;
        length = y;
    }

    public double area() {
        return width * length;
    }
}
