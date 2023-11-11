package day10_loops_arrays;

import java.util.Scanner;

public class C01DoWhileLoop01 {

    public static void main(String[] args) {
             /*
        Ask user to enter an integer.
      If the integer is less than 100, tell user "Won!"
      Otherwise, tell user "Lost!"
      Scope
         */

        //first way



        int num = 0;

         //        do{
        //
        //            Scanner input = new Scanner(System.in);
       //            System.out.println("Please Enter a number");
      //            num = input.nextInt();
      //
       //            if (num <100){
       //                System.out.println("Won!");
       //            }
        //        }while (num<100);
      //        System.out.println("You lost");


        //second way

        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter a number");
            num = input.nextInt();

            if(num>=100){
                System.out.println("You Lost!");
                break;
            }
            System.out.println("You Won!");

        }while (true); // the condition is true all the time, so we add break to break  manually. When we come break, we are outside  the loop


































    }
}
