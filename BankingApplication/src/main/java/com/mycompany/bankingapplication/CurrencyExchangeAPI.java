/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bankingapplication;

/**
 *
 * @author mayus
 */
// Interface for Currency Exchange API
public interface CurrencyExchangeAPI {
    // Method to fetch the exchange rate for converting amounts
    double getExchangeRate(String sourceCurrency, String targetCurrency);
}

