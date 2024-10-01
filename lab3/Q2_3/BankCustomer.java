// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 26th September
// Purpose 			: My implementation of BankCustomer

package lab3.Q2_3;

public class BankCustomer
{
    private String name;
    private String address;
    private SavingsAccount[] accounts;
    private int noAccounts = 0;

    public BankCustomer(String name, String address)
    {
        this.name = name;
        this.address = address;
        accounts = new SavingsAccount[3];
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public void addAccount(SavingsAccount account)
    {
        if (noAccounts < 3)
        {
            accounts[noAccounts] = account;
            noAccounts++;
        }
        
    }

    public double balance()
    {
        double balance = 0;
        for (int i = 0; i < noAccounts; i++)
        {
            balance += accounts[i].getBalance();
        }
        return balance;
    }

    public String toString()
    {
        String theString = "";
        for (int i = 0; i < noAccounts; i++)
        {
            theString += "Account " + (i + 1) + " Balance: " + accounts[i].getBalance() + "\n";
        }
        return theString;
    }

}
