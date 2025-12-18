/*5. Create a class BankAccount with:
• Variables: accountNumber, accountHolder, balance
• Constructor to initialize details
• Methods: deposit(amount) and displayDetails()
🟢 Perform deposit and show updated balance */

import java.util.*;
class BankAccount{
    long accountNumber;
    String accountHolder;
    double balance;
    BankAccount(long accnum, String acchol, double bal){
        accountNumber= accnum;
        accountHolder= acchol;
        balance= bal;
    }
    void deposit(double amount){
        balance= balance + amount;
    }
    void displayDetails(){
        System.out.println("---Bank Account Details---");
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
public class BankAccountDemo{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long accnum;
        String acchol;
        double balance, amount;
        System.out.println("Enter the account number: ");
        accnum= sc.nextLong();
        System.out.println("Enter the account holder name: ");
        acchol= sc.next();
        System.out.println("Enter the account balance: ");
        balance= sc.nextDouble();
        System.out.println("Enter the amount to be deposited: ");
        amount= sc.nextDouble();
        BankAccount b= new BankAccount(accnum, acchol, balance);
        b.deposit(amount);
        b.displayDetails();
    }
}