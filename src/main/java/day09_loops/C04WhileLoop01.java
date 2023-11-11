package day09_loops;

public class C04WhileLoop01 {

    public static void main(String[] args) {
        /*
        for(initial index ; Condition(ending index) ; increment/decrement){
            code to be executed
            }

         While Loop:
         initial index;
         while( Condition) {
         code to be executed;
         increment/decrement;
         }
         They work for the same purposes. Just structures are different
         */

        //Type numbers from 4 to 14 on the console

       //for loop
        for (int i=4; i<15; i++){
            System.out.print(i+ " ");
        }

        System.out.println();

        //while loop
        int k =4;
        while (k<15){
            System.out.print(k + " ");
            k++;
        }






    }
}
