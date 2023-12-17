package Spring2023.Final.Four.B;

public class BankAccount {
    String name, accNum;
    double balance; // removed private access modifier

    public BankAccount(String name, String accNum, double bal) {
        this.name = name;
        this.accNum = accNum;
        this.balance = bal;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        balance -= amt; // Fixed: subtract the withdrawal amount
    }

    public void display() {
        System.out.println(this.name + ":" + accNum + ":" + balance);
    }
}