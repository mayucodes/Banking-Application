/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingapplication;

/**
 *
 * @author mayus
 */
// Concrete implementation of the BankAccount abstract class
class BankAccountImpl extends BankAccount {

    // Implementation of deposit method
    @Override
    void deposit(double amount) {
        balance += amount;
    }

    // Implementation of withdraw method
    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Implementation of displayAccountInfo method
    @Override
    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

