// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 24th September
// Purpose 			: My implementation of Rectangle

class Rectangle
{
    private double length;
    private double width;

    public Rectangle()
    {
        length = 1;
        width = 1;
    }

    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }

    public void setLength(double num)
    {
        if ((num > 0.0) && (num <= 40.0))
        {
            length = num;
        }
        else
        {
            System.out.println("invalid length");
        }
        
    }

    public void setWidth(double num)
    {
        if ((num > 0.0) && (num <= 40.0))
        {
            length = num;
        }
        else
        {
            System.out.println("invalid width");
        }
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public String toString()
    {
        return "Length = " + length + ", Width = " + width;
    }

    // Q2
    public double getArea()
    {
        return length * width;
    }

    public double getPerimiter()
    {
        return (length * 2) + (width * 2);
    }

    public void printRectangle()
    {
        for (int i = 0; i < length; i++)
        {
            if ((i == 0) || (i == length - 1))
            {
                for (int j = 0; j < width; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else
            {
                System.out.print("*");
                for (int k = 1; k < width - 1; k++)
                {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}