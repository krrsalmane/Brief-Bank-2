import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


 public class Client {
    static int id=1;
    private String full_name;
    static  ArrayList<Client> clients = new ArrayList<>();

    public Client(String full_name, String email, String addressee, String telephone, int id) {
        this.full_name = full_name;
        this.email = email;
        this.addressee = addressee;
        this.telephone = telephone;
    }

    private String email;
    private String addressee;
    private String telephone;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Client.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public static void addclient( ) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the full name :");
            String full_name = sc.nextLine();
            System.out.println("Enter the addressee :");
            String adressee = sc.nextLine();
            System.out.println("Enter telephone number:");
            String telephone = sc.nextLine();

            System.out.println("Enter email :");
            String email = sc.nextLine();
        id++;
            Client in = new Client(full_name, email, adressee, telephone, id);
          clients.add(in);
            System.out.println(" [ Adding Client succeeded ] ");

            // Increment the ID for the next client

        }
     public static void Display() {
         if (clients.isEmpty()) {
             System.out.println("--- yow it's empty ---");
             return;
         }

         for (Client client : clients) {
             System.out.println("-----------"+ "\n id: " + client.getId()
                     + "\n fullName: " + client.getFull_name()
                     + "\n Email: " + client.getEmail()
                     + "\n telephone: " + client.getTelephone()
                     + "\n addressee:  " + client.getAddressee()+"\n ---------");
         }

     }}