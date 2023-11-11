package day11_arrays;

import java.util.Arrays;

public class C01Arrays02 {

    public static void main(String[] args) {
        //Example 2: Find the difference between maximum and min value of array elements
        //[8,12,34,10,78,19]

       /*
        int a = 69;
        int b = 41;

        System.out.println(Math.max(a, b));//69

        System.out.println(Math.min(a, b));//41
        */

        int [] arr = {8,12,34,10,78,19};

        //we are not assign any value from outside. The outsider value can be bigger than my numbers

        int maximum = arr[0];
        int minimum = arr[0];

        for(int w:arr){
            maximum = Math.max(maximum,w);
            minimum = Math.min(minimum,w);
        }
        System.out.println(maximum);//78
        System.out.println(minimum);//8
        System.out.println(maximum-minimum);//70

        //w will be changed by loop.

        //Example 3: Create a String Array, add 5 elements in it,
        // find the sum of the number of characters in all Strings


        String [] cities = {"London","Dares Salaam","New York", "Istanbul","Athens"};

        int numOfChars = 0;

        for(String w: cities){   //data type is String so it is String
            numOfChars = numOfChars + w.length();
        }
        System.out.println(numOfChars);//40

        //Arrays are fast and save less memory

        //Note 1: Arrays can contain only "primitive data types" and "references". Not the String itself.
        //Note 2: String data uses length() method but Arrays uses length varaible
        /*
        method contains action. In length() method action is counting of the length of the variable
         int [] brr = new int[6];
        //does not a method to cont the length. we are writing the lenght of array in []. In that case, 6 is the length and Java store the length of the array as variable
        */



        //!!Interview Question
        //Example 4: [0, 2, 3, 0, 12, 0] put the zeros to the end ==> [2, 3, 12, 0, 0, 0]
        int [] crr = {0,2,3,0,12,0};
        // If we use sort() it will be [12,3,2,0,0,0]

        //null the default value of String. For int, it is 0

        int [] newCrr = new int [crr.length];
        // we cannot change the length of the array after declaring

        int idx = 0;

        for (int w: crr){//w is member of the array
            if(w!=0){
                newCrr[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newCrr));




























    }
}
