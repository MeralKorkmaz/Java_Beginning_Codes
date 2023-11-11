package day06_switch_ternary_stringmanipulations;

public class C03TernaryOperator01 {

    public static void main(String[] args) {

        //for if ....>if(condition){Code 1} els { Code 2}
        //for ternary....>Condition ? Code 1 : Code 2
        /*
        example1
        int y =10;
        int x = (y>5) ? (2*y) : (3*y);
        x = 20
         */

        /*
        int y =11;
        int z=11;
        int result = y<10 ? y++ : z++
        sout (result+ "," + y+ "," + z);
        result is 11 because it is post-increment
        So, z is 12
        11,11,12
         */

        //Example 1: Type code to check if a given number is even or odd
        int num1 = -33;

        String result1 = (num1%2==0) ? " Even" : " Odd";
        System.out.println(result1);


        //Example 2: Write a code to check if given number has three digits or not

        int num = -150;

        String result2 = (num<1000 && num>99) || (num>-1000 && num<-99) ? " It is three digit number " : " It is not three digit number";
        System.out.println(result2);

        //Example 3: Write a code to calculate absolute number value of a number
        int num3 = -23;
        int result3 = (num3<0) ? -1*num3 : num3;
        System.out.println(result3);

        //Example 4: Type code to find the multiplication of two integers if the signs are same.
         // Give a message like "I do not know how to multiply" if the signs are different.
          // 5 and 4 ==> 5*4    -3 and -2 ==> -3*-2    -4 and 3 ==> "I do not know how to multiply"

        int a = 5;
        int b = -9;
       Object result4 = (a<0 && b>0) || (a>0 && b>0) ? a*b : " I do not know how to multiply";

        //Object father of classes. Does not have a father like Adam
        System.out.println(result4);
        //0 does not have sign. It is neutral








    }
}
