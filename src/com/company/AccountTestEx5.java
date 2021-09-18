//ex5
package com.company;

import java.util.Scanner;

public class AccountTestEx5 {
    public static void displayAccount(AccountEx5 accountToDisplay){
        System.out.printf("Account name: %s%nBalance: %f%n%n",
                accountToDisplay.getName(), accountToDisplay.getBalance());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AccountEx5 acc3 = new AccountEx5("Arthur Morgan", 50.00);
        AccountEx5 acc4 = new AccountEx5("John Marston", -7.53);

        displayAccount(acc3);
        displayAccount(acc4);
        System.out.println("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account balance%n%n",
                depositAmount);
        acc3.deposit(depositAmount);

        System.out.println("Enter amount for withdraw for account1:");
        double withdrawAmount = input.nextDouble();
        if(withdrawAmount <= acc3.getBalance()){
            acc3.withdraw(withdrawAmount);
            System.out.println("\n Successful withdraw");
        }
        else
            System.out.println("Withdraw amount exceeded account balance");

        System.out.println("Enter amount for withdraw for account2:");
        withdrawAmount = input.nextDouble();
        if(withdrawAmount <= acc4.getBalance()){
            acc4.withdraw(withdrawAmount);
            System.out.println("\nSuccessful withdraw");
        }
        else
            System.out.println("Withdraw amount exceeded account balance");

        displayAccount(acc3);
        displayAccount(acc4);
    }
}
