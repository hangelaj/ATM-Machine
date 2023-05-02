import java.util.Scanner;
public class OOPATM {


    private String atmCardNumber;
    private String pinNumber;
    private double availableBalance;

    public OOPATM(String atmCardNumber, String pinNumber, double availableBalance) {
        this.atmCardNumber = atmCardNumber;
        this.pinNumber = pinNumber;
        this.availableBalance = availableBalance;
    }

    public boolean validateUser(String enteredAtmCardNumber, String enteredPinNumber) {
        return enteredAtmCardNumber.equals(atmCardNumber) && enteredPinNumber.equals(pinNumber);
    }

    public void viewAvailableBalance() {
        System.out.println("Your available balance is: " + availableBalance);
    }

    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount <= availableBalance) {
            availableBalance -= withdrawAmount;
            System.out.println("Amount withdrawn successfully!");
            System.out.println("Your available balance is: " + availableBalance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void depositAmount(double depositAmount) {
        availableBalance += depositAmount;
        System.out.println("Amount deposited successfully!");
        System.out.println("Your available balance is: " + availableBalance);
    }

    public void viewMinistatement() {
        System.out.println("Your recent transactions:");
        // Implement code to display the mini statement
    }

    public static void main(String[] args) {
        OOPATM atm = new OOPATM("123456789", "1234", 10000.0);
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their ATM card number and PIN number
        System.out.print("Enter your ATM card number: ");
        String enteredAtmCardNumber = scanner.next();
        System.out.print("Enter your PIN number: ");
        String enteredPinNumber = scanner.next();

        // Validate the user
        if (atm.validateUser(enteredAtmCardNumber, enteredPinNumber)) {
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
                    atm.viewAvailableBalance();
                    break;
                case 2:
                    // Withdraw Amount
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdrawAmount(withdrawAmount);
                    break;
                case 3:
                    // Deposit Amount
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.depositAmount(depositAmount);
                    break;
                case 4:
                    // View Ministatement
                    atm.viewMinistatement();
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