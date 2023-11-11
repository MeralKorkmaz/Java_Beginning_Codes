package day22_revision_oop;

public interface Exercise2_Account {
    /*
      Let's say you want to create a banking application, and you need to define an interface
     for different types of accounts, such as savings accounts and checking accounts.
     Both account types share common methods like
        deposit,
        withdraw,
        and getBalance,
      but each type may have its own specific rules and behaviors.
     */

    void deposit(double amount);//abstract method
    void withdraw(double amount);
    double getBalance();



}
