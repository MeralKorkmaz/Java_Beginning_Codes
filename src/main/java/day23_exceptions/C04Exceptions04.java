package day23_exceptions;

public class C04Exceptions04 {
    /*
    1)In Java, "Exception" and "Error" can be thrown.
    2)What is the difference between "Exception"(burglar call police) and "Error"(losing consuions)?
     "Exception" can be handled but "Error" cannot be handled.
     Examples of Errors:    StackOverFlowError:   Stack memory is full. (increase Stack memory size. You cannot create any new data)
                            OutOfMemoryError:     Heap memory is full (We cannot create new class, object, String)
                            VirtualMachineError:  Cannot compile the datas

     Examples of Exceptions:    i)  Runtime Exceptions (it's throwing it while running the code)
                                    ArithmeticException
                                    NullPointerException
                                    NumberFormatException
                                    ArrayIndexOutOfBoundsExceptions
                                    StringIndexOutOfBoundsExceptions
                                    ......


                                ii) Compile Type Exceptions  (It's throwing it while we are typing the code.)
                                     FileNotFoundException
                                     IOException
                                     .......

    3)When we use multiple catch blocks, if there is parent-child relation between Exceptions we must put
    child catch block first.





     */

    public static void main(String[] args) {
        System.out.println(convertCharToIntFromString("12345", 2));//3
        System.out.println(convertCharToIntFromString("12345", 5));//StringIndexOutOfBoundsException throws .StringIndexOutOfBoundsException
                                                                          //When we try to get char at out of bond (out of the limit of String)

        System.out.println(convertCharToIntFromString("12a45", 5));//NumberFormatException


        System.out.println(convertCharToIntFromStringg("12345", 5));
        System.out.println(convertCharToIntFromStringg("12a45", 2));


    }

    /*
    Catch is emergency. if there is an exception Java  directly skips to the catch part without printing anything in the try part
     we should the exceptions in the order. we are  starting form main method. and catch is like else
     the related catch block is taking a part.
     */



    //Create a method gets a character from a given String and converts it to int


    //First way: We may prefer to handle multiple exceptions separately.

    public static int convertCharToIntFromString(String str, int idx){
        int result = 0;
       try {
           String ch = str.substring(idx, idx+1);// String ch = str.charAt(idx) we are takes our chars from given String

           return Integer.parseInt(ch);

       }catch (StringIndexOutOfBoundsException e){
           System.out.println("Index cannot be longer than length of the String...");

       }catch(NumberFormatException e){
           System.out.println("String Should not contain non-digit character");
       }
       return result;


    }
    public static int convertCharToIntFromStringg(String str, int idx){
        int result = 0;
        try {
            String ch = str.substring(idx, idx+1);// String ch = str.charAt(idx) we are takes our chars from given String

            return Integer.parseInt(ch); //int

        }catch (Exception e){//Exception class is parent of Exception Classes (exception is not abstract class. It's child of Throwable)
            System.out.println(e.getMessage());

        }

        return result;
    }

    //Third Way
    public static int convertCharToIntFromStr(String str, int idx){
        int result = 0;
        try {
            String ch = str.substring(idx, idx+1);// String ch = str.charAt(idx) we are takes our chars from given String

            return Integer.parseInt(ch); //int

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index cannot be longer than length of the String...");


        } catch (Exception e){//Exception class is parent of Exception Classes (exception is not abstract class. It's child of Throwable)
            System.out.println(e.getMessage());

        }

        return result;
    }


    /*
    Some exception needs special care to solve the problem such as StringIndexOutOfBoundsException
    Normally when you get two exception the order is not important to solve the problem.
    If you have more than one exception, if there is parent-child relation between Exceptions and if some of them need special care to solve it, you should write it in the first,
    then we should write the parent Exception (except the one that need special care, we can solve Exceptions in the parent
    Exception.)
    We, however, write the parent exception first since  it is useless to write the one that need special care.
     */






}
