package day08_for_loop;

public class C03ForLoop02 {

    public static void main(String[] args) {
        //Example 3: Type code that prints even numbers between 6 and 17 in one line


        for(int i =6; i<18; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }

        }

        System.out.println();

        //Example 4: Type a code that print all numbers between 6 and 17 but not 13

       //first Way
        for (int i=6; i<18; i++){
            if(i!=13){
                System.out.print(i+ " ");
            }
        }

        System.out.println();

        //second way:
        for(int i=6; i<18; i++){
            if(i==13){
                continue;//"continue" keyword takes you directly to the increment part of the loop
                         //It is used to skip some values
                         //In the exercise, continue is allowed us to print 13, it directly directs us to increment or decrement part without printing
            }
            System.out.print(i +" ");
        }

        System.out.println();


        // Example: 5 Type a code to print all chars in a String one by one. If you see "x" stop printing
        // "I like extra effort"
        String str = "I like extra effort";
        for(int i = 0; i<str.length() ;i++){
            char ch = str.charAt(i);
            if(ch=='x'){
                break; //"break" keyword takes us to the out of the loop
            }
            System.out.print(ch);//I like e

        }








    }
}
