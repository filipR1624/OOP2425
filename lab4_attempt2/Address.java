// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 15th October
// Purpose 			: New attempt of address

package lab4_attempt2;

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

    // setters
    private void setStreet(String s)
    {
        street = s;
    }

    private void setCity(String ci)
    {
        city = ci;
    }

    private void setCounty(String co)
    {
        county = co;
    }

    //getters
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