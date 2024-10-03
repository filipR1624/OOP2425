// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 1st October
// Purpose 			: My implementation of Office

package lab4;

public class Office
{
    private static int currentRoom = 100;
    private int roomNo;
    private Employee[] employees;
    private int currentEmployees = 0;

    public Office()
    {
        setRoomNo(currentRoom);
        currentRoom++;
        employees = new Employee[2];
    }

    private void setRoomNo(int num) //private because the room number is automatic
    {
        roomNo = num;
    }

    public void addEmployee(Employee employee)
    {
        if (currentEmployees < 2)
        {
            employees[currentEmployees] = employee;
            currentEmployees++;
        }
    }

    public int getRoomNo()
    {
        return roomNo;
    }

    // returns current number of employees
    public int getEmployees()
    {
        return currentEmployees;
    }

    // returns current employees in this office
    public String toString()
    {
        String workers = "";
        for (int i = 0; i < currentEmployees; i++)
        {
            workers += employees[i] + "\n";
        }
        return workers;
    }
}
