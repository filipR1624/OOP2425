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
    private String carType;

    Scanner scan = new Scanner(System.in);

    public Employee(String type)
    {
        setEmployeeNo(currentEmployeeNo);
        currentEmployeeNo++;
        employeeType = type;
        if ((type.equals("Manager")) || (type.equals("manager")))
        {
            System.out.print("What kind of car does he have: ");
            carType = scan.nextLine();
        }
    }

    public void setEmployeeNo(int employeeNo)
    {
        this.employeeNo = employeeNo;
    }

    public int getEmployeeNo()
    {
        return employeeNo;
    }
}
