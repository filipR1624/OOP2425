// Author : Filip Raguz
// Date : 8th October
// Purpose : My implementation of Point (lab5)

package lab5;

public class Point 
{
    protected int x;
    protected int y;

    public Point()
    {
        x = 0;
        y = 0;
    }

    public Point(int x, int y)
    {
        setX(x);
        setY(y);
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }

    public String toString()
    {
        return "X: " + x + "\nY: " + y;
    }
}
