// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 1st October
// Purpose 			: Driver for MyHR
package lab4;

import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        MyHR test = new MyHR();

        Address a1 = new Address("1AAA", "BBB", "CCC");
        Address a2 = new Address("2AAA", "BBB", "CCC");
        Address a3 = new Address("3AAA", "BBB", "CCC");
        Address a4 = new Address("4AAA", "BBB", "CCC");
        Address a5 = new Address("5AAA", "BBB", "CCC");
        Address a6 = new Address("6AAA", "BBB", "CCC");

        test.createNewRecord("Manager", a1);
        test.createNewRecord("Staff", a2);
        test.createNewRecord("Manager", a3);
        test.createNewRecord("Staff", a4);
        test.createNewRecord("Manager", a5);
        test.createNewRecord("Staff", a6);
        System.out.println();

        System.out.println("Current offices:");
        System.out.println(test);

        System.out.print("Select office (to list employees): ");
        System.out.println(test.getOfficeDetails(scan.nextInt()));
        scan.close();      
    }
}
