package day02_datatypes;

public class C03WrapperClass {

    public static void main(String[] args) {
        //Wrapper Class: Java created a new data structure by adding some useful methods to primitive data types
        //              This new structure called as "Wrapper Class"
        // Java created wrapper class for every primitive data

        /*
             Primitive                      Wrapper Class
             byte         ........>          Byte
             short        ........>          Short
             int          ........>           Int
             long         ........>           Long
             float        ........>           Float
             double       ........>           Double
             boolean      ........>           Boolean
             char         ........>           Charter

         */
        //primitive data does not have methods
        int weight = 25;

        //wrapper class has useful methods
        Integer height = 120;

        //We can find max or min value of int data by using Wrapper Class method

        System.out.println(Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);


        //Auto Boxing: Converting primitive data to Wrapper Class (Java does this operation automatically)
        char chr = '?';
        Character chr2 = chr;

        //boxing because there is one variable and we wrapping or surronding with method. We cover primitive data types with methods and called wrapper class

        //Unboxing: Converting Wrapper Class data to primitive data (Automatically)

        Boolean b1 = true;
        //String str = b1.toString(); //the return type is "true"

        //System.out.println(b1.equals(false));

        //String str = b1.toString(); //true
        //System.out.println(b1.equals(true));

        boolean b2 = b1;
        b1.booleanValue(); //it is making unboxing
        //just we are taking the primitive data. b1 is still wrapper class



        //.......Examples.......
        Double num = 43.5; //change data type to short by wrapper class method
        num.shortValue();  //43
    // we can convert it by type casting but it's so long. First we need to change the wrapper class to
        //primitive data. Then we can do type casting

        short fromDouble = num.shortValue();

        // to make String
        String strFromDouble = num.toString(); //"43.5"

        System.out.println(num/5);

        //System.out.println(strFromDouble/5); it is not allowed. We cannot divide Strings

        String str1 = " 99.5 "; //convert it to double
        double fromString = Double.valueOf(str1); //99.5. It is converting the String to double Wrapper Class. We need to do unboxing

        String str2 = " 99 ";
        int number = Integer.valueOf(str2);
        //int number makes unboxing












    }

}
