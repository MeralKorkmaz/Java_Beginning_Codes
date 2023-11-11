package day27_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02Maps02 {

    public static void main(String[] args) {

             //Example 1: Type code to find the number of occurrences of words in a sentence
            // Java is easy, Java is OOP, OOP makes Java easy. ==> Java=3, is=2, easy=2, oop=2, makes=1

        String str = "Java is easy, Java is OOP, OOP makes Java easy.";

        //To store result we need Map
        Map<String,Integer> result = new HashMap<>();

        //remove punctuations mark

       str =  str.replaceAll("\\p{Punct}","");

        System.out.println(str);//Java is easy Java is OOP OOP makes Java easy

        //use split() to get words
       String[] words =  str.split(" ");//returns Array String
        System.out.println(Arrays.toString(words));//[Java, is, easy, Java, is, OOP, OOP, makes, Java, easy]

        //use loop to count number of words
        for(String w:words){
            Integer numOcc = result.get(w); //Map is empty. So, it returns null.
                                            //primitive data do not accept null
            if(numOcc==null){
                result.put(w,1);
            }else{
                result.replace(w,numOcc+1);
            }

            System.out.println(result);
             /*
            {Java=1}
            {Java=1, is=1}
            {Java=1, is=1, easy=1}
            {Java=2, is=1, easy=1}
            {Java=2, is=2, easy=1}
            {Java=2, OOP=1, is=2, easy=1}
            {Java=2, OOP=2, is=2, easy=1}
            {Java=2, OOP=2, makes=1, is=2, easy=1}
            {Java=3, OOP=2, makes=1, is=2, easy=1}
            {Java=3, OOP=2, makes=1, is=2, easy=2}
              */
        }
        System.out.println(result);//{Java=3, OOP=2, makes=1, is=2, easy=2}









    }
}
