package day23_exceptions;
//ArrayIndexOutOfBoundsException is class and e is its name
//Data types also class names. String is class name and data type
public class C03Exceptions03 {

    public static void main(String[] args) {
        String[] str = {"Fatih", "Kadir", "Emre", "Sloane"};
        printElementOnConsole(str,0);//Fatih
        printElementOnConsole(str,2);//Emrey
        printElementOnConsole(str,4);//ArrayIndexOutOfBoundsException Java throws .ArrayIndexOutOfBoundsException
                                        //when you give index which is equal or grater than length of the Array



        System.out.println((convertStringToInteger("123") + 1));//124
        System.out.println((convertStringToInteger("0") + 1));//1
        System.out.println((convertStringToInteger("-4") + 1));//-3
        System.out.println((convertStringToInteger("12a4") + 1));//NumberFormatException Java throws .NumberFormatException
                                                                // when we try to convert non-digit chars to int



    }

    //Type a method to print element from a given Array  on the console

    public static void printElementOnConsole (String[] s, int idx){
        try {
            System.out.println(s[idx]);////only do  an action do not give me another a return
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Given index is invalid for the given Array...");//Given index is invalid for the given Array...
            System.out.println(e.getMessage());//Index 4 out of bounds for length 4
        }

    }

    //Type a method that converts given String to An Integer
    public static Integer convertStringToInteger(String str){
        int result = 0;
        try{
            result =  Integer.valueOf(str);
        }catch (NumberFormatException e){
            System.out.println("String that you entered contains some non-digit characters...");
            System.out.println(e.getMessage());
        }
        return result;

    }
}
