package DT_Practice.practice03.practise01;

import java.util.Scanner;

public class Practise06_ScannerClass_GettingInitials {

    public static void main(String[] args) {

        //Example: Ask user to enter his name and get the initial of a name which contains first name and last name
        //         Tom Hanks ==> TH

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first and last name:");

        String fullName = input.nextLine();

        //Indexing start from 0 //chartAt is making indexing

        char firstName = fullName.charAt(0); //T

      char lastnameFirstChar = fullName.split(" ")[1].charAt(0);
       //It is splitting from the space. we are gonna have two pieces. Java is still doing indexing. First piece is 0 and second one is 1
        //after splitting 'h' is 0 for Hanks

        System.out.println(firstName + " " + lastnameFirstChar);

        //Fatih's
        // Example: Ask a user to enter his name and get the initial of a name which contains first name and last name
        ////         Tom Hanks ==> TH
        //
        //Scanner input = new Scanner(System.in);
        //
        //System.out.println("Enter your first and last name....");
        //
        //String fullName = input.nextLine();
        ///*
        //In Java      TOM HANKS IS
        //             012345678   --->These are indexes
        //             0----->T
        //             1----->o
        //             2----->m
        //             3----->    ----- (Just a space(blank), but it is an index)
        //             4----->H
        //             5----->a
        //             6----->n
        //             7----->k
        //             8----->s
        //           Tom is first piece of String
        //           Hanks is second piece of String
        // */
        //
        //
        //char firstChar = fullName.charAt(0); //To get T
        //
        //char lastNameChar = fullName.split(" ")[1].charAt(0);   //To cut the word from the " " aka space(blank).
        //                                                            //TOM IS 0, HANKS ARE 1 WHILE SPLIT IN THE INDEX WORLD
        //                                                            //All these are just to get the H
        //
        //System.out.println(firstChar+" "+lastNameChar);















    }
}
