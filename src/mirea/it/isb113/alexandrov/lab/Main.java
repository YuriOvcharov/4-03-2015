package mirea.it.isb113.alexandrov.lab;

import java.util.Scanner;

/**
 * Created by student on 04.03.2015.
 */
public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(123, 50000);
        Account account2 = new Account(124, 50000);
        Account account3 = new Account(125, 50000);
        System.out.println( account1.getAcccountNumber());
        System.out.println(account2.toString());
        account3.credit(60000);
        account3.debit(6);
        System.out.println(account2.getBalance());
        account2.credit(600);
        System.out.println(account2.getBalance());
    }
}
