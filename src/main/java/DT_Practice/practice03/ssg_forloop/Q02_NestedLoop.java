package DT_Practice.practice03.ssg_forloop;

import java.util.ArrayList;
import java.util.List;

public class Q02_NestedLoop {
    public static void main(String[] args) {

        /*
         * Type code to find the common elements between two String Arrays
         * (without case sensitivity) //equalsIgnoreCase()
         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         * Output : [brad,sofia,emily]
         */

        String[] arr= {"John","Brad","Angel","Sofia", "Emily"};
        String[] brr={"sofia","brad","grace","emily","hazel"};


        List<String> arrList = new ArrayList<>();

        for(String w: arr){

            for(String u: brr){
                if(w.equalsIgnoreCase(u)){

                    arrList.add(u);

                }

            }
            System.out.println(arrList);

        }





























    }
}
