package day29_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C01Lambda02 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);//131

        System.out.println(sumOfSquareOfDistinctEvenElements(nums));//456
       // System.out.println(productOfDisCubeOfOddElements(nums)); from second example
        System.out.println(productOfDisCubeOfOddElements(nums));//45
        System.out.println(findMaximum1(nums));
        System.out.println(findMinValueOfEvenGraterThan(nums, 7));//10
    }


    //Example1: Create a method that calculates the "sum" of the "square" of "distinct" "even" elements of a list
    public static int sumOfSquareOfDistinctEvenElements (List<Integer> list){
        return list.stream().distinct().filter(number-> number%2==0).map(t-> t*t).reduce(0,(t,u)-> t+u);

        /*
        The stream() method converts a collection into a stream, which is a sequence of elements that can be processed in parallel or sequentially.
        This allows you to perform various operations on the elements of the collection in a functional and declarative manner.
        we are using distinct() to not allow repetition. In our example, we have one 9 and 12 after using distinct()
        we gave a condition with filter() ----> (we got the elements which can be divided by 2
        map() is using  to modify  the elements(we took the square of the elements)
        reduce() is used to make one elements from the elements. We used it for sum.
        t and u are variables. Java can understand that you are Integer
        t always getting to value from the reduce part.

        we used reduce() to reach sum
        we used map() to reach square of the elements
        we used distinct() to make the elements distinct
        we used filter() to reach only even numbers

        */
    }



        /*
    //Example 2: Create a method that calculate the "multiplication" of "cube" of "distinct" "odd" elements in a list
    public static int productOfDisCubeOfOddElements(List<Integer> list){
        return list.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).reduce(1,(t,u) -> t*u);
        /*
        identity element will not affect result.
        To make mathematical operation use identity element, then write your operation.
        1 is for multiplication, 0 is for addition

    */

    //Example 3: Create a method that calculate the "multiplication" of "cube" of "distinct" "odd" elements in a list
    public static int productOfDisCubeOfOddElements(List<Integer> list){
        return list.stream().distinct().filter(t-> t%2!=0).map(t-> t%10).reduce(1,(t,u) -> t*u);

        //by using with map() we modified the elements(we took the last digit of the elements)

    }

    //Example  4: Find the maximum elements in the list
    //First way:

    public static int findMaximum1(List<Integer> list){

        return list.stream().distinct().reduce(list.get(0), (t,u) -> t>u ? t : u);
                                              //with get(), I got my first element
                                              //we used reduce() to compare the elements and reach the biggest one.
                                              //by using it, we reduced the elements.
    }


    //second way:Put the elements in ascending order then the last element will be the maximum (use sort())
    public static  int findMaximum2(List<Integer>list){
      return list.stream().distinct().sorted().reduce((t,u)-> u).get();
              /*
              sorted() orders elements is their natural order
              recuce() method with 2 parameter, returns you Integer
              reduce() method with 1 parameter, returns you optional Integer
             1) You can add optional Integer.  public static optional findMaximum2(List<Integer>list) . But the result is optional(131)
              get() method changes the optional Integer to regular Integer
               System.out.println(findMaximum1(nums)).get();
               2) You can add get() in method body.
               list.stream().distinct().sorted().reduce((t,u)-> u).get();
               Java gives us since after doing changes we might have no elements anymore. It can be null and It can throw exception. So, Java has optional.

               */
    }


    //Third way:Put the elements in descending order then the first element will be the maximum

    public static  int findMaximum3(List<Integer>list){
        return list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        //there is no findLast() method
        /*
        we have 2 sorted() method.
        The first one is sorting the elements for their natural order
        The second one is sorting the elements for my condition
        !Comparator.reverseOrder() is ordering the elements by reversing them.

         */
    }

    //Homework: Find the minimum element in the list by using 3 ways.

   //Example 4: Create a method to find the minimum value which is greater than 7 and even from the list

    public static int findMinValueOfEvenGraterThan(List<Integer> list, int num){
        return list.
                stream().
                distinct().
                filter(t-> t%2 ==0 && t>num).
                sorted().
                findFirst().
                get();//method chain
    }










































}
