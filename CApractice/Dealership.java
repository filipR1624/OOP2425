// Author : Filip Raguz
// Date : 10th October
// Purpose : Practice for CA

package CApractice;

public class Dealership 
{
    private String name;
    private Address address;
    private static int dealId = 1000;
    private int currentDeal;
    private Car[] cars;
    private int currentCars = 0;

    public Dealership(String street, String city, String county, String name)
    {
        setAddress(street, city, county);
        setDealId(dealId);
        dealId++;
        setName(name);
        cars = new Car[3];
    }

    // setters
    private void setAddress(String street, String city, String county)
    {
        address = new Address(street, city, county);
    }

    private void setDealId(int n)
    {
        currentDeal = n;
    }

    private void setName(String n)
    {
        name = n;
    }

    public void setCar(Car c)
    {
        if (currentCars < 3)
        {
            cars[currentCars] = c;
            currentCars++;
        }
    }

    // getters
    public Address getAddress()
    {
        return address;
    }

    public int getId()
    {
        return currentDeal;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return name + ", " + address;
    }

    // to get current cars
    public int getCurrentCars()
    {
        return currentCars + 1;
    }
}
