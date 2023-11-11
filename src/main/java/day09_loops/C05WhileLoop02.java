package day09_loops;

public class C05WhileLoop02 {

    public static void main(String[] args) {
        //Type a code print even  numbers from 15 to 5

        int i = 15;
        while(i>4){
            if(i%2==0){
                System.out.print(i + " ");
            }
            i--;
        }

        System.out.println();

        //Example: Type a code to check if a given number is Palindrome or not
        //12321 ....>palindrome  12312....> not palindrome

        int num = 12321;
        //convert int to String
        String numStr = String.valueOf(num);//12321"
        String reversed = "";

        int k = numStr.length()-1;
        while (k>=0){
            reversed = reversed + numStr.charAt(k);
            //charAt() because we are adding chars individually
            k--;
            //we are doing decrement since we are making reversed
        }

        if(numStr.equals(reversed)) { //we are using equals() to compare Strings
            System.out.println("Palindrome");
        }  else {
            System.out.println("Not Palindrome");
        }















    }
}
