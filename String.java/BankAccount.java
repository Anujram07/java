public class BankAccount {
    public  String accountNumber;
    public  String accountHolder;
    public double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". Remaining balance: $" + balance);
        }
    }

    
    public double getBalance() {
        return balance;
    }


    
    public String toString() {
        return "Account[" + accountNumber + "] - " + accountHolder + ", Balance: $" + balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("1234567890", "Anuj", 1000.0);
        System.out.println(acc);
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(1500); // Should print an error message
    }
}
