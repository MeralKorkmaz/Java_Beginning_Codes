package day03_concatenation_scanner_class;

import java.util.Scanner;

public class C02ScannerClass01 {


    public static void main(String[] args) {
        //Scanner Class: When we want to get input from user we use Scanner Class
        //To get data from use we need to follow these 3 steps:
        //First Step: Create Scanner Class object
        Scanner input = new Scanner(System.in);

        ///Step 2: Write a message to user
        System.out.println("Please Enter Your Age: ....");

        //Get data form user
        byte age = input.nextByte(); // we are putting the data to the byte age container

        System.out.println("Your age is:" + age);







    }
}
