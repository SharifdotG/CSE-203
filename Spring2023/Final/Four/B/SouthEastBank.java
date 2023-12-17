package Spring2023.Final.Four.B;

public class SouthEastBank {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Mahi", "11111", 1000);
        BankAccount b2 = new BankAccount("Arnob", "22222", 0); // Add initial balance for b2
        transfer(b1, b2, 500);
        b1.display();
        b2.display();
    }

    public static void transfer(BankAccount a1, BankAccount a2, double amt) {
        a1 = new BankAccount("Rafi", "33333", 2000);
        a1.withdraw(amt);
        a2.deposit(amt);
        System.out.println(a2.balance);
    }
}

/*
Output:
500.0
Mahi:11111:1000.0
Arnob:22222:500.0
*/