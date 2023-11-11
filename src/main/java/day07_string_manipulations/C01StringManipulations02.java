package day07_string_manipulations;

public class C01StringManipulations02 {

    public static void main(String[] args) {
        //Example 1: Make the all digits except last 4 digits of a credit card invisible by using '*'
      //           1234 1234 1234 1234 ==> **** **** **** 1234


        String ccNum = "1234 1234 1234 1234";
        String ccNum1= ccNum.substring(0,15).replaceAll("[0,9]", "*");

        //from 0 till 15
       String ccNum2 = ccNum.substring(15);
       //String hiddenCcNum = ccNum1 + ccNum2; It is also usable but we are using the second one
       String hiddenCcNum2 = ccNum1.concat(ccNum2);
        System.out.println(hiddenCcNum2);


        //Example 2: Count the number of characters different from space were used in a String
        //"Tom Hanks was born in 1975."

        String s1 = "Tom Hanks was born in 1975.";
        int numOfChars = s1.replace("","").length();
        //String can get nothing but charles cannot. So, we are using String

        //If we use group of data, We are going to use replaceAll. If we change only space, "was" as in the example or one character only we are using replace

        /* concat(): It concatenate strings
        replace(char, char) or replace (String, String) is used to change single char or sequence of char ("was")
        replaceAll() is used when we need to use regex ...> such as all letter, everything expect space
        */



    }
}
