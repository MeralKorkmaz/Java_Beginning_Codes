package DT_Practice.practice03.practise01;

import java.util.Scanner;

public class Practise04_ScannerClass {

    public static void main(String[] args) {
         /*
    Ask user to enter the width, length and the height of a rectangular prism then find the volume.
    Volume = width * length * height
     */

        Scanner input = new Scanner(System.in);

        System.out.println( " Please Enter The width, the length and the height for calculation.");

        double width = input.nextDouble();
        double length = input.nextDouble();
        double height = input.nextDouble();

        System.out.println(" Volume is:  " + width*length*height) ;

        //The solution of proffesor
        // 1.step: Create a Scanner class object
        //Scanner input= new Scanner(System.in);
        //
        ////2.Step: Give message to the user
        //System.out.println("Enter width for calculation...");
        //
        ////3.Step: Create a proper data type container to receive the value from the user
        //
        //double width=input.nextDouble();
        //
        //System.out.println("Enter length value for calculation...");
        //
        //double length= input.nextDouble();
        //
        //System.out.println("Enter height value for calculation...");
        //
        //double height=input.nextDouble();









    }
}
