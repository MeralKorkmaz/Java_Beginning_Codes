package SGG.ssg_if_elseif.ssg_switchcase;

import java.util.Scanner;

public class SwitchCase_02 {
    public static void main(String[] args) {


         /*  Ask user to enter one of the 'U', 'S', and 'A'.
            Then type a program by using "switch statement" to print "United" for 'U'
            "States" for 'S', and "America" for 'A
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter U or S or A as a character to see the output");
        char letters = input.next().toUpperCase().charAt(0);

        switch (letters){
            case 'U':
                System.out.println("United");
                break;
            case 'S':
                System.out.println("States");
                break;
            case 'A':
                System.out.println("America");
                break;
            default:
                System.out.println("Please enter only U or S or A as a character");

        }














































    }






























}
