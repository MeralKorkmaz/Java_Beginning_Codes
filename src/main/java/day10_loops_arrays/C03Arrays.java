package day10_loops_arrays;

import java.util.Arrays;

public class C03Arrays {

    public static void main(String[] args) {
        /*
        When we learn smt new follow these steps: 1)What is it about 2)Why I need to learn this
                                                   3) Low-level implementations 4)mid-level implementations
                                                   5)Advanced-level implementations   6)projects
          */

        //Arrays are used to store multiple data.
        //Data type of each element must be the same.

        //How to create an Array:
        String [] stdNames = new String [5]; //length of array. Length of 5
        //string array. Plural name since it has multiple datas
        //[null,null,null,null,null] default value of String is null

        //How to print Array on the console
        System.out.println(stdNames); //prints references //[Ljava.lang.String;@65ab7765

        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null]

        /*
        if we just use the name of the array only with sout, we are just taking the references of the array
                 if we use Arrays.toString(name of the array), we are taking the arrray
                 */

        //How to add elements to the Array;
        stdNames[0] = "Mary";
        stdNames[1]="Tom";
        stdNames[2] = "Murat";
        stdNames[3]= "Julie";
        stdNames[4]= "Murat";

        System.out.println(Arrays.toString(stdNames)); //[Mary, Tom, Murat, Julie, Murat]

        //How to get specific element from an Array
        String third = stdNames[2];
        System.out.println(third);//Murat


        //Example 1: Create an int Array then find the multiplication of them

        int [] numbers = new int[4];
        numbers [0] = 12;
        numbers [1] = 5;
        numbers [2] = 4;
        numbers [3] = 2;

        System.out.println(Arrays.toString(numbers));

        //First Way:
        int product = 1; //for multiplication is 1, for sum it is 0

        for(int i = 0; i< numbers.length; i++){
          product =  product*numbers[i];
        }
        System.out.println(product);

        //arrays has lengths. Now it's length is 4

        //second way:
        /*
        For Each Loop (Enhanced Loop).....> most updated loop
        works with Arrays and Collections. (non-primitive in heap memory)
         If you need to use indexes, you cannot use For Each Loop
         */


        int n = 1; //stands for product
        for (int w:numbers){ //[12,5,4,2]
            n = n*w;
        }
        System.out.println(n);
        //w is for the name. We mostly use 'w'

        //Example 2: Find the difference between maximum and min value of array elements
        //[8,12,34,10,78,19]

        int [] numsArray = {8,12,34,10,78,19}; //we have a list. we are not making from strach
        System.out.println(Arrays.toString(numsArray)); //[8, 12, 34, 10, 78, 19]

        Arrays.sort(numsArray);
        System.out.println(Arrays.toString(numsArray)); //[8, 10, 12, 19, 34, 78]
        //sort method put the array in the order from smallest to biggest

        int difference = numsArray[numsArray.length-1] - numsArray[0];
        //numsArray.length-1 is using to reach the last character in the Array

        System.out.println("difference = " + difference); //70

        //second way






    }
}
