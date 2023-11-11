package day03_concatenation_scanner_class;

import java.util.Scanner;

public class C05ScannerClass04 {

    public static void main(String[] args) {
        //Example 2: Ask user to enter the width and the length of a rectangle, then print the area and perimeter on the console

        Scanner input = new Scanner(System.in);

        System.out.println(" Please Enter Width and length of a rectangle:...");

        double width = input.nextDouble();
        double lenght = input.nextDouble();

        double area = width * lenght;
        double perimeter = 2* (width + lenght);
        System.out.println(" The area of rectangle is " + area + " The perimeter of rectangle is " + perimeter);

        //System.out.println("area =" + area);
        //System.out.println("perimeter =" + perimeter);




    }

}
