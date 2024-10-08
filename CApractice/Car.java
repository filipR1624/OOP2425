package CApractice;

import java.util.Scanner;

public class Car 
{
    private static int saleNumber = 100; // to assign unique values (STATIC)
    private int currentSale; // sale number for each car
    private String make;
    private String model;
    private int engineSize;
    private double price;
    private String type;
    private String electricType = null;

    Scanner scan = new Scanner(System.in); // to get user input
    
    public Car(String make, String model, int size, double price, String type)
    {
        setSaleNo(saleNumber);
        saleNumber++; // make sure to increment for each car, to have unique sale for each
        setMake(make);
        setModel(model);
        setEngine(size);
        setPrice(price);
        setType(type);
    }

    private void setSaleNo(int n)
    {
        currentSale = n;
    }

    private void setMake(String m)
    {
        make = m;
    }

    private void setModel(String mod)
    {
        model = mod;
    }

    private void setEngine(int size)
    {
        engineSize = size;
    }

    private void setPrice(double p)
    {
        price = p;
    }

    private void setType(String t)
    {
        type = t;
        if (t.equals("electric"))
        {
            System.out.print("What kind of electric: ");
            electricType = scan.nextLine();
        }
    }
}
