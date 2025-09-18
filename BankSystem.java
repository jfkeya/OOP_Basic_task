import java.util.ArrayList;
// Account class
class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    // Constructor
    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " to account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }
    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    @Override
    public String toString() {
        return "Account[" + accountNumber + ", Holder: " + accountHolder + ", Balance: $" + balance + "]";
    }
}
// Bank class
class Bank {
    private ArrayList<Account> accounts;
    public Bank() {
        accounts = new ArrayList<>();
    }
    // Add new account
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account.getAccountNumber());
    }
    // Remove account by account number
    public void removeAccount(String accountNumber) {
        boolean removed = accounts.removeIf(acc -> acc.getAccountNumber().equals(accountNumber));
        if (removed) {
            System.out.println("Account " + accountNumber + " removed.");
        } else {
            System.out.println("Account not found.");
        }
    }
    // Find account by account number
    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }
    // Display all accounts
    public void displayAccounts() {
        System.out.println("\n--- Bank Accounts ---");
        for (Account acc : accounts) {
            System.out.println(acc);
        }
    }
}
// Main class to run the program
public class BankSystem {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        // Create accounts
        Account acc1 = new Account("1001", "Alice", 1000);
        Account acc2 = new Account("1002", "Bob", 500);
        // Add accounts
        myBank.addAccount(acc1);
        myBank.addAccount(acc2);
        // Deposit and withdraw
        acc1.deposit(200);
        acc1.withdraw(150);
        acc2.deposit(100);
        acc2.withdraw(700);  // This should show insufficient balance
        // Display all accounts
        myBank.displayAccounts();
        // Remove an account
        myBank.removeAccount("1002");
        // Display again
        myBank.displayAccounts();
    }
}
