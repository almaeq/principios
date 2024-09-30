package org.example;

// Clase que solo hace reportes de la cuenta bancaria
public class BankAccountReport {
    public void printBalance(BankAccount account) {
        System.out.println("Account " + account.getAccountNumber() + " has balance: " + account.getBalance());
    }
}
