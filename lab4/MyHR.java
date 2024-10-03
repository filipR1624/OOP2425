// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 1st October
// Purpose 			: My implementation of MyHR

package lab4;

public class MyHR
{
    private Office[] offices;

    public MyHR()
    {
        offices = new Office[3];
        for (int i = 0; i < 3; i++)
        {
            offices[i] = new Office();
        }
    }

    // Option 2: create new employee record
    public void createNewRecord(String type, Address address)
    {
        Employee employee = new Employee(type, address);
        int i = 0;

        while (i < 3)
        {
            if (offices[i].getEmployees() < 2)
            {
                offices[i].setEmployee(employee);
            }
            else
            {
                i++;
            }
        }
    }

    public Office officeEmployees(int officeNo)
    {
        return offices[officeNo - 1];
    }

    // Option 1: list all offices
    public String toString()
    {
        String theString = "";
        for (int i = 0; i < 3; i++)
        {
            theString += "Office " + (i + 1) + ": " + offices[i].getRoomNo() + "\n";
        }
        return theString;
    }
}

