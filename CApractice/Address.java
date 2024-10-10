// Author : Filip Raguz
// Date : 10th October
// Purpose : Practice for CA

package CApractice;

public class Address 
{
    private String street;
    private String city;
    private String county;

    public Address(String street, String city, String county)
    {
        setStreet(street);
        setCity(city);
        setCounty(county);
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setCounty(String county)
    {
        this.county = county;
    }

    public String getStreet()
    {
        return street;
    }

    public String getCity()
    {
        return city;
    }

    public String getCounty()
    {
        return county;
    }

    public String toString()
    {
        return street + ", " + city + ", " + county;
    }
}
