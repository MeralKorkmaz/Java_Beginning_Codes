package day13arraylist_method_creation;

import java.util.ArrayList;
import java.util.Collections;

public class C01ArrayList02 {
    public static void main(String[] args) {

        //Example: Create a Character list which has repeated chars and remove duplicates
        //[J,a,v,a,c] ......> [J,a,v,c]

       ArrayList<Character> a = new ArrayList<>();
       a.add('J');
       a.add('a');
       a.add('v');
       a.add('a');
        a.add('c');
        System.out.println(a);//[J, a, v, a, c]
        ArrayList<Character> b = new ArrayList<>();


        for ( Character w:a){
            if(!b.contains(w)){
                b.add(w);
            }

            }
        System.out.println(b);//[J, a, v, c]



        //Example 4: Find the closest 2 integers in the given list.
      // [20, 15, 14, 11, 19] ==> 14-15, 19-20 the difference between them must be lesser


        //Arrays work with non-primitive data such as wrapper class

        ArrayList<Integer> c = new ArrayList<>();
       c.add(20);
        c.add(15);
        c.add(14);
        c.add(11);
        c.add(19);
        System.out.println(c);//[20, 15, 14, 11, 19]

        //ArrayLists are member of collections not Array
        //There is no method when we write "ArrayList." ArrayList are collections. So, we should write "Collections." to use the methods

       //first step: sort the ArrayList
        Collections.sort(c);//to sorting ArrayList
        System.out.println(c);//[11, 14, 15, 19, 20]

        //Second step find the difference and the minDiff

        //we are dealing with indexs. So, we are using for loop

        int minDiff = c.get(1)-c.get(0); //3
        //we are using get() method to take the number
        for(int i = 1; i<c.size(); i++){

           if (c.get(i) -c.get(i-1) < minDiff) {
               minDiff = c.get(i) - c.get(i-1);


            }


        }
        System.out.println(minDiff);//1

        //last step: find elements that they have minDiff among them



        for(int k = 1; k<c.size(); k++){

            if (c.get(k) -c.get(k-1)== minDiff) {
                System.out.print(c.get(k-1) + " and  " + c.get(k) + "  "); //14 and 15 19 and 20



            }


        }





































    }
}



