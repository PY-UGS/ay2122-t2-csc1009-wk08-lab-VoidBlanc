package Question2;

import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String accountNumber;
        double withdrawAmount = 0;
        double depositAmount = 0;
        int option = 0;
        System.out.println("Enter your account number");
        accountNumber = in.nextLine();
        CheckingAccount checkAccount = new CheckingAccount(accountNumber);
        try {
            System.out.println("Enter the amount you want to deposit : ");
            depositAmount = in.nextDouble();
            checkAccount.deposit(depositAmount);
            try {
                System.out.println("Enter the amount you want to withdraw : ");
                withdrawAmount = in.nextDouble();

                checkAccount.withdraw(withdrawAmount);

                System.out.println("The balance after withdraw is: $" + checkAccount.getBalance());

            } catch (InsufficientFundsException e) {
                System.out.println(e + " : Sorry but your account is short by: $" + (withdrawAmount - checkAccount.getBalance()));
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e + " : Sorry deposit amount cannot be less than or equal to zero");
        }


    }
}
