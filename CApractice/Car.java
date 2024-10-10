// Author : Filip Raguz
// Date : 10th October
// Purpose : Practice for CA

package CApractice;

import java.util.Scanner;

public class Car 
{
    private static int saleNumber = 100; // to assign unique values (STATIC)
    private int currentSale; // sale number for each car
    private String make;
    private String model;
    private String engineSize;
    private double price;
    private String type;
    private String electricType = null;

    Scanner scan = new Scanner(System.in); // to get user input
    
    public Car(String make, String model, String engine, double price, String type)
    {
        setSaleNo(saleNumber);
        saleNumber++; // make sure to increment for each car, to have unique sale for each
        setMake(make);
        setModel(model);
        setEngine(engine);
        setPrice(price);
        setType(type);
    }

    // setters
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

    private void setEngine(String size)
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

    // getters
    public int getSaleNo()
    {
        return currentSale;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public String getEngineSize()
    {
        return engineSize;
    }

    public double getPrice()
    {
        return price;
    }

    public String getType()
    {
        if (type.equals("electric"))
        {
            return "Electric - " + electricType;
        }
        else
        {
            return type;
        }
    }

    public String toString()
    {
        if (type.equals("electric"))
        {
            return make + ", " + model + ", " + engineSize + ", " + electricType + " (saleNo: " + currentSale + ", price: " + price + ")";
        }
        else
        {
            return make + ", " + model + ", " + engineSize + ", " + type + " (saleNo: " + currentSale + ", price: " + price + ")";
        }
    }

    // to print car records
    public int getRecords()
    {
        return saleNumber - 100;
    }
}
