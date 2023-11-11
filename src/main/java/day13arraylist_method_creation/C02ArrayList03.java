package day13arraylist_method_creation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02ArrayList03 {
    public static void main(String[] args) {
        //From a given list find all pairs whose sum is a given number
       //{4, 6, 5, -10, 8, 5, 20} ==> 10
       //For example;  4+6=10, 5+5=10, -10+20=10


        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(6);
        a.add(5);
        a.add(-10);
        a.add(8);
        a.add(5);
        a.add(20);
        System.out.println(a); //[4, 6, 5, -10, 8, 5, 20]


        for (int i = 0; i<a.size(); i++){
            for(int k = i+1; k<a.size(); k++){
                if(a.get(i) + a.get(k) ==10){
                    System.out.println(a.get(i) + " + " + a.get(k));//4 + 6; 5 + 5 ;-10 + 20
                }
            }
        }


        /*
        Short format to create ArrayList:
        We can create ArrayList by using Arrays.asList() method

         List<Integer> d = Arrays.asList(4,6,5,-10, 6);
        System.out.println(d);//[4, 6, 5, -10, 6]

        System.out.println(d.get(1));
        System.out.println(d.size());

        we can take the number and find the size from Array.asList

        But if we create List like Array.asList, we cannot use list methods which changes size of the list, like add(), remove(),
        clear().

        !!We can use set() method which update the element of the Array since we are not changing the size, we are just replacing one element with another one


        */



    }
}
