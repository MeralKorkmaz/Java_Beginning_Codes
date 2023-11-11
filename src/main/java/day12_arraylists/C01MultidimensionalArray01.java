package day12_arraylists;

import java.util.Arrays;

public class C01MultidimensionalArray01 {
    public static void main(String[] args) {
        //Example 2: Print the elements which has "a" in it from a multidimensional array

        String [][] brr = {{"Java", "is"},{"easy"},{"to","learn"}};

        for (String [] w:brr){//it's for getting objects from outher loop
            for (String u:w){//for inner objects. Already whole objects are w. So, u : w
                if (u.contains("a")){
                    System.out.println(u + " ");
                }

            }
        }



        //Example 3: Type code to find the maximum and minimum elements in a 2-dimensional integer array

        int[][] n = { {5, 2}, {14, 9}, {-7} };

        int maximum = n[0][0]; //5
        int minimum = n[0][0]; //5

        for (int [] w:n){//{5,2}
            for (int u:w){
               maximum =  Math.max(maximum,u);
               minimum = Math.min(minimum,u);

            }
        }
        System.out.println("maximum = " + maximum);//14
        System.out.println("minimum = " + minimum);//-7

        //Example 4: Type code to convert a multidimensional array to a one dimensional array
        //  { {5, 2}, {14, 9}, {-7} } ==> { 5, 2, 14, 9, -7 }


        int[][] p = { {5, 2}, {14, 9}, {-7} };//has 5 elements


        int idx = 0;
        int length = 0;
        for(int []w: p){
            length = length + w.length;
        }
        int [] r = new int[length];//p has only there element as arrays  but totally elements are 5

        for (int [] w:p){
            for(int u:w){
                r[idx] = u;
                idx++;

            }
        }

        System.out.println(Arrays.toString(r));//[5, 2, 14, 9, -7]





































































    }




































}
