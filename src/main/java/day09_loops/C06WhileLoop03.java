package day09_loops;

public class C06WhileLoop03 {

    public static void main(String[] args) {
        //Example 3: Type code to find the sum of the digits of an integer
       //        587 ==> 5+8+7=20


        int i = 587;
        int sum =0;

        while (i>0) {
            sum = sum + i%10; //we are using it to take last digit.
            i/= 10; //by dividing we are making 587 to 58 so we can take the last digit of it

        }
        System.out.println(sum);

        //Example: Type a code to print table of multiplication for a given number
        // 3.....> 3

        int num = 3;
        int k = 0;

        while (k<11){
            System.out.println(num + "*" + k + "=" + num*k);
            k++;
        }
















    }
}
