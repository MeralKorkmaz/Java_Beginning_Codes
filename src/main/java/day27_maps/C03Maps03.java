package day27_maps;

import java.util.Hashtable;
import java.util.TreeMap;

public class C03Maps03 {
    /*
    HashMap :  1) It does not put Entries in order ----> Random order ------> It is fast
               2) It allows you to use null in "Key" or "value"
               3) It is not "Thread-Safe" and not "synchronised" //you cannot use it for multiple tasks at the same time
                                                                //synchronised means putting them logical older and HashMap cannot do it
                                                                //To become Thread-safe you should synchronised

    HashTable:  1) It does not put Entries in order ----> Random order ------> It is slower than HashMap
                2) It does not allow you to use null in "Key" or "value"
                3) It is  "Thread-Safe" and  "synchronised"

    TreeMap:    1) It puts Entries in natural order according to their key---> It is slow (null is no String or numerical value)
                2) It does nor accept "null" as Key, but it accepts multiple "values" as "null"
                3) It is not "Thread-Safe" and not "synchronised"

      */

    public static void main(String[] args) {
        Hashtable<Integer, String> define = new Hashtable<>();
        define.put(1,"Baby");
        define.put(15,"Teenager");
        define.put(56,"Senior");
       // define.put(56,null);//NullPointerException
        // define.put(null, "baby");//NullPointerException
        //define.put(24, "null"); //{15=Teenager, 24=null, 56=Senior, 1=Baby} here "null"  is Sting

        System.out.println(define);//{15=Teenager, 56=Senior, 1=Baby}


        TreeMap<Integer,String> define2 = new TreeMap<>();
        define2.put(1,"Baby");
        define2.put(15,"Teenager");
        define2.put(56,"Senior");
        define2.put(57, null);
        //define2.put(null, "null");//NullPointerException //key cannot be null on TreeMap

        System.out.println(define2);//{1=Baby, 15=Teenager, 56=Senior} {1=Baby, 15=Teenager, 56=Senior, 57=null}

        //Homework: Create a method to display the number of occurrences of letters in a sentence
        // Java, Java, I love Java. ==> J=3, a=6, v=4, I=1, l=1, o=1, e=1






    }
}
