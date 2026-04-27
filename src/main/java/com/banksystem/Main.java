package com.banksystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    logger.info("CI/CD Automation Bank System Starting...");
    BankAccount account = new BankAccount("UET-25023398", 5000.0);
    account.withdraw(1000.0);
    logger.info("Final balance: {}", account.getBalance());
  }
}