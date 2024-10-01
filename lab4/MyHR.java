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

    public void createNewRecord()
    {
        Employee employee = new Employee();
    }

    // list the offices
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

