package day06_switch_ternary_stringmanipulations;

public class C05StringManipulations {

    public static void main(String[] args) {


        /*
        .........Regular Expressions(regex).......
        i) If we handle group of data we use regex
        -All Upper case letters: [A-Z] ( it means regex cover all upper case letters)
        - All Lowe case letters: [a-z]
        -All letters           : [A-Za-z]
        -All digits            : [0-9]
        -letters form b to m   : [b-m]
        -group of letters akmre: [akmer] (order is not important)
        -All chars different from Upper case letters: [^A-Z]
        -All chars different from Lower case letters: [^a-z]
        -All chars different from letters: [^A-Za-z]
        -All chars different from digits : [^0-9]
        -All chars different from letters and digits: [^A-Za-z0-9]
        -All punctuation marks: //p{Punct}
        !whatever we write in the [] we are taking them

         */

        //Example 1: Count the alphabetical chars in a given String
        //" Tom12 Hanks!..." ....>8

        String name = " Tom12 Hanks!...";
        System.out.println(name.replaceAll("[^A-Za-z]", "").length());

        //replaceAll() ...> is used to replace group of data from string with something
        //length()     ....> counts the number of chars in a string
        /*
        System.out.println(name.replaceAll("[21]", " *"));
        normally we are doing by replace changing place 21 with *.
        So, it will be  Tom** Hanks!...
        System.out.println(name.replaceAll("[^A-Za-z]", ""); with
        that we are replacing nothing with them to select just letters
       */

        //Example2: Write a code to change all numbers by * in a given password

        String password = "a12Rd?q5";
        String hiddenPass = password.replaceAll("[0-9]"," *");
        System.out.println(hiddenPass);

        //Example 3: Get initials from full Name (Middle names are exculeded)
        //" Tom Hanks" ...> TH   "toM Hanks" ...> TH   "tOm hAnKs" .....>TH

        String name2 = "tOm hAnKs";
        //How to get first initial
        String firstInitial = name2.substring(0, 1).toUpperCase();
        //substring cuts String for certain part. The other part we are not using. Split makes many pieces. We can use all of them.
        //we are using uppercase because they are Initial of the name

        //How to get Second initial
        String secondInitial = name2.split(" ")[1].substring(0,1).toUpperCase().trim();
        //split make 2 pieces. Cut from the space because if we do not between "". Then, "tOm"'s index is 1,"hAnKs"'s index is 2
        /*
        !!!!warning: when we split from one letter, the letter that we cut is not available.
        Example: If we cut from "m"
        1) name2.split("m")[0]....>tO
        2)name2.split("m")[1].....> hAnKs
        Example: If we cut form "A"
        1)name2.split("A")[1]....>nKs
        2)name2.split("A")[0].....>tOm h
         */
         System.out.println(firstInitial+secondInitial);




        /*
        Starting index (inclusive, include the first one) , ending (exclusive, it is not included)
        System.out.println(name2.substring(1, 5)); ...> Om h a is 5 so it is not included
        System.out.println(name2.substring(beginningindex:4)) it's showing all of them starts with 4 (hAnKs)
         */


        //trim(): Removes spaces from the beginning and from the end
    //substring(s, e): It gets a part of the String.
       //                 "s" stands for starting index which is inclusive
        //                 "e" stands for ending index which is exclusive
       //toUpperCase(): Changes all alphabetical characters to upper cases in a String
         //split(): Splits a String from given character and indexes every part







    }
}
