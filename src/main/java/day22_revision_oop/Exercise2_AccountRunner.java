package day22_revision_oop;

public class Exercise2_AccountRunner {
    public static void main(String[] args) {
        Exercise2_Account savingAccount = new Exercise2_SavingAccount(1000);
        //When we need a variable whose data type is an interface, we should use
        //constructor of its child class

        savingAccount.deposit(350);
        savingAccount.withdraw(100);
        savingAccount.withdraw(2000);
        System.out.println("savingAccount.getBalance() = " + savingAccount.getBalance());



        Exercise2_Account checkingAccount = new Exercise2_CheckingAccount(5000);
        checkingAccount.deposit(300);
        checkingAccount.withdraw(500);
        System.out.println("checkingAccount.getBalance() = " + checkingAccount.getBalance());



    }

    //if I have  an abstract class, we must override it

}
