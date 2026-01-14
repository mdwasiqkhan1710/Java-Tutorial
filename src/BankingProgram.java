//Banking Program - to demonstrate and practice *** METHODS **** in Java

import java.util.Scanner;

public class BankingProgram {

    //Creating Scanner with "Class scope"
    static Scanner sc = new Scanner(System.in);

    //Method to show the balance
    static void showBalance(double balance){
        System.out.printf("Your available account balance is: $%.2f", balance);
    };

    //Method to deposit the balance
    static double deposit(double balance){
        double amount;
        System.out.print("Enter the amount you want to deposit: ");
        amount = sc.nextDouble();

        if(amount < 0){
            System.out.println("Amount can not be negative!");
        }else{
            balance += amount;
        }
        return balance;
    };

    //Method to withdraw the balance
    static double withdraw(double balance){
        System.out.print("Enter the amount you wish to withdraw: ");
        double withdrawnAmount = sc.nextDouble();

        if(withdrawnAmount > balance){
            System.out.println("You don't have sufficient balance in your account.");
        }else{
            balance -= withdrawnAmount;
        }
        return balance;
    }

    public static void main(String[] args){

        boolean isRunning = true; //variable to check if program is running or not
        double balance = 50.70; //variable for showing total balance
        String choice; //choice customer made i.e; to check balance, to withdraw& etc.

        while(isRunning){
            System.out.println("*****************************************");
            System.out.println("NATIONAL BANK ONLINE SERVICES\n");
            System.out.println("*****************************************");
            System.out.println("Available Options!");
            System.out.println("1. Type 'Check' to check the balance.");
            System.out.println("2. Type 'Deposit' to deposit money.");
            System.out.println("3. Type 'Withdraw' to withdraw the money.");
            System.out.println("4. Type 'Exit' to cancel/complete the transaction.\n");
            System.out.println("*****************************************");

            System.out.print("Type your option: ");
            choice = sc.next().toUpperCase();

            switch(choice){
                case "CHECK" -> {
                    showBalance(balance);
                    isRunning = false;
                }
                case "DEPOSIT" -> {
                    double totalBalance = deposit(balance);

                    System.out.println("Type 'Yes' to check final balance else type 'No'.");
                    System.out.print("Yes/No: ");
                    String finalCall = sc.next().toUpperCase();

                    if(finalCall.equals("YES")){
                        System.out.printf("Your final balance now is: $%.2f", totalBalance);
                    }else{
                        System.out.println("Thank you for using our services!");
                    }
                    isRunning = false;
                }
                case "WITHDRAW" -> {
                    double totalBalance = withdraw(balance);

                    System.out.println("Type 'Yes' to check available balance else type 'No'.");
                    System.out.print("Yes/No: ");
                    String finalCall = sc.next().toUpperCase();

                    if(finalCall.equals("YES")){
                        System.out.printf("Your final balance now is: $%.2f", totalBalance);
                    }else{
                        System.out.println("Thank you for using our services!");
                    }
                    isRunning = false;
                }
                case "EXIT" -> {
                    isRunning = false;
                    System.out.println("Transaction cancelled or completed!!");
                }
                default -> System.out.println("Invalid input, type either Check, Deposit, Withdraw or Exit!");
            }
        }

        sc.close();
    }
}
