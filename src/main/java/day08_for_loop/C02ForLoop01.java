package day08_for_loop;

public class C02ForLoop01 {

    public static void main(String[] args) {

        //Type "Hi" 5 times on the console.

        //It's the primitive one
        //Typing like below is difficult to type, to update, to fix bugs in it
        //It has many repetitions.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        /*
        Java created loop to make repeating actions easy
        There are 4 types of loops:
        1) For Loop 2)While Loop 3)Do While Loop 4)For each Loop
         */
        System.out.println("Before loop....");

        //For Loop: .....> takes three parameters
        //  Starting point    Condition   increment/decrement
        for(int i = 1;        i<6;        i++                ){
            System.out.println("Hi");

        }

        //Example 2: Type code to print numbers from 15 to 4 on the console on the same line
         for(int i=15; i>3; i-- ){
             System.out.print(i + " ");
         }




    }
}
