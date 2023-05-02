
import java.util.Scanner;

public class Amtwhile {
    public static void main(String[] args) {
        // Pre-populated account numbers and pins
        String[] accountNumbers = {"123456789", "987654321"};
        String[] pins = {"1234", "4321"};
        double[] balances = {5000, 10000};

        Scanner scanner = new Scanner(System.in);

        boolean userAuthenticated = false;
        int authenticatedUserIndex = -1;
        while (!userAuthenticated) {
            // Ask user for ATM card number and PIN
            System.out.print("Enter ATM card number: ");
            String accountNumber = scanner.nextLine();
            System.out.print("Enter PIN: ");
            String pin = scanner.nextLine();

            // Validate user based on account number and PIN
            for (int i = 0; i < accountNumbers.length; i++) {
                if (accountNumber.equals(accountNumbers[i]) && pin.equals(pins[i])) {
                    userAuthenticated = true;
                    authenticatedUserIndex = i;
                    break;
                }
            }

            if (!userAuthenticated) {
                System.out.println("Invalid account number or PIN. Please try again.");
            }
        }

        // User is authenticated, show menu options
        boolean continueTransaction = true;
        while (continueTransaction) {
            System.out.println("\nMenu options:");
            System.out.println("1. View available balance");
            System.out.println("2. Withdraw amount");
            System.out.println("3. Deposit amount");
            System.out.println("4. View ministatement");
            System.out.println("5. Exit");

            System.out.print("Enter option number: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // View available balance
                    System.out.printf("Available balance: $%.2f\n", balances[authenticatedUserIndex]);
                    break;
                case 2:
                    // Withdraw amount
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balances[authenticatedUserIndex]) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balances[authenticatedUserIndex] -= withdrawAmount;
                        System.out.printf("Successfully withdrew $%.2f. Available balance: $%.2f\n",
                                withdrawAmount, balances[authenticatedUserIndex]);
                    }
                    break;
                case 3:
                    // Deposit amount
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    balances[authenticatedUserIndex] += depositAmount;
                    System.out.printf("Successfully deposited $%.2f. Available balance: $%.2f\n",
                            depositAmount, balances[authenticatedUserIndex]);
                    break;
                case 4:
                    // View ministatement
                    System.out.println("Ministatement:");
                    System.out.printf("Available balance: $%.2f\n", balances[authenticatedUserIndex]);
                    break;
                case 5:
                    // Exit
                    continueTransaction = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        System.out.println("Thank you for using our ATM.");
    }
}