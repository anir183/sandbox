package d_0923.p15_accounts_abstract_class;

import java.util.Random;
import java.util.Scanner;

abstract class Accounts {
    double balance = 0;
    int accountNumber = 0;
    String accountHoldersName;
    String address;

    abstract void withdraw(Scanner sc);

    abstract void deposit(Scanner sc);

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("\tHolder Name: " + accountHoldersName);
        System.out.println("\tBalance: " + balance);
        System.out.println("\tAddress: " + address);
    }
}

public class SavingsAccount extends Accounts {
    double rateOfInterest = 0;

    void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        if (balance - amount < 1000) {
            System.out.println(
                    "Cannot withdraw!\n"
                            + "Insufficient funds, need to have a minimum or Rs.1,000 balance.");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawn Rs." + amount + " successfully.");
    }

    void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        int amount = sc.nextInt();

        if (balance + amount < 1000) {
            System.out.println(
                    "Your balance is below minimum requirements.\n"
                            + "Deposit enough funds with penalty!\n");
            deposit(sc);
            return;
        }

        System.out.print("Enter deposit time for interest (months): ");
        double years = sc.nextInt() / 12d;

        balance += amount + calculateAmount(amount, years, rateOfInterest);

        System.out.println("Deposited Rs. " + amount + " for " + years + " yrs.");
    }

    double calculateAmount(double amount, double years, double rateOfInterest) {
        // SI = (P * R * T / 100)
        return (amount * years * rateOfInterest) / 100d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingsAccount sa = new SavingsAccount();

        final int penaltyRate = 2;
        sa.accountNumber = new Random().nextInt(100000, 999999);
        sa.rateOfInterest = 7;

        System.out.println("Rate of Interest is: " + sa.rateOfInterest + "%");
        System.out.println("Domant Penalty is: " + penaltyRate + "%");
        System.out.println("New account number is: " + sa.accountNumber);

        System.out.println("\nCreate new Savings Account");
        System.out.print("\tEnter holder name: ");
        sa.accountHoldersName = sc.nextLine();
        System.out.print("\tEnter holder address: ");
        sa.address = sc.nextLine();
        System.out.print("\tEnter initial deposit (>= 1000): ");
        sa.balance = sc.nextInt();

        if (sa.balance < 1000) {
            System.out.println("\nCould not create account!\nNeed a minimum balance of Rs.1,000.");
            return;
        }

        System.out.println("\nTeller System:");
        System.out.println("   1) Withdraw");
        System.out.println("   2) Deposit");
        System.out.print("   3) Display");

        int i = 0, ch;
        while (i++ < 100) {
            System.out.print("\n> ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    sa.withdraw(sc);
                    break;
                case 2:
                    System.out.print("Enter time since last transaction (months): ");
                    double dormantYrs = sc.nextInt() / 12d;
                    double penalty = 0;

                    if (dormantYrs > 1) {
                        penalty = sa.calculateAmount(sa.balance, dormantYrs - 1, penaltyRate);
                        System.out.println(
                                "\nBANK\nUser account "
                                        + sa.accountNumber
                                        + " has been dormant for "
                                        + dormantYrs
                                        + " yrs.\nA penalty of 2% will apply!\n");
                        System.out.println("Deposit your amount with a penalty of Rs. " + penalty);
                        sa.balance -= penalty;
                    }

                    sa.deposit(sc);
                    break;
                case 3:
                    sa.display();
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    System.out.println("\nTeller System:");
                    System.out.println("   1) Withdraw");
                    System.out.print("   2) Deposit");
            }
        }
    }
}
