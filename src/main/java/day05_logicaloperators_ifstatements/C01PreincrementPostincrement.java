package day05_logicaloperators_ifstatements;

public class C01PreincrementPostincrement {


    public static void main(String[] args) {

        /*
         Increment            Decrement
                1) a=a+2;           a= a-2;
                2) a+=3;            a-=3;
                3) a= a*5;          a *= 5;
                4) a= a/5           a /= 5;

        Java gives us opportunity to increment first (pre-increment) or increment
        later (post-increment) when we use two operations with special format to increment
         */

        int a = 12; //print on console and increment

        //pre-increment System.out.println(++a); first increase the value of a. Then, print.
        //There are two operator. Increment and print

        a+=1; //13.
        System.out.println(a); //13
        System.out.println(++a);//14

        //post-increment System.out.println(a++);
        System.out.println(a);//14
        a+=1; //15
        System.out.println(a++);//15
        //we are printing first. Increment later. a is before the ++
        System.out.println(a);//16

        int b = a++; //there are two operations: assignment and increment

        //Java is reading left to right. Java first read assignment and assign it to b
        //Then, it is continuing to read and make a 17 because of increment

        System.out.println(b);//16
        System.out.println(a);//17

        //Search oracle examination

        //pre-decrement "--a"
        int c= --a;

        // after assignment sign decrement first so it's making decrement first.
        //Then, assingning it
        System.out.println(c); //16

        //a is 16 because we made decrement

        //post- decrement " a--"
        int d  = a--;
        System.out.println(d);//16
        System.out.println(a);//15







    }
}
