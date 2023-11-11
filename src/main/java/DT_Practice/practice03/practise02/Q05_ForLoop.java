package DT_Practice.practice03.practise02;

public class Q05_ForLoop {

    public static void main(String[] args) {
        //Type a code to print all integers from 10 to 32 except if the integer is less than 21 greater than 18

        for (int i = 10; i<33; i++){
            if(i>18 && i<=21){
               continue;
            }
            System.out.print(i+ " ");//10 11 12 13 14 15 16 17 18 21 22 23 24 25 26 27 28 29 30 31 32

        }


    }
}
