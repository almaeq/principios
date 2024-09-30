package org.example;

// Una clase debe tener una responsabilidad
public class Main {
    public static void main(String[] args) {
        // Cuenta bancaria con saldo inicial
        BankAccount account = new BankAccount("123456", 1000);

        // Hacemos unas operaciones
        account.deposit(200);  // Depósito de 200
        account.withdraw(150); // Retiro de 150
        account.withdraw(2000); // Intento de retiro fallido por fondos insuficientes

        // Generamos un reporte de la cuenta
        BankAccountReport report = new BankAccountReport();
        report.printBalance(account);  // Imprime el saldo actual
    }
}