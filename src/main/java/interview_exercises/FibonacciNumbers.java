package interview_exercises;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner input   =   new Scanner(System.in);

        System.out.println("4'ün kuvveti olup olmadigini kontrol etmek istediginiz sayiyi girin:");
        int num =   input.nextInt();


        while (num > 1){
            if (num==4){
                System.out.println("Sayi 4'e bölünür.");
            }
            if (num%4 == 0){
                num =   num/4;
            }else{
                System.out.println("4'e bölünmez");
                break;
            }

        }


        //Write a Java program to find the index of the first unique character in a given string. Assume that there is at least one unique character in the string.
        //Sample Output:
        //Original String: wresource
        //First unique character of the above: 0

        String s = "wresource";
        String unique = "";

        for(int i = s.charAt(0); i<s.length(); i++){
            char ch = s.charAt(i);
            if (s.indexOf(ch)== s.lastIndexOf(ch)){

                unique = unique + ch;

            }
            System.out.println(unique);



        }









    }
}
