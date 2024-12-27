import java.util.ArrayList;
import java.util.Scanner;


 public  class Client {
    static int id=0;
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


    public static void Add() {
        Scanner sc = new Scanner(System.in);
        String full_name;
   while(true) {

       System.out.println("Enter the full name :");
       full_name = sc.nextLine();
       if (full_name.matches("^[A-Za-z]+ [A-Za-z]+$")) {
           break;
       } else {
           System.out.println("enter the write formula");
       }
   }
        System.out.println("Enter the addressee :");
        String adressee = sc.nextLine();
        String telephone;
       while(true) {
           System.out.println("Enter telephone number (10 digits):");
           telephone = sc.nextLine();
           if (telephone.matches("(^(06|05|07)\\d{8})$")) {
               break;
           }else{
               System.out.println("Invalid telephone number. It should contain exactly 10 digits.");
           }
       }
        // Email input with a loop to re-prompt until a valid email is entered
        String email;
        while (true) {
            System.out.println("Enter email :");
            email = sc.nextLine();

            // Check if email matches the pattern
            if (email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                break; // Valid email, exit the loop
            } else {
                System.out.println("Invalid email format. Please try again.");
            }
        }

        // Increment id and add client to list
        id++;
        Client in = new Client(full_name, email, adressee, telephone, id);
        clients.add(in);
        System.out.println(" [ Adding Client succeeded ] ");
    }

     public static void Display() {
         if (clients.isEmpty()) {
             System.out.println("--- Yow it's empty ---");
             return;
         }

         for (Client client : clients) {
             System.out.println("-----------"
                     + "\n id: " + client.getId()
                     + "\n fullName: " + client.getFull_name()
                     + "\n Email: " + client.getEmail()
                     + "\n telephone: " + client.getTelephone()
                     + "\n addressee:  " + client.getAddressee()
                     + "\n ---------");
         }

     }}