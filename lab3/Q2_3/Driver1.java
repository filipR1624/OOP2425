// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 26th September
// Purpose 			: Driver for SavingsAccount

package lab3.Q2_3;

public class Driver1
{
    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(4);

        System.out.println("Saver 1: " + saver1.calculateMonthlyInterest());
        System.out.println("Saver 2: " + saver2.calculateMonthlyInterest());

        SavingsAccount.modifyInterestRate(5);
        System.out.println();

        System.out.println("Saver 1: " + saver1.calculateMonthlyInterest());
        System.out.println("Saver 2: " + saver2.calculateMonthlyInterest());
    }
}
