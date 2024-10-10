package CApractice;

import java.util.Scanner;

public class MyDealership 
{
    private final int MAX_DEAL = 5;
    private final int MAX_CARS = 10;
    private Dealership[] dealerships;
    private int noCars = 0;
    
    
    private Scanner scan = new Scanner(System.in);

    public MyDealership()
    {
        dealerships = new Dealership[MAX_DEAL];
        for (int i = 0; i < MAX_DEAL; i++)
        {
            String street;
            String city;
            String county;
            String name;

            System.out.println("Dealership " + (i + 1));
            System.out.print("Street: ");
            street = scan.nextLine();
            System.out.print("City: ");
            city = scan.nextLine();
            System.out.print("County: ");
            county = scan.nextLine();
            System.out.print("Name: ");
            name = scan.nextLine();

            dealerships[i] = new Dealership(street, city, county, name);
        }
    }

    public String toString()
    {
        String s = "\nDealerships:\n";
        for (int i = 0; i < MAX_DEAL; i++)
        {
            s += dealerships[i].toString() + "\n";
        }
        return s;
    }

    public void createRecord()
    {
        if (noCars < MAX_CARS)
        {
            String make;
            String model;
            String engineSize;
            double price;
            String type;
            String electricType = null;

            System.out.println("Car " + noCars + 1);
            System.out.print("Make: ");
            make = scan.nextLine();
            System.out.print("Model: ");
            model = scan.nextLine();
            System.out.print("Engine: ");
            engineSize = scan.nextLine();
            System.out.print("Price: ");
            price = scan.nextDouble();
            System.out.print("Type: ");
            type = scan.nextLine();
            if (type.equals("electric"))
            {
                System.out.print("Electric type: ");
                electricType = scan.nextLine();
            }

            Car c = new Car(make, model, engineSize, price, type);

            for (int i = 0; i < MAX_DEAL; i++)
            {
                if (dealerships[i].getCurrentCars() < 3)
                {
                    dealerships[i].setCar(c);
                    break;
                }
            }

            noCars++;
        }
    }
}
