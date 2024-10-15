// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 15th October
// Purpose 			: New attempt of office

package lab4_attempt2;

public class Office 
{
    // office variables
    private static int currentOffice = 100;
    private int officeNo;

    // employee variables
    private Employee[] employees;
    private final int MAX_EMPLOYEES = 2;
    private int currentEmployees;

    public Office()
    {
        // assigning the static variable to officeNo, then incrementing it
        officeNo = currentOffice;
        currentOffice++;

        // constructing an array for employees
        employees = new Employee[MAX_EMPLOYEES];
        currentEmployees = 0; // after creating office, there are no workers in it
    }

    // setters
    public void setEmployee(Employee e)
    {
        if (currentEmployees < 3)
        {
            employees[currentEmployees] = e;
            currentEmployees++;
        }
    }


    // getters
    public int getOfficeNo()
    {
        return officeNo;
    }

    public String toString()
    {
        return officeNo + ", it has " + currentEmployees + " employees";
    }

    // returns number of employees
    public int getNoEmployees()
    {
        return currentEmployees;
    }
}
