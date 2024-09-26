// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 26th September
// Purpose 			: My implementation of SavingsAccount

package lab3.Q2;

public class SavingsAccount
{
    static private int accountNumber = 0;
    static private double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balance)
    {
        accountNumber = accountNumber + 1;
        savingsBalance = balance;
    }

    public double calculateMonthlyInterest()
    {
        double interest = (savingsBalance  * annualInterestRate) / 12;
        return savingsBalance += interest;
    }

    public static void modifyInterestRate(double rate)
    {
        annualInterestRate = rate / 100;
    }

    public double getBalance()
    {
        return savingsBalance;
    }
}
