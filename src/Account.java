public class Account {
    private int id;
    private Customer1 customer;
    private double balance = 0.0;

    public Account(int id, Customer1 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer1 customer) {
        this.id = id;
        this.customer = customer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer1 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public Account deposit(double amount){
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount){
        if(balance >= amount){
            this.balance -= amount;
        }
        else
            System.out.println("Amount withdrawn exceeds the current balance!");

        return this;
    }

    @Override
    public String toString() {
        String balan = String.format("%.2f",balance);
        return customer + " balance = " + balan;
    }
}
