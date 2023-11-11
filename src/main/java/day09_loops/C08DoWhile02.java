package day09_loops;

import java.util.Scanner;

public class C08DoWhile02 {

    public static void main(String[] args) {

        //Type a code to find sum of the integers from 7 to 10

        int sum = 0;
        int i = 7;


        do{
            sum = sum +i;
            i++;
        }while (i<11);
        System.out.println(sum);


        /*
        Ask user to enter an integer.
      If the integer is less than 100, tell user "Won!"
      Otherwise, tell user "Lost!"
      Scope
         */

        Scanner input = new Scanner(System.in);

        int num = 0;

        do{

            System.out.println("Please Enter a number");
            num = input.nextInt();

            if (num <100){
                System.out.println("Won!");
            }
        }while (num<100);//this showing the barrier. For this example if j is 101, we crash the barrier. So, it  is printing the lost part
        System.out.println("You lost");

        //if there is one condition, increment or decrement is not necessary













    }
}
