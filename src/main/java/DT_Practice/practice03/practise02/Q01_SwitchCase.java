package DT_Practice.practice03.practise02;

import java.util.Scanner;

public class Q01_SwitchCase {

    public static void main(String[] args) {

        //Ask user to enter a character, if it is vowel print on the console 'Vowel', if it is not a vowel print "Not vowel"

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter a character to check if it is vowel....");

        char c = input.next().toLowerCase().charAt(0);
        //next is taking the first word and we need only the one word. So,if the user gives a word, we are using charAt()

        switch(c){
            case 'a':
            case'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;

            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'y':
            case 'z':
                System.out.println("Not Wovel");
                break;
            default://else part but there is no else if part
                System.out.println("Enter a letter not other characters... ");

        }

        //There is no vowel or not vowel regex


    }
}
