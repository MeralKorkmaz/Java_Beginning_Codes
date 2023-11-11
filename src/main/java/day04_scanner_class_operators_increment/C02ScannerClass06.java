package day04_scanner_class_operators_increment;

import java.util.Scanner;

public class C02ScannerClass06 {

    public static void main(String[] args) {

  //Example 4: Ask user to enter 5 digit integer like 45678
  //           Type code to print the sum of the first two and the last two numbers
  //           45678 ==> 45 + 78 = 123

        //Ask user to enter number
        Scanner input = new Scanner(System.in);
        System.out.println(" Please Enter 5 Digit Number:....");
        int num = input.nextInt();

        int firstTwo = num/1000; //45

        //Modulus Operator: Returns the remainder of division operation.
        //                  It is used very often.
        //                   The symbol for modulus operator is "%"
        //18%5 the reminder is 3 so the input is 3

        int lastTwo = num%100; //78
        int sum = firstTwo + lastTwo;
        System.out.println(" The sum of first of two digits ans last two digits of " + num+ " is " + sum);











    }
}
