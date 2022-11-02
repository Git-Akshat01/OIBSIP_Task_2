                                    // Atm Interface
                                    // Built Using- Language- Java, IDE- VSCODE.

// Libraries Needed for the projects.
import java.util.Scanner;
public class Atm                   // Parent Class Atm
{
    public static void machine()   // Method of Atm Class machine()
    { 
        int balance = 5000, debit, credit;   // 5000 is the account opening balance
        
        // Scanner class for taking input from user
        Scanner s = new Scanner(System.in);
        while(true)                 // The loop will run till the user press 4 for exiting from the menu
        {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("Hello! Welcome To Arnold Bank");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform: ");
            int n = s.nextInt();
            System.out.println("");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            switch(n)           // Switch case for the option entered in the menu
            {
                case 1:
                System.out.print("Enter money to be Withdraw: ");
                debit = s.nextInt();

                if(balance >= debit)
                {
                    balance = balance - debit;
                    System.out.println("Please collect your money..................");
                }
                else
                {
                    System.out.println("******** Insufficient Balance ********");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be Deposit: ");
                credit = s.nextInt();
                balance = balance + credit;
                System.out.println("Your Money has been successfully deposited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.out.println("Thank You For Using Our Services. Have A Nice Day.");
                System.exit(0);
            }
        }
    }

    public static void main(String args[])
    {
        machine();
    }
}