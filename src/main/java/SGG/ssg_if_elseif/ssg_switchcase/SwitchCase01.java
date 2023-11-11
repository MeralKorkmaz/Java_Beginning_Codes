package SGG.ssg_if_elseif.ssg_switchcase;

import java.util.Scanner;

public class SwitchCase01 {

    public static void main(String[] args) {
       /*
            Write a Java program user will choose answer among A, B, C, or D.
            If the answer is true, output will be "True." If the answer is false, output will be
            "False". Correct answer is 'C' for the multiple option question.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your answer,please");

        char answer =  input.next().toUpperCase().charAt(0);

        switch (answer) {
            case 'A':
            case 'B':
            case 'D':
                System.out.println("False");
                break;
            case 'C':
                System.out.println("True");
                break;

            default:
                    System.out.println("Enter a letter not the characters");

                    //we can use ignoreCase() for comparing equality


        }






































    }

}
