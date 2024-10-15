// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 15th October
// Purpose 			: New attempt of employee

package lab4_attempt2;

import java.util.Scanner;

public class Employee 
{
    Scanner scan = new Scanner(System.in);

    private static int currentEmployee = 1000;
    private int employeeNo;
    private Address address;
    private String type;
    private String car = null;

    
    
    public Employee(Address address, String type)
    {
        // assign the static variable to employeeNo, then increment it
        employeeNo = currentEmployee;
        currentEmployee++;

        setAddress(address);
        setType(type);
    }

    // setters
    public void setAddress(Address a)
    {
        address = a;
    }

    public void setType(String t)
    {
        type = t;
        if (t.equals("manager"))
        {
            System.out.print("What car does he drive: ");
            car = scan.nextLine();
        }
    }

    // getters
    public int getEmployeeNo()
    {
        return employeeNo;
    }

    public Address getAddress()
    {
        return address;
    }

    public String getType()
    {
        if (car != null)
        {
            return type + ", drives a " + car;
        }
        else
        {
            return type;
        }
    }

    public String toString()
    {
        return employeeNo + ", " + type;
    }

    // return number of employee records
    public int getEmployeeRecords()
    {
        return currentEmployee - 1000;
    }
}
