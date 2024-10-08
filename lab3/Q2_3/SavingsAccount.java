// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 26th September
// Purpose 			: My implementation of SavingsAccount

package lab3.Q2_3;

public class SavingsAccount
{
    private static int accountNumber = 0;
    private int currentAccount;
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balance)
    {
        accountNumber++;
        currentAccount = accountNumber;
        savingsBalance = balance;
    }

    public int getAccNo()
    {
        return currentAccount;
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
