package day09_loops;

public class C03ForLoops06 {

    public static void main(String[] args) {
        //Example 10: Find the sum of the digits of decimal part in a double number
       //            28.587 ==> 5+8+7=20

        double num = 28.587;

        //convert double to String
        String numStr = String.valueOf(num); //"28.587"
        //we are using String as one way since we can use split or subString to get rid of decimal part

        //use split() method to get decimal part(not substring since index can change because of digit
        String decimalStr = numStr.split("[.]")[1]; //"587"

        //Convert String to int
        int decimal = Integer.valueOf(decimalStr);//587
        int sum =0;
        for(int i = decimal; i>0; i/=10){
            sum = sum + i%10;
        }
        System.out.println(sum);
        //if we declare variable inside the loop, we cannot use it outside the loop















    }
}
