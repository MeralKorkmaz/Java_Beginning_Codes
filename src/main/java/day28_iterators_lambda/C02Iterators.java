package day28_iterators_lambda;

    /*
            1)  We can use Iterators when we are handling Collection.
            2)  Iterators does the same thing that loop does.
            3)  In terms of performance they are the same
            4)   In "Iterators" we avoid possibility of infinite loop
            5)  Iterators are good at removing and updating Collection elements
            6)  Iterators have two types:
                                    i) Iterator: It can be used to remove elements only.
                                                 It has one direction. (From left to right)
                                    ii) ListIterator : can be used to remove, add and update elements
                                                       It has two direction
     */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02Iterators {

    public static void main(String[] args) {

        List<String > myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);  // [Tom, Jim, Clara, Angie, Mark]
        Iterator<String> itr = myList.iterator();  // [ Tom,  Jim,  Clara,  Angie,  Mark ]
        /*
         next():            Returns the next element in the iteration.
         remove()          Removes from the underlying collection the last element
                            returned by this iterator (optional operation).
                            This method can be called only once per call to next.
        hasNext():         Returns true if the iteration has more elements.
                          (In other words, returns true if next would return
                          an element rather than throwing an exception.)
         */
        // Remove all elements from mylist:
        while (itr.hasNext()){
            itr.next();
            itr.remove();
        }
        System.out.println(myList);
        List<String > list2 = new ArrayList<>();
        list2.add("Tom");
        list2.add("Jim");
        list2.add("Clara");
        list2.add("Angie");
        list2.add("Mark");
        System.out.println(list2);  // [Tom, Jim, Clara, Angie, Mark]

        Iterator<String> itr2 = list2.iterator();

        // Remove all elements except "Clara":

        List<String > list3= new ArrayList<>();
        list3.add("Tom");
        list3.add("Jim");
        list3.add("Clara");
        list3.add("Angie");
        list3.add("Mark");



    }

}
