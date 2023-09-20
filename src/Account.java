public class Account {
    private double balance;
    private String name;

    public Account() {
        this.balance = 0;
    }

    public Account(double balance) {
        this.balance =  balance;
    }

    public double withdraw(double amount) {
        this.balance -= amount;
        return amount;
    }

    public double deposit(double amount) {
        this.balance += amount;
        return amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
