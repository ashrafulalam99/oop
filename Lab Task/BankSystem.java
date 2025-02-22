import java.util.Scanner;

class BankAccount
{
    private String accountHolder;
    private final String accountNumber;
    public static int acccountCounter = 0;
    private String accountType;
    private double Balance;

    public BankAccount(String accountHolder, String accountType, double firstDeposit)
    {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.Balance = firstDeposit;
        this.accountNumber = "AC" + (1000 + acccountCounter);
        acccountCounter++;
    }

    public void Deposit(double amount)
    {
        Balance += amount;
        System.out.println("\nYour current balance is BDT " + Balance);
    }

    public void Withdraw(double amount, String withdrawalProcess)
    {
        if(amount <= Balance) 
        {
            Balance -= amount;
            System.out.println("\nBDT " + amount + " is successfully withdrawn.");
        }

        else System.out.println("\nSorry, Insufficient balance");
    }

    public void displayInfo()
    {
        System.out.println("\nAccount Details:");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: BDT " + Balance);
    }
}

public class BankSystem
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Account Holder Name: ");
        String holderName = scan.nextLine();

        System.out.println("Enter Account Type (Savings/Checking): ");
        String accType = scan.nextLine();

        System.out.print("Enter Initial Deposit Amount: ");
        double initialDeposit = scan.nextDouble();

        BankAccount userAccount = new BankAccount(holderName, accType, initialDeposit);
        userAccount.displayInfo();

        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = scan.nextDouble();
        userAccount.Deposit(depositAmount);
        userAccount.displayInfo();

        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmount = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter withdrawal type (ATM/Cheque): ");
        String withdrawalType = scan.nextLine();
        userAccount.Withdraw(withdrawAmount, withdrawalType);
        userAccount.displayInfo();

        // Display total accounts created
        System.out.println("\nTotal Accounts Created: " + acccountCounter);

        scan.close(); // Close scan
    }
}
