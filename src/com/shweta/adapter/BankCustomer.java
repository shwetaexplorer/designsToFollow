package com.shweta.adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard
{
    public BankCustomer() {

    }


    @Override
    public void getBankDetails() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Bank name: ");
        String bankName = bufferedReader.readLine();
        this.setBankName(bankName);
        System.out.println("Enter account number: ");
        long accountNumber = Long.parseLong(bufferedReader.readLine());
        this.setAccountNumber(accountNumber);
        System.out.println("Enter account holder name: ");
        String accountHolderName = bufferedReader.readLine();
        this.setAccountHolderName(accountHolderName);
    }

    @Override
    public String getCreditCard() {
        return this.getBankName()+"-"+this.getAccountHolderName()+"-"+this.getAccountNumber();
    }
}
