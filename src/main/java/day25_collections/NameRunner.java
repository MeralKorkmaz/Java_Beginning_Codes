package day25_collections;

import java.util.ArrayList;
import java.util.List;

public class NameRunner {

    public static void main(String[] args) throws IllegalNameException {
        List<String> names = new ArrayList<>();
        addName(names,"George");
        addName(names,"M");//[George, M]
        //addName(names,"4Andy");//.IllegalNameException.Names must start with letters
        System.out.println(names);

    }

    //Create a method that adds given name to a class list
    public static void addName(List<String> list, String name) throws IllegalNameException {
        char initial = name.charAt(0);
        if (initial>64 && initial<123){
            //initial >='A' && initial <='Z'
            list.add(name);
        }else{
            throw new IllegalNameException("Names must start with letters");

        }

    }
}
