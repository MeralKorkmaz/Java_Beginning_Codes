package day05_logicaloperators_ifstatements;

import java.util.Scanner;

public class C03IfStatement01 {


    public static void main(String[] args) {
        //If it rains, I will cancel the picnic.
        //If(it rains //condution) { I will cancel the picnic//code}

        int a = 5;
        int b = 2;
        if (a % b == 1) {
            System.out.println("Activated...");
            //the outcam is "Activated"

        }

        if (a % b != 1) {
            System.out.println("Activated...");
            //the outcam is nothing

        }

        //Examle: write a code detect either a given number is odd or even.

        Scanner input = new Scanner(System.in);
        System.out.println(" Please Enter a number to check if it is even or odd...");
        int number = input.nextInt();

        //first way

        if (number%2==0){
            System.out.println(" The number given is even....");

        }

        if (number%2!=0){
            System.out.println(" The number is odd....");
        }

        //decimal number are not categorized as even or odd num

        //Second Way:
        if (number%2==0){
            System.out.println(" The number given is even...");

        }else{
            System.out.println("The number is odd...");
        }

        //Example 2: Write a code to check if number is positive, negative, or neutral

        System.out.println(" Please Enter A Number to check its sign...");

        double num = input.nextByte();
        if (num<0){
            System.out.println(" The number is negative...");

        }else if (num>0){
            System.out.println("Tne number is positive");

        }else{
            System.out.println(" The number is neutral");
        }

        //else is always coming in the end.


















    }
}

