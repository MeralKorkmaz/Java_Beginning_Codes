package day03_concatenation_scanner_class;

public class C01Concatenation {


    public static void main(String[] args) {
        //Concatenation: It is process of adding Strings or String with other data types
        //               Its symbol is "+"
        // When java see 3+4 the priority is addition
        //"3" + "4" the result is "34" and its concatenation

        String name = " Tom ";
        String lastName = " Hanks ";
        String fullName =  name + lastName;
        System.out.println("fullName = " + fullName);
        //we can add space between to Strings as name+ " " +lastName
        System.out.println("Tom" + "Hanks");
        System.out.println("Tom" +  "Hanks");
        System.out.println("Tom" + "   Hanks");
        System.out.println("Tom" + " "+ "Hanks");

        System.out.println("Tom" + 4 + 9); //"Tom49"
        //Java read code the left to the right

         System.out.println("Tom" + (4 + 9)); //"Tom13"
        System.out.println("Tom" + 3*5);//"Tom15"
        //* is before than +

        System.out.println(5+9+"Tom");//"14Tom"
        //mathematical operations has priority

        System.out.println(3+5*2+"Tom"+4+2);//"13Tom42"














    }
}
