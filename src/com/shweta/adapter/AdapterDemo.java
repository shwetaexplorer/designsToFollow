package com.shweta.adapter;

import java.io.IOException;

public class AdapterDemo {
    public static void main(String[] args) throws IOException {
        CreditCard bankCustomer = new BankCustomer();
        bankCustomer.getBankDetails();
        String creditCard = bankCustomer.getCreditCard();
        System.out.println("creditCard is " + creditCard);



    }
}
