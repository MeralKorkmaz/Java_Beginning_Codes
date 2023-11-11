package day26_collections02;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C02Queue {

    /*
    You are running cathering. You should not sell the fresh one. You should sell the one's date is near to expire.
    The first caller must speaks with the customer service.
    You cannot get third or fifth in Queue. You can only deal with first element. You can add and delete the first element in Queue
     */

    /*
    1)Whenever you need to use "FIFO" (First In First Out) scenarios, remember to use "Queue"
    2)You have 2 options to use "Queue": i)LinkedList: Insertion Order
                                                       Who comes first
                                         ii)PriorityQueue: Uses for priority order.
                                                           If we want to serve firstly the person that older than 50 in the emergency.
     3)"Deque" is an interface, stands for "double ended Queue", use it whenever you need to work with "FIFO" ana "LIFO"
     */
    public static void main(String[] args) {

        Queue<String> food = new LinkedList<>();
        food.add("Meat");
        food.add("Cheese");
        food.add("Milk");
        food.add("Egg");
        food.add("Candy");
        food.add("Candy");//we can add same multiple element

        //We cannot use food.get(); since Queue only works with first element
        System.out.println(food);//[Meat, Cheese, Milk, Egg, Candy, Candy]

        PriorityQueue<String> f = new PriorityQueue<>(); //(it has more methods) PriorityQueue is child of Queue. We can do like that Queue<String> f = new PriorityQueue<>();
        f.add("Meat");
        f.add("Cheese");
        f.add("Milk");
        f.add("Egg");
        f.add("Candy");
        f.add("Candy");
        System.out.println(f);//[Candy, Cheese, Candy, Meat, Egg, Milk] we do not assign any priority. So, Java is applying of its own logic

       Deque<String> d = new LinkedList<>();
       d.addFirst("A");
       d.addFirst("B");
       d.add("x");
       d.addLast("Y");
       d.addFirst("X");
       d.addFirst("A");
        System.out.println(d);//[B, A] [B, A, x] [B, A, x, Y] [A, X, B, A, x, Y

        //Deque is great with removing and adding

        d.remove();
        d.removeLast();
        d.removeLastOccurrence("x");
        d.remove("A");
        System.out.println(d);//[X, B, A, x, Y] [X, B, A, x] [X, B, A] [X, B]

        //thread-safe means it is able to handle several task at the same time
        //synchronized to handle several tasks











    }
}
