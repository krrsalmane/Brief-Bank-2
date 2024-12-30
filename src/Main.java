import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("\n --- Main Menu --- ");
            System.out.println("1. Manage Client");
            System.out.println("2. Manage Account");
            System.out.println("3. Manage Operations");
            System.out.println("4. Manage Filtering ");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    int clientChoice;
                    do {
                        System.out.println("\n ======= Client Menu ======");
                        System.out.println("1-Add Client");
                        System.out.println("2-Display Client");
                        System.out.println("3-Back to Main Menu");
                        System.out.print("Enter the choice: ");
                        clientChoice = sc.nextInt();


                        switch (clientChoice) {
                            case 1:
                                Client.Add();
                                break;
                            case 2:
                                Client.Display();
                                break;
                            case 3:
                                break; // Go back to the main menu
                            default:
                                System.out.println("Invalid choice!");
                        }
                    } while (clientChoice != 3);
                    break;


                case 2:
                    int accountChoice;
                    do {
                        System.out.println("\n ======= Manage Account ======");
                        System.out.println("1-Add Account");
                        System.out.println("2-Display Account");
                        System.out.println("3-Back to Main Menu");
                        System.out.print("Enter the choice: ");
                        accountChoice = sc.nextInt();


                        switch (accountChoice) {
                            case 1:
                                Account.Create_account();
                                break;
                            case 2:
                                Account.displayAccounts();
                                break;
                            case 3:
                                break; // Go back to the main menu
                            default:
                                System.out.println("Invalid choice!");
                        }
                    } while (accountChoice != 3);
                    break;


                case 3:
                    if (CurrentAccount.currentAccounts.isEmpty()) {
                        System.out.println("No Current Accounts available. Please create an account first.");
                        break;
                    }


                    Account account = CurrentAccount.currentAccounts.get(0); // Example account
                    int operationChoice;
                    do {
                        System.out.println("\n==== Banking Operations ====");
                        System.out.println("1. Deposit");
                        System.out.println("2. Withdraw");
                        System.out.println("3. View Transaction History");
                        System.out.println("4. Back to Main Menu");
                        System.out.print("Enter the choice: ");
                        operationChoice = sc.nextInt();


                        switch (operationChoice) {
                            case 1:
                                System.out.print("Enter deposit amount: ");
                                double depositAmount = sc.nextDouble();
                                Operations.deposit(account, depositAmount);
                                break;


                            case 2:
                                System.out.print("Enter withdrawal amount: ");
                                double withdrawAmount = sc.nextDouble();
                                Operations.withdraw(account, withdrawAmount);
                                break;


                            case 3:
                                Operations.displayTransactions((CurrentAccount) account);
                                break;


                            case 4:
                                break; // Go back to the main menu
                            default:
                                System.out.println("Invalid choice! Please try again.");
                        }
                    } while (operationChoice != 4);
                    break;


                case 4:
                    System.out.println("Filtering not implemented yet.");
                    break;


                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    break;


                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }
}

