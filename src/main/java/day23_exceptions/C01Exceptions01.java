package day23_exceptions;
/*
when exception occurs it will send a message that  is  saying in which line you made a mistake and stop execution
 */
import java.util.Scanner;

public class C01Exceptions01 {

    public static void main(String[] args) {
        int totalPrice = 1200;
        System.out.println(installmentPayments(totalPrice));

    }

    //Type a method to calculate monthly payment
    public static int installmentPayments(int price){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number of Installments..");
       int installment =  input.nextInt();
       if (installment==0){
          return price;//to not make it exception
       }//after applying this 1200 instead of exception
       return price/installment;
    }
}
