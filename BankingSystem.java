import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingSystem {
    private static List<AccountsDetails> accountsList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Option to create a new account or perform transactions
        System.out.println("1. Create New Account");
        System.out.println("2. Perform Transactions");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        if (option == 1) {
            AccountsDetails newAccount = NewAccount.createNewAccount();
            accountsList.add(newAccount);
            System.out.println("Account created successfully!");
        } else if (option == 2) {
            // Display existing accounts
            System.out.println("Existing Accounts:");
            for (int i = 0; i < accountsList.size(); i++) {
                System.out.println((i + 1) + ". " + accountsList.get(i).getName());
            }
            System.out.print("Choose an account (1-" + accountsList.size() + "): ");
            int accountIndex = scanner.nextInt() - 1;

            if (accountIndex >= 0 && accountIndex < accountsList.size()) {
                AccountsDetails selectedAccount = accountsList.get(accountIndex);
                performTransactions(selectedAccount);
            } else {
                System.out.println("Invalid account selection.");
            }
        } else {
            System.out.println("Invalid option.");
        }

        scanner.close();
    }

    private static void performTransactions(AccountsDetails account) {
        Transactions transactions = new Transactions();

        // Example transactions
        transactions.deposit(account, 1000);
        transactions.withdraw(account, 500);

        // Display balance
        double balance = transactions.checkBalance(account);
        System.out.println("Current Balance: " + balance);
    }
}

class Transactions {

    public void deposit(AccountsDetails account, double amount) {
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(AccountsDetails account, double amount) {
        if (amount > 0 && amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    public double checkBalance(AccountsDetails account) {
        return account.getBalance();
    }
}

class AccountsDetails {
    // private fields
    private String name;
    private int id;
    private int phoneNumber;
    private int accountNumber;
    private double balance;

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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class NewAccount {
    public static void main(String[] args) {
        createNewAccount();
    }

    public static AccountsDetails createNewAccount() {
        Scanner scanner = new Scanner(System.in);
        AccountsDetails details = new AccountsDetails();

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

        System.out.println("Your Balance is:");
        double balance = scanner.nextDouble();
        details.setBalance(balance);

        scanner.close();

        // Display account details
        System.out.println("Account Created Successfully!");
        System.out.println("Name: " + details.getName());
        System.out.println("ID: " + details.getId());
        System.out.println("Phone Number: " + details.getPhoneNumber());
        System.out.println("Account Number: " + details.getAccountNumber());
        System.out.println("Balance:" + details.getBalance());

        return details;
    }
}
