package com.banksystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
  private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
  private double balance;
  private final String accountNumber;

  public BankAccount(String accountNumber, double initialBalance) {
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
    logger.info("Created account {} with balance {}", accountNumber, initialBalance);
  }

  public void withdraw(double amount) {
    if (amount <= 0) {
      logger.error("Invalid withdrawal amount: {}", amount);
      return;
    }
    if (amount > balance) {
      logger.warn("Insufficient funds for account {}", accountNumber);
    } else {
      balance -= amount;
      logger.info("Withdrew {}. New balance: {}", amount, balance);
    }
  }

  public double getBalance() {
    return balance;
  }
}