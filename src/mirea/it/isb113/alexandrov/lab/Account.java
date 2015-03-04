package mirea.it.isb113.alexandrov.lab;

/**
 * Created by student on 04.03.2015.
 */
public class Account {
    private int acccountNumber;
    private double balance;

    public Account(int acccountNumber, double balance) {
        this.acccountNumber = acccountNumber;
        this.balance = balance;
    }

    public Account(int acccountNumber) {
        this.acccountNumber = acccountNumber;
        this.balance = 0;
    }

    public Account() {
        this.acccountNumber = 0;
        this.balance = 0;
    }


    public int getAcccountNumber() {
        return acccountNumber;
    }

    public void setAcccountNumber(int acccountNumber) {
        this.acccountNumber = acccountNumber;
    }

    public double getBalance() {
        return (balance-balance%1);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void debit(double amount){
        System.out.println("Дебит");

    }
    public void credit(double amount) {
        if (amount > balance) {
            System.out.println("overdraft");
        } else {
            setBalance(balance-amount);
        }

    }


    public String toString() {
        return "Account{" +
                "acccountNumber=" + acccountNumber +
                ", balance=" + balance +
                '}';
    }
}
