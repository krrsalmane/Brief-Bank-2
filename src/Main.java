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
            System.out.println("enter choice: ");
            choice = sc.nextInt();
          switch(choice){
                case 1:
                    do {
                        System.out.println("\n ======= Client Menu ======");
                        System.out.println("1-Add Client");
                        System.out.println("2-Display Client");
                        System.out.println("3-Back to Menu");

                        System.out.println("Enter the choice : ");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                Client.Add();
                                break;
                            case 2:
                                Client.Display();
                                break;
                            case 3:

                                break;
                            default:
                                System.out.println(" invalid choice!");
                        }

                    }while (choice != 3);
                    System.out.println("this choice isn't available");
                    break;
              case 2:
                  do {
                      System.out.println("\n =======  Manage Account ======");
                      System.out.println("1-Add account");
                      System.out.println("2-display account");
                      System.out.println("3-back to main Menu");
                      System.out.println("Enter the choice : ");
                      choice = sc.nextInt();

                      switch (choice) {
                          case 1:
                             Account.Create_account();
                              break;
                          case 2:
                             //Account.displayAaccount();
                              break;
                          case 3:
                              break;
                          default:
                              System.out.println(" invalid choice!");
                      }


        } while (choice !=4);
        System.out.println("this choice isn't available");

    }}while (choice !=6);}
}