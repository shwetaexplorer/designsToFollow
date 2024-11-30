package com.shweta.adapter;

public class BankDetails {

    private String bankName;
    private long accountNumber;
    private String accountHolderName;

    public BankDetails(){
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getBankName() {
        return bankName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

}
