package day11_arrays;

import java.util.Arrays;

public class C02Arrays03 {

    public static void main(String[] args) {
        //Example 5: Create an integer array and print all the elements less than 5
        //           [12, 3, -3, 5, 23] ==> 3, -3

        int [] num = {12,3,-3,5,23};
        for(int w:num){

            if(w<5){
                System.out.print(w + " ");
            }
        }


        /*
        Homework
         //Example 3: Create a String Array, add 5 elements in it,
        // find the sum of the number of letters in all Strings


        String [] cities = {"London","Dares Salaam","New York", "Istanbul","Athens"};
         */

        System.out.println();



        //Example 4: Check if a specific element exists in an Array
        int [] numbers = {12,3,14,5,23};
        System.out.println(Arrays.binarySearch(numbers, 3));//it is giving 2 which is index
        //binarySearch() returns index of the element
        //before using binarySearch() you must sort the array
        //If there are repeating elements yo cannot use binarySearch(). It will return you wrong

        Arrays.sort(numbers); //{3,5,12,14,23}
        int idxOfElements =  Arrays.binarySearch(numbers,11); //-3
        System.out.println(idxOfElements);

        //If Element does not exist in the Array binarySearch() returns "-3"."-" means ....>does not exist
        //"-3" mean ....> order if it would exist

        //if it exists it returns exit, if it is not, it returns order





    }
}
