package models;

public class BankAccount {
//    public double balance;
    private double balance; // Encapsulation is applied (Another class can not access the balance other than using the provided methods)

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
