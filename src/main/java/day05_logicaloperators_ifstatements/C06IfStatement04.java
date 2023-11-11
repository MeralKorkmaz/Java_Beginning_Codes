package day05_logicaloperators_ifstatements;

import java.util.Scanner;

public class C06IfStatement04 {

    public static void main(String[] args) {
        //Example 5: Type Java Code by using if-else if() statement
        //A school has rules for grading system:
        //1. Below 50 - D     2. 50 to 59 - C       3. 60 to 79 - B.     4. From 80 to 100 - A
        //Ask user to enter marks and print the corresponding grade.

        Scanner input = new Scanner(System.in);
        System.out.println(" Please Enter Your Mark....");
        byte mark = input.nextByte();

        if (mark <0){
            System.out.println(" Marks of a student cannot be less than zero");
        }else if (mark < 50 ){
            System.out.println(" Your Grade is : D");
        }else if (mark<60){
            System.out.println(" Your Grade is : E");
        }else if (mark<80){
            System.out.println(" Your Grade is: B" );
        }else if (mark<=100) {
            //it is making two operations. we can also use <101 to make it use one operation
            System.out.println(" Your Grade is: A");
        }else{
            System.out.println(" Please Enter a Valid Grade");
        }

        //test the critical values. in that case, they are 0, 50, 60, 80, 100
    }
}
