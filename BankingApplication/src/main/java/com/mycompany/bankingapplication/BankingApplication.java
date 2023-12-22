/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankingapplication;

/**
 *
 * @author mayus
 */
// Driver class to demonstrate the usage of the Banking Application
public class BankingApplication {
    public static void main(String[] args) {
        // Creating instances of BankAccount and CurrencyExchangeAPI
        BankAccount bankAccount = new BankAccountImpl();
        bankAccount.accountNumber = "123456789";
        bankAccount.deposit(1000);

        CurrencyExchangeAPI currencyExchangeAPI = new CurrencyExchangeAPIImpl();

        // Displaying initial account information
        System.out.println("Initial Account Information:");
        bankAccount.displayAccountInfo();

        // Simulating deposit and withdrawal
        bankAccount.deposit(500);
        bankAccount.withdraw(200);

        System.out.println("\nAccount Information after Deposit and Withdrawal:");
        bankAccount.displayAccountInfo();

        // Simulating currency exchange
        double exchangeRate = currencyExchangeAPI.getExchangeRate("USD", "EUR");
        System.out.println("\nExchange Rate (USD to EUR): " + exchangeRate);
    }
}

