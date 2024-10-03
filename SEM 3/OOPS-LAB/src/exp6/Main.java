package exp6;

interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
    double viewBalance();
}

interface Displayable {
    void display();
}

abstract class Account {
    String acc_name;
    int acc_no;
    double balance;

    public Account(String name, int no, double bal) {
        this.acc_name = name;
        this.acc_no = no;
        this.balance = bal;
    }
}

class Bank extends Account implements Transaction, Displayable {
    public Bank(String name, int no, double bal) {
        super(name, no, bal);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    @Override
    public void display() {
        System.out.println("Account Name: " + acc_name);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank account = new Bank("John Doe", 12345, 1000.0);
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Deposit\n2. Withdraw\n3. View Balance\n4. View Account Details\n5. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Balance: " + account.viewBalance());
                    break;
                case 4:
                    account.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
}

