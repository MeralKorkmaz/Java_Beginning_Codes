package day27_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01Maps01 {

    /*
    Array has fix length. For using flexible length use ArrayList
    Key is unique. So, entry is unique. All entries are called entry set and all of them is unique

    You cannot use maps with loop. You should convert it to Entry Set

     */

    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Tom",53);//There is not add() method in maps. So, we use put() method instead.
        stdAges.put("Angeline",57);
        stdAges.put("Linda",23);
        stdAges.put("Leo",51);
        stdAges.put("Brad",39);
        stdAges.put("Linda",12); // If you use the same key the value will be overridden

        System.out.println(stdAges);//{Angeline=57, Tom=53, Leo=51, Brad=39, Linda=23} {Angeline=57, Tom=53, Leo=51, Brad=39, Linda=12}

        //How to work with keys only:
        //Example : Get the total number of characters in student name:

        //System.out.println(stdAges.get("Tom"));//53 it return the value of key

        Set<String> keys = stdAges.keySet();//Returns a Set view of the keys contained in this map.
        System.out.println(keys);//[Angeline, Tom, Leo, Brad, Linda]

        int numOfChars = 0;

        for(String w: keys){
            numOfChars = numOfChars + w.length();
        }

        System.out.println("numOfChars = " + numOfChars);

        //How to work with values
        //Example 2 : Find the average age of the student

        Collection<Integer> values =  stdAges.values(); //we cannot use set since values can be same.
        System.out.println(values);//[57, 53, 51, 39, 12] for collections [], for maps {}

        double sum = 0;

        for(Integer w:values){
            sum = sum + w;

        }
        System.out.println("sum: " + sum);
        //we can do as "double average = (double)sum/ values.size();" by using type casting to convert int to double//size() method return length of the Collection. We use length() for String

        double average = sum/ values.size();
        System.out.println(average);//42.4

        //How to loop with entries
        //Example 3: Find the sum of the number of characters and the age for each individual entries:

        //for(Map<String,Integer> w:stdAges) it is compleaning since we cannot use loop for maps

        Set <Map.Entry<String,Integer>> entries = stdAges.entrySet();//we are changing map to Set of Entries which called as EntrySet
        System.out.println(entries);//[Angeline=57, Tom=53, Leo=51, Brad=39, Linda=12] Collection
                                    //{Angeline=57, Tom=53, Leo=51, Brad=39, Linda=12} Maps

        for(Map.Entry<String,Integer> w: entries){

            int total = w.getKey().length() + w.getValue();

            //we took the first part  and second part
            System.out.println("For " + w.getKey() + ": " + total);
                                                    /*
                                                    For Angeline: 65
                                                    For Tom: 56
                                                    For Leo: 54
                                                    For Brad: 43
                                                    For Linda: 17
                                                     */
        }

        //Common methods that we use with Maps:
        int age = stdAges.get("Linda");//it's printing the value of key
        System.out.println(age);//12

        //stdAges.putIfAbsent("Tom", 35);//it there is no tom, we would see tom 35 {Angeline=57, Tom=53, Leo=51, Brad=39, Linda=12}
        stdAges.putIfAbsent("Tommy" ,35);
        System.out.println(stdAges);//{Angeline=57, Tom=53, Leo=51, Brad=39, Tommy=35, Linda=12} //it checks and if there is no key, it adds new key and value

        stdAges.replace("Leo", 55);//When you want to update a value of an entry use replace() not put()
                                   //main functionality of put() is not updating, it is adding the new value
        System.out.println(stdAges);//{Angeline=57, Tom=53, Leo=55, Brad=39, Tommy=35, Linda=12}

        stdAges.replace("Brad",23,45);//it's old value is not 23. So, it is not affecting.
        System.out.println(stdAges);//{Angeline=57, Tom=53, Leo=55, Brad=39, Tommy=35, Linda=12}
        stdAges.replace("Brad",39,45);//it's old value is 39. So, it's updated its value
        System.out.println(stdAges);//{Angeline=57, Tom=53, Leo=55, Brad=45, Tommy=35, Linda=12}

        System.out.println("stdAges.containsKey(\"Leon\") = " + stdAges.containsKey("Leon"));//stdAges.containsKey("Leon") = false
        //There is no Leon in the Maps

        System.out.println("stdAges.containsKey(\"Leo\") = " + stdAges.containsKey("Leo"));

        boolean r1 = stdAges.containsValue(45);
        System.out.println(r1);//true

        int num = stdAges.getOrDefault("Linda", 0);//If there is Linda, return its own value
        System.out.println(num);//12

        int num1 = stdAges.getOrDefault("Inda", 0);//If there is no Inda, it's defult value is 0. We can change the default Values
        System.out.println(num1);//0
        System.out.println(stdAges);//{Angeline=57, Tom=53, Leo=55, Brad=45, Tommy=35, Linda=12} //the new value is not adding.

        stdAges.remove("Leo");
        System.out.println(stdAges);//{Angeline=57, Tom=53, Brad=45, Tommy=35, Linda=12}

        stdAges.remove("Brad",44);//it will not be applied since Brad's value is 45, not 44
        System.out.println(stdAges);//{Angeline=57, Tom=53, Brad=45, Tommy=35, Linda=12}

        stdAges.remove("Brad",45);
        System.out.println(stdAges);//{Angeline=57, Tom=53, Tommy=35, Linda=12}


    }
}
