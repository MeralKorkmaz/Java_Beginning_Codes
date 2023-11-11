package SGG.ssg_if_elseif.ssg_switchcase;

import java.util.Scanner;

public class Switch_Statement03 {

    public static void main(String[] args) {

        // Example 1: Type a program like ask user to enter a month name then by using switch
        //         statement find the number of days in that month.

        //"January"=31
        //"March"=31
        //"May"=31
        //"July"=31
        //"August"=31
        //"October"=31
        //"December"=31
        //****
        //"April"=30
        //"Jun"=30
        //"September"=30
        //case "November"=30
        //****
        //"February"=28

        String month = "December";

        switch (month){
            case "January":
                System.out.println("The number of day is 31");
                break;
            case "February":
                System.out.println("The number of day is 28");
                break;
            case "March":
                System.out.println("The number of day is 31");
                break;
            case "April":
                System.out.println("The number of day is 30");
                break;
            case "May":
                System.out.println("The number of day is 31");
                break;
            case "June":
                System.out.println("The number of day is 30");
                break;
            case "July":
                System.out.println("The number of day is 31");
                break;
            case "August":
                System.out.println("The number of day is 31");
                break;
            case "September":
                System.out.println("The number of day is 30");
                break;
            case "October":
                System.out.println("The number of day is 31");
                break;
            case "November":
                System.out.println("The number of day is 30");
                break;
            case "December":
                System.out.println("The number of day is 31");
                break;
            default:
                System.out.println("Please enter a valid month name");


        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of a month");
        String month1 = input.next();
        int daysInMonth;

        switch (month1){
            case "January", "March", "May", "July", "August", "October", "December":
                daysInMonth =31;
                break;
            case "April", "June","September","November":
                daysInMonth = 30;
                break;
            case "February":
                daysInMonth = 28;
                break;
            default:
                daysInMonth = -1;


        }
        System.out.println(daysInMonth);




        /* Example 2: Ask user to enter age of a child then determine the category of a given age.
             0,1,2 = "Infant"
     3,4,5 = "Child"
       6,7,8,9,10 = "Preteen"
      */


        System.out.println("Please enter your age");
        int age = input.nextInt();

        switch (age){
            case 0,1,2:
                System.out.println("Infant");
                break;
            case 3, 4,5 :
                System.out.println("Child");
                break;
            case   6,7,8,9,10:
                System.out.println("Preeteen");
                break;
            default:
                System.out.println("You are entering wrong age");
        }

        //Example 3: Ask user to type a language then use a switch statement to assign a message
        // based on the provided language.
        // "Java", "Python", "C++"

        System.out.println("Please type a language");
        String language = input.next();

        switch (language){
            case "Java":
                System.out.println("Your language is Java");
                break;
            case "Python":
                System.out.println("Your language is Python");
                break;
            case "C++":
                System.out.println("Your language is C++");
                break;
            default:
                System.out.println("Different language");
        }

        //Example 4: Ask user to enter the month number then use a switch
       // statement to determine the season based on the provided month.

        System.out.println("Please enter a month  number");
        int num = input.nextInt();

        switch (num){
            case 12, 1,2 :
                System.out.println("Winter");
                break;
            case 3,4,5:
                System.out.println("Spring");
                break;
            case 6 ,7,8:
                System.out.println("Summer");
                break;
            case 9, 10,11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Please enter a valid number");
        }























    }
}
