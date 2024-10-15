// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 15th October
// Purpose 			: New attempt of MyHR

package lab4_attempt2;

import java.util.Scanner;

public class MyHR 
{
    public String listOffices(Office[] o)
    {
        String s = "";

        for (int i = 0; i < 3; i++)
        {
            s += "Office " + (i + 1) + " " + o[i].toString() + "\n";
        }

        return s;
    }

    public void createEmployee(Address a, String type)
    {
        
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        MyHR hr = new MyHR();

        int choice;
        int noEmployees = 0;

        // initialise 3 offices
        Office[] offices = new Office[3];
        for (int i = 0; i < 3; i++)
        {
            offices[i] = new Office();
        }
        
        do
        {
            System.out.print("1. List offices\n2. Create employee record\n3. List all employees\n4. Quit\nChoice: ");
            choice = scan.nextInt();

            if (choice == 1)
            {
                System.out.println("New employee");
                System.out.print("Street: ");
                String street = scan.nextLine();
                System.out.print("City: ");
                String city = scan.nextLine();
                System.out.print("County: ");
                String county = scan.nextLine();

                // construct new address
                Address a = new Address(street, city, county);

                String type;
                System.out.print("Type: ");
                type = scan.nextLine();

                hr.createEmployee(a, type);
                noEmployees++;
            }
            else if (noEmployees == 5)
            {
                System.out.println("Max employee records reached.");
                break;
            }
        } while (choice != 4);
    }    
}
