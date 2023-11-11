package day24_exceptions02;
/*
  If we use to add "throws" keyword to the method signature as public static void readAndPrintFile() FileNotFoundException
                   Java will stop execution...>it the instructions say when you encounter any exception, stop the application, use it
    If we use "try-catch" block Java handles problem in prescribed way and continue
        to execution of the codes
        FileNotFoundException: Java throws FileNotFoundException if path is wrong or
                                file is not there.
    IOException: Java throws IOException for all issues related with input and output
    IOException is parent of  FileNotFoundException.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01Exceptions05 {

    public static void main(String[] args) {
        readAndPrintFile();

    }

    //Create a method that will read a text file.

    public static void readAndPrintFile(){

        try {
            //A way (link) to reach a file
            FileInputStream fis = new FileInputStream("src/main/java/day24_exceptions02/MyFile.txt");//FileNotFoundException

            //way to read a File:

            int k =0;//initially 0
            while(((k = fis.read()) !=-1)){//read get the first char and returns the ASCII value (in our example first Java reads "J" and It will return 74. It does not read all of them in one time. It's reading by one by
                {
                    System.out.print((char)k);// instead of printing ASCII value of the char, printing as char !!Type casting

                }



            }

        } catch (FileNotFoundException e) {
            System.out.println("The path is wrong or the file is deleted.....");//if you give Java  a wrong path, and if Java encounter an error, what should I do:
                                                                                //1) path is not correct
                                                                                //2)When Java check the path (folder),If the file shifted to another location or deleted
                                                                                //Java will throw this one
        } catch (IOException e) {
            System.out.println("The file contains chars that hard to read....");
        }
    }



}
