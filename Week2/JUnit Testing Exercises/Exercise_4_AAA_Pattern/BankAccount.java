public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner, int initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}