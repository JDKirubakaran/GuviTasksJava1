package com.guvi.day4.task2;

public class Main1C {

    public static void main(String[] args) {
        // Create an instance of Account
        Account1C acc1 = new Account1C();
        Account1C acc2 = new Account1C(100.0);

        // Deposit some amount
        acc1.deposit(500.0);
        acc2.deposit(200.0);

        // Withdraw some amount
        acc1.withdraw(200.0);
        acc2.withdraw(150.0);

        // Display balances
        acc1.displayBalance();
        acc2.displayBalance();

    }}

