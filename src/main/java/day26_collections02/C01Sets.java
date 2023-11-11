package day26_collections02;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C01Sets {

    /*
    For storing unique things,Set
    For constantly adding and removing, LinkedList

    1)Sets are used to store multiple "unique" data
    2)Hash: Hashing is a technique to create unique data
    3)Sets has three types: i)HashSet are used to store unique data
                              HashSet stores element in random order
                              HashSet can accept null element. If you put one null, it is unique
                              HashSet are super fast because they do not spend time to put them in order

                            ii)LinkedHashSet are used to store unique data.
                               LinkedHashSet  stores elements in insertion order (in the given order)

                            iii)TreeSet are used to store unique data
                                TreeSet stores elements in "natural order" (String ---> Alphabetical order
                                                                           (Integer --> Ascending order
                                                                           (all collections use wrapper class)
                                TreeSet are so slow because putting element in order takes time
     */

    //Java is using hashing technique to differentiate the stored data.

    public static void main(String[] args) {

        System.out.println("Hi");//to be fair

        long t1 = System.nanoTime(); //Returns the current value of the running Java Virtual Machine's high-resolution time source, in nanoseconds.

        HashSet<String> email = new HashSet<>();
        email.add("ab@gmail.com");
        email.add("dc@gmail.com");
        email.add("xy@gmail.com");
        email.add("mn@gmail.com");
        email.add("vy@gmail.com");
        email.add("ml@gmail.com");
        email.add("ab@gmail.com"); //HashSet ignores if you try to add an existing element. It will not throw exception.
        email.add(null);
        email.add(null);
        email.add(null);
        email.add(null);


        System.out.println(email);//[ab@gmail.com, xy@gmail.com, dc@gmail.com, mn@gmail.com]
                                  //after adding null [ab@gmail.com, null, xy@gmail.com, dc@gmail.com, mn@gmail.com]

        long t2 = System.nanoTime();
        LinkedHashSet<String> ids= new LinkedHashSet<>();
        ids.add("ab@gmail.com");
        ids.add("dc@gmail.com");
        ids.add("xy@gmail.com");
        ids.add("mn@gmail.com");
        ids.add("vy@gmail.com");
        ids.add("ml@gmail.com");
        ids.add("ab@gmail.com"); //LinkedHashSet ignores if you try to add an existing element. It will not throw exception.
        ids.add(null);
        ids.add(null);
        ids.add(null);
        ids.add(null);
        System.out.println(ids);//[ab@gmail.com, dc@gmail.com, xy@gmail.com, mn@gmail.com, vy@gmail.com, ml@gmail.com, null]

        long t3 = System.nanoTime();




        TreeSet<String> ssn = new TreeSet<>();
        ssn.add("ab@gmail.com");
        ssn.add("zc@gmail.com");
        ssn.add("xy@gmail.com");
        ssn.add("mn@gmail.com");
        ssn.add("vy@gmail.com");
        ssn.add("ml@gmail.com");
        ids.add("ab@gmail.com"); //TreeSet ignores if you try to add an existing element. It will not throw exception.

        //ssn.add(null); //We cannot add "null" to TreeSet ---> NullPointerException
        ssn.add("vy@gmail.com");
        ssn.add("vy@gmail.com");
        ssn.add("vy@gmail.com");
        ssn.add("vy@gmail.com");

        System.out.println(ssn);//[ab@gmail.com, ml@gmail.com, mn@gmail.com, vy@gmail.com, xy@gmail.com, zc@gmail.com]
        long t4 = System.nanoTime();

         /*
                                                         HashSet :709500
                                                         LinkedSet :1374100
                                                         ThreeSet : 1432600
                                                           */

        //Question: Which Data structure do you use if you need to store unique elements in natural order?
        //TreeSet
        //Question: But TreeSet is very slow. How do you prevent your codes from being slow?
        //I will use speed of HashSet to create Set and convert it to TreeSet

        HashSet<String> email1 = new HashSet<>();
        email1.add("ab@gmail.com");
        email1.add("dc@gmail.com");
        email1.add("xy@gmail.com");
        email1.add("mn@gmail.com");
        email1.add("vy@gmail.com");
        email1.add("ml@gmail.com");
        email1.add("ab@gmail.com");
        ssn.add("vy@gmail.com");
        ssn.add("vy@gmail.com");
        ssn.add("vy@gmail.com");
        ssn.add("vy@gmail.com");

        TreeSet<String> stdId = new TreeSet<>(email1);//we are converting the HashSet to ThreeSet

        long t5 = System.nanoTime();

        System.out.println("HashSet :" + (t2-t1));//HashSet is faster than LinkedSet
        System.out.println("LinkedSet :" + (t3-t2));
        System.out.println("ThreeSet : " + (t4-t3));
        System.out.println("HashSet + TreeSet:"  + (t5-t4));







    }
}
