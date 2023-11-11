package day25_collections;

import java.util.Collections;
import java.util.LinkedList;

public class C02Collections02 {
    /*
    Interface does not need to override all methods
    Concrete class must override all methods
    Interface does not have constructor
     */

    /*
    peek() and element() methods return the first node without removing it
   For empty list peek() returns "null"
   For empty list element() throws exception
     */

    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();
        countries.add("France");
        countries.add("Italy");
        countries.add("Albania");
        countries.add("Belgium");
        countries.add("Germany");
        System.out.println(countries);//[France, Italy, Albania, Belgium, Germany]


        LinkedList<String> names = new LinkedList<>();

        Collections.sort(countries);//To sort we are not using "collections.". We are using Collections
        System.out.println(countries);//[Albania, Belgium, France, Germany, Italy]

        String country = countries.peek(); //Retrieves, but does not remove, the head (first element) of this list (go and bring me the first node on the list)
        System.out.println(country);//Albania
        System.out.println(countries);//[Albania, Belgium, France, Germany, Italy]

        System.out.println("names.peek() = " + names.peek());//names.peek() = null


        String cnt = countries.element(); //Retrieves, but does not remove, the head (first element) of this list.
        System.out.println("cnt = " + cnt);//cnt = Albania

        //System.out.println("names.element() = " + names.element());//NoSuchElementException

        /*
        if there is no money on the ATM machine and if someone wants to withdraw a money, we should use element(), instead of peek().
        It will throw an exception. We can use try-catch block. We can give a message as "There is no money"
         */

        //poll() and pop() methods
        String cnt2 = countries.poll();//Retrieves and removes the head (first element) of this list.
        System.out.println(cnt2);//Albania
        System.out.println(countries);//[Belgium, France, Germany, Italy]
        System.out.println("names.poll() = " + names.poll()); //names.poll() = null

        String cnt3 = countries.pop();// removes and returns the first element of this list.
        System.out.println(cnt3);//Belgium
        System.out.println(countries);//[France, Germany, Italy]
        //System.out.println(names.pop()); //NoSuchElementException. Also, remove() throws an exception to empty one.

        /*if there is only 400$ on the ATM machine and if someone withdraw this amount and the other person wants to  withdraw a money, we should use pop(), instead of poll().
                It will throw an exception to the second person. We can use try-catch block. We can give a message as "There is no money".

         */


    }
}
