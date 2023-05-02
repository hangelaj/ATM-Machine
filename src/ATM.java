import java.util.Scanner;

public class ATM {

    // Sample user details
    private static final String VALID_ATM_CARD_NUMBER = "123456789";
    private static final String VALID_PIN_NUMBER = "1234";
    private static double AVAILABLE_BALANCE = 10000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their ATM card number and PIN number
        System.out.print("Enter your ATM card number: ");
        String atmCardNumber = scanner.next();
        System.out.print("Enter your PIN number: ");
        String pinNumber = scanner.next();

        // Validate the user
        if (atmCardNumber.equals(VALID_ATM_CARD_NUMBER) && pinNumber.equals(VALID_PIN_NUMBER)) {
            System.out.println("Valid user!");

            // Display the available options to the user
            System.out.println("Choose an option:");
            System.out.println("1. View Available Balance");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Deposit Amount");
            System.out.println("4. View Ministatement");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            // Process the user's choice
            switch (choice) {
                case 1:
                    // View Available Balance
                    System.out.println("Your available balance is: " + AVAILABLE_BALANCE);
                    break;
                case 2:
                    // Withdraw Amount
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount <= AVAILABLE_BALANCE) {
                        AVAILABLE_BALANCE -= withdrawAmount;
                        System.out.println("Amount withdrawn successfully!");
                        System.out.println("Your available balance is: " + AVAILABLE_BALANCE);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                case 3:
                    // Deposit Amount
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    AVAILABLE_BALANCE += depositAmount;
                    System.out.println("Amount deposited successfully!");
                    System.out.println("Your available balance is: " + AVAILABLE_BALANCE);
                    break;
                case 4:
                    // View Ministatement
                    System.out.println("Your recent transactions:");
                    // Implement code to display the mini statement
                    break;
                case 5:
                    // Exit
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

        } else {
            System.out.println("Invalid user!");
        }

        scanner.close();
    }

}