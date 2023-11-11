package day24_exceptions02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02Exceptions06 {
    /*
     "throw" key word is used to throw Exceptions, "throws" keyword is used to handle an Exception
     "throw" is used in method body, "throws" keyword is added to method signature (name (parameter) throws IOException)
     "throw" keyword can be used several times in the method body, "throws" keyword is used only one.
     after "throw" we create exception object( throw new IllegalArgumentException(parameter);), after "throws" we add Class Name ( throws IOException(ClassName))
     after "throw" a single constructor can be used, after "throws" several ClassNames can be used.
     */
    public static void main(String[] args) throws IOException  {
        printAge(23);//23
        //printAge(-23);//IllegalArgumentException:Age cannot be less than 0..... we created this Exception. Before the exception, it was -23
        readAndPrintFile();

    }

    //Create a code that prints given age
    public static void printAge(int age){
        if(age>=0){
            System.out.println(age);
        }else {
            throw new IllegalArgumentException("Age cannot be less than 0.....");//creating object from exceptions
                                                   //constructor can have simple String message as a parameter
        }


    }

    //Create a method that will read a text file.

    public static void readAndPrintFile() throws IOException {//throws stop the execution
        // Way to reach a file
        FileInputStream fis = new FileInputStream("src/main/java/day24_exceptions02/MyFile.txt");
        // way to read a File:
        int k =0;
        while ((k = fis.read()) !=-1){
            System.out.print((char)k);
        }
    }


    /*
    If Java cannot find the file or read. We have 2 options:
    1)use try-catch block to show how can Java solve the problem
    2)Use throws keyword for stopping the execution. It's going to  throw an exception to user

    !If we want to declare an exception for circumstance that Java finds well, but we do not
    use "throw"
     */









}
