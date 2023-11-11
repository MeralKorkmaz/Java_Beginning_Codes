package day03_concatenation_scanner_class;

import java.util.Scanner;

public class C04ScannerClass03 {

    public static void main(String[] args) {
        //Example 1: Ask user to enter 2 numbers, then print the sum and the multiplication of the numbers on the console.

        //First Step: Create scanner class

        Scanner input = new Scanner(System.in);
        //Message to the user
        System.out.println("Plase Enter first Number:....");
        double num1 = input.nextDouble();
        System.out.println("Plase Enter second Number:....");
        double num2 = input.nextDouble();

        double sum = num1+num2;
        double product= num1*num2;
        System.out.println("Sum of " + num1 + " and " + num2+ " is: "  + sum );//or we can use (num1+ num2) instead of sum
        System.out.println("Product of the number is: " + product);




    }
}
