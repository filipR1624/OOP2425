// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 26th September
// Purpose 			: Driver for BankCustomer

package lab3.Q2;

public class Driver2
{
    public static void main(String[] args)
    {
        BankCustomer customer = new BankCustomer("Filip", "The Street");
        
        SavingsAccount acc1 = new SavingsAccount(1000);
        SavingsAccount acc2 = new SavingsAccount(2000);
        SavingsAccount acc3 = new SavingsAccount(3000);

        customer.addAccount(acc1);
        customer.addAccount(acc2);
        customer.addAccount(acc3);

        System.out.println(customer.getName() + " has: " + customer.balance() + " moneyz");
    }
}
