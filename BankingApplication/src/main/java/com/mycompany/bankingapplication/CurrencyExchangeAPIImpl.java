/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingapplication;

import java.util.Random;

/**
 *
 * @author mayus
 */
// Concrete implementation of the CurrencyExchangeAPI interface
class CurrencyExchangeAPIImpl implements CurrencyExchangeAPI {

    // Implementation of getExchangeRate method
    @Override
    public double getExchangeRate(String sourceCurrency, String targetCurrency) {
        // Simulating exchange rate data between 0.5 and 1.0
        Random rand = new Random();
        return 0.5 + (1.0 - 0.5) * rand.nextDouble();
    }
}
