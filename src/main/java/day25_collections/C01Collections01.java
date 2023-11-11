package day25_collections;

//LinkedList is child of ArrayList, Queue(interface), Deque(interface)

/*Array is not a Collection. The size is fix. Collection's size can be changed
Array primitive and non-primitive's reference. Collections store non-primitive data.
For storing primitive data, convert them to Wrapper Class
Declaring Collection:
1)ArrayList<type> name = new ArrayList<>();
2)List<type> name = new ArrayList<>();
*/

/*
LinkedList has a value and a pointer. They are called that node, not index. The pointer is pointing the another node
The first node is pointed by head which is not contain any value. The head of the linked list is the reference to the first node. The last node which points null called tail.
We are using LinkedList to add and remove nodes.
Indexed is good for searching element. For searching, LinkedList is slow. They are starting from the beginning
 */

import java.util.ArrayList;
import java.util.LinkedList;

/*
1)ArrayLists and LinkedLists are child class of List Interface.
2)ArrayLists are successful in search operations,
 but LinkedLists are not successful in search operations
3)LinkedLists are successful in adding and removing operations,
but ArrayLists are not successful in those operations
4)LinkedLists have "nodes", not "elements"
"Nodes" have 2 part: i)data  ii)pointer(address)
First node is pointed by "head" and "last node" (tail) points null.
 */
public class C01Collections01 {
    public static void main(String[] args) {

        ArrayList<Integer> listArr = new ArrayList<>();

        LinkedList <Integer> myList = new LinkedList<>();

        myList.add(5);
        myList.add(1,8);
        myList.add(2,12);
        myList.addLast(7);//add last of the node
        System.out.println(myList);//[5, 8, 12, 7]

        myList.remove((Integer)12);//if we write only 4,12, Java will understand as index. So, we should indicate that it is Wrapper class by writing in the parenthesis
        System.out.println(myList);//[5, 8, 7]
        System.out.println(myList.remove());// 5 ----->Retrieves(return and removes the head (first element) of this list. "Cut-Paste"
        System.out.println(myList);//[8, 7]
       int removedNode =  myList.removeFirst();//Removes and returns the first element from this list. "Cut-Paste"
        System.out.println(removedNode);//8\
        myList.add(34);
        myList.add(4);
        myList.add(8);
        myList.add(10);
        System.out.println(myList);//[7, 34, 4, 8, 10]

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(8);
        list2.add(3);
        list2.add(34);
        System.out.println(list2);//[8, 3, 34]

        myList.removeAll(list2);
        System.out.println(myList);//[7, 4, 10]

        myList.add(10);
        myList.add(7);
        myList.add(10);
        myList.add(3);
        myList.add(10);
        System.out.println(myList);//[7, 4, 10, 10, 7, 10, 3, 10]
        myList.removeFirstOccurrence(7);//auto-boxing
        System.out.println(myList);//[4, 10, 10, 7, 10, 3, 10]
        myList.removeLastOccurrence(10);
        System.out.println(myList);//[4, 10, 10, 7, 10, 3]


    }










}
