
import java.util.Scanner;

public class ATM {
    int balance = 50000;
    int pin = 2345;

    public void changePin(int newPin) {
        pin = newPin;
        System.out.println("Your PIN has been changed successfully.");
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    public void withdrawCash(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Please collect your cash.");
            System.out.println("Your new balance is: " + balance);
        } else {
            System.out.println("Insufficient ");
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your PIN:");
            int inputPin = scanner.nextInt();

            if (inputPin == atm.pin) {
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Cash");
                System.out.println("3. Change PIN");
                System.out.println("4. Exit");

                System.out.println("Enter your choice:");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        atm.checkBalance();
                        break;
                    case 2:
                        System.out.println("Enter the amount to withdraw:");
                        int amount = scanner.nextInt();
                        atm.withdrawCash(amount);
                        break;
                    case 3:
                        System.out.println("Enter your new PIN:");
                        int newPin = scanner.nextInt();
                        atm.changePin(newPin);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } else {
                System.out.println("Invalid PIN. Please try again.");
            }
        }
    }
}