public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        String formattedBalance = String.format("%.2f", balance);
        return customer + " balance=$" + formattedBalance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        this.balance = amount + balance;
        return this;
    }
    
    public Account withdraw(double amount) {
        if (balance >= amount) {
            this.balance = balance - amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}