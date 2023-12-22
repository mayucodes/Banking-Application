/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingapplication;

/**
 *
 * @author mayus
 */
// Abstract class representing a Bank Account
abstract class BankAccount {
    String accountNumber;
    double balance;

    // Abstract method to deposit the given amount into the account
    abstract void deposit(double amount);

    // Abstract method to withdraw the given amount from the account
    abstract void withdraw(double amount);

    // Abstract method to display the account number and balance
    abstract void displayAccountInfo();
}

