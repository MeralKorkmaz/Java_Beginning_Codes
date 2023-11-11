package day09_loops;

public class C07DoWhileLoop {

    public static void main(String[] args) {

        /*
        While Loop
        int i = 1;
        while(condition){
        code;
        increment/decrement;
        }


        Do While Loop
        int i = 1;
        do{
        code;
        increment/decrement;
        }
        while (Condition);

        While loop check the condition, then run it. Do While loop run the code then check it
        */

        int i =1;
        while(i<1){
            System.out.println("I am while loop...");
            i++;
        } // i is not less than 1 so while loop is not executed

        int k = 1;
        do{
            System.out.println("I am Do While loop....");
            k++;
        }while (k<1); //even the condition wrong, do while loop is printing it for one time. For Game

        /*
        Note 1: Zero Execution is possible for while-loop and for loop, but it is not possible for do-while loop
      Note 2: do-while loop body is executed at least once.
       Note 3: do-while loop is good to use game creation
         */

        //Example: Type a code to reverse a String
        // "Tom Hanks"...> "sknaH moT"

        String str = "Tom Hanks";
        String reverse = "";

        int j = str.length()-1;
        do {
           reverse =  reverse + str.charAt(j);
           j--;
        }while (j>=0);
        System.out.println(reverse);







    }
}
