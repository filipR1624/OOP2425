// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 1st October
// Purpose 			: My implementation of Employee
package lab4;

import java.util.Scanner;

public class Employee
{
    private static int currentEmployeeNo = 1000;
    private int employeeNo;
    private String employeeType;
    private String carType = null;
    private Address address;

    Scanner scan = new Scanner(System.in);

    //constructors

    public Employee(String type, Address address)
    {
        setEmployeeNo(currentEmployeeNo);
        currentEmployeeNo++;
        employeeType = type;
        if (type.equals("Manager"))
        {
            System.out.print("What car does he have: ");
            carType = scan.nextLine();
        }
        this.address = address;
    }

    //setters
    public void setEmployeeNo(int employeeNo)
    {
        this.employeeNo = employeeNo;
    }

    public void setEmployeeType(String type)
    {
        if ((type.equals("Staff")))
        {
            employeeType = type;
        }
        else if ((type.equals("Manager")))
        {
            employeeType = type;
            System.out.print("What car does he have: ");
            carType = scan.nextLine();
        }
        else
        {
            System.out.println("Invalid employee type");
        }
    }

    public void setCar(String car)
    {
        if (employeeType.equals("Manager"))
        {
            carType = car;
        }
        else
        {
            System.out.println("Employee is not a manager.");
        }
    }

    //getters
    public int getEmployeeNo()
    {
        return employeeNo;
    }

    public String getEmployeeType()
    {
        return employeeType;
    }

    public String getCar()
    {
        return carType;
    }

    public int numRecords()
    {
        return currentEmployeeNo - 1000;
    }

    public String toString()
    {
        return "Employee " + employeeNo + ": " + employeeType + ", " + address;
    }
}
