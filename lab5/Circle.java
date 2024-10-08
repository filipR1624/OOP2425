// Author : Filip Raguz
// Date : 8th October
// Purpose : My implementation of Circle (lab5)

package lab5;

public class Circle extends Point
{
    private int radius;

    public Circle()
    {
        x = 0;
        y = 0;
        radius = 0;
    }

    public Circle(int x, int y, int rad)
    {
        setX(x);
        setY(y);
        setRadius(rad);
    }

    public void setRadius(int rad)
    {
        radius = rad;
    }

    public double getRadius()
    {
        return radius;
    }

    public String toString()
    {
        return "X: " + x + "\nY: " + y + "\nRadius: " + radius;
    }
}
