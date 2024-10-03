// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 1st October
// Purpose 			: My implementation of Address

package lab4;

public class Address
{
    private String street;
    private String city;
    private String  county;

    // constructor
    public Address()
    {
        
    }

    public Address(String street, String city, String county)
    {
        setStreet(street);
        setCity(city);
        setCounty(county);
    }

    // setters
    public void setStreet(String street)
    {
        this.street =  street;
    }

    public void setCity(String city)
    {
        this.city =  city;
    }

    public void setCounty(String county)
    {
        this.county =  county;
    }

    // getters
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
        return "Address: " + street + ", " + city + ", " + county;
    }
}
