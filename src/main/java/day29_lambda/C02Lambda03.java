package day29_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C02Lambda03 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        printAscendListAccToLengUpCase(names);//TOM JIM ALEX MARY ALEX MICHAEL ALEXANDER
        System.out.println();
        printAscendListAccToLengAndAlphaUpCase(names);//JIM TOM ALEX ALEX MARY MICHAEL ALEXANDER
        System.out.println();
        System.out.println(isLengthOfAllElementGreaterThanNum(names,2));//true
        System.out.println(isLengthOfAnyElementGreaterThanNum(names, 5));//true
        System.out.println(isNonOfElementsStartsWithValue(names, "s"));//true(none of them starts with "s")
        //System.out.println(isNonOfElementsStartsWithValue(names, " ")); If none of them starts with space, it will return true. If I make a space before Jim such as names.add(" Jim");
                                                                        //It will return false.

    }


    //Example 1: Print the list elements on the console with all characters in uppercase by sorting in ascending order by using length

    public static void printAscendListAccToLengUpCase(List<String> list){
        list.stream().sorted(Comparator.comparing(t->t.length())).map(t-> t.toUpperCase()).forEach(t-> System.out.print(t + " "));
                //sometimes we should write as t.toString().length();

        //forEach();--->Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception
        //we print all the elements by using forEach() method.
        //we use map() to modify all elements to make uppercase
    }

    //Example 2: Sort the elements by using their lengths, if some elements are in the same length put them in alphabetical order
    //How can we do multiple comparing

    public static void printAscendListAccToLengAndAlphaUpCase(List<String> list){
        list.
                stream()
                .map(t-> t.toUpperCase()).
                sorted(Comparator.comparing(t->t.toString().length()).thenComparing(t->t.toString().charAt(0))).
                forEach(t-> System.out.print(t + " "));
    }

    //Example 3: Create a method checks if the length of all elements are greater than a given value
    public static boolean isLengthOfAllElementGreaterThanNum(List<String> list, int num){
       return list.stream().allMatch(t->t.length()>num);

        //If all elements must match with the condition, we use allMatch
        //If I want to check if some element match with the condition, AnyMatch();
        //If I  do not want them to match with the condition, NoneMatch();

    }

    //Example 4: Create a method checks if the length of any element is greater than a given value

    public static boolean isLengthOfAnyElementGreaterThanNum(List<String> list, int num){
        return list.stream().anyMatch(t->t.length()>num);

    }

    //Example5: Crete a method checks if no element starts with the given value

    public static boolean isNonOfElementsStartsWithValue(List<String> list, String s){
        return list.stream().noneMatch(t->t.substring(0,1).equals(s));
                //I cannot use it charAt() since we cannot compare integer with String
    }


    /*
    when you use charAt(), it returns char
    when you use substring(), it returns String.
     */








}
