package toString;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getid() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getbalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
            return balance;
        }
        return amount;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            another.balance = another.balance + amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return amount;
    }
    @Override
}









