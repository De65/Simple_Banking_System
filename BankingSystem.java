import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {
        NewAccount.createNewAccount();
    }
}

class AccountsDetails {
    // private fields
    private String name;
    private int id;
    private int phoneNumber;
    private int accountNumber;

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}

class NewAccount {
    public static void main(String[] args) {
        createNewAccount();
    }

    public static void createNewAccount() {
        Scanner scanner = new Scanner(System.in);
        AccountsDetails details = new AccountsDetails();

        // details.setName("Please Insert Your Name:");
        // details.setId(0);
        // details.setPhoneNumber(0);
        // details.setAccountNumber(0);

        // // System.out.println(details.getName());
        // // System.out.println(details.getId());
        // // System.out.println(details.getPhoneNumber());
        // // System.out.println(details.getAccountNumber());
        // if (details == null){
        // System.out.println("PLEASE ENTER VALID VALUES!");
        // return ();}

        // String Name = details.getName();
        // System.out.println("NAME:" + Name);

        // int ID = details.getId();
        // System.out.println("ID:" + ID);

        // int PhoneNumber = details.getPhoneNumber();
        // System.out.println("PHONE NUMBER:" + PhoneNumber);

        // int AccountNumber = details.getAccountNumber();
        // System.out.println("ACCOUNT NUMBER:" + AccountNumber);

        System.out.println("Please Insert Your Name:");
        String name = scanner.nextLine();
        details.setName(name);

        System.out.println("Please Insert Your ID:");
        int id = scanner.nextInt();
        details.setId(id);

        System.out.println("Please Insert Your Phone Number:");
        int phoneNumber = scanner.nextInt();
        details.setPhoneNumber(phoneNumber);

        System.out.println("Please Insert Your Account Number:");
        int accountNumber = scanner.nextInt();
        details.setAccountNumber(accountNumber);

        scanner.close();

        // Display account details
        System.out.println("Account Created Successfully!");
        System.out.println("Name: " + details.getName());
        System.out.println("ID: " + details.getId());
        System.out.println("Phone Number: " + details.getPhoneNumber());
        System.out.println("Account Number: " + details.getAccountNumber());
    }
}
