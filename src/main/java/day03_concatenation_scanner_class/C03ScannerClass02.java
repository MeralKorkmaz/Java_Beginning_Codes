package day03_concatenation_scanner_class;

import java.util.Scanner;

public class C03ScannerClass02 {

    public static void main(String[] args) {
        //ask Full name of the user and print it
        //Create Scanner Class object
        Scanner input = new Scanner(System.in);

        //write a message to the user
        System.out.println("Please Enter Your Full Name:.....");

        //Get data from user
        String fullName = input.nextLine();

        //next single word and nextline whole words

        System.out.println("fullName is= " + fullName);

        //Ask user to enter parents first name only
        //we are not creating any new scanner class. We can use it so many time

        System.out.println(" Please Enter only First Name of your Parent");
        String firstName = input.next();
        //we are not using nextline because users are not trustworthy

        System.out.println("First name is  = " + firstName);


    }
}
