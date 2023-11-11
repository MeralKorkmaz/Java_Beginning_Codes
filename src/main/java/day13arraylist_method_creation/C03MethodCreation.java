package day13arraylist_method_creation;

public class C03MethodCreation {
    public static void main(String[] args) {
        //Method Call:
        int r1 = add(3,7);//Non-static method 'add(int, int)' cannot be referenced from a static context
        System.out.println(r1);//10 //3 and 7 are arguments

        double r2 = multiplyThreeNumbers(2.1,3.5,4.5);
        System.out.println(r2);//33.075

        String r3 = str("Ja","va");
        System.out.println(r3);//Java

        //parameters are variables that my method accepts
        //Parameters are the variables
        // arguments are really numbers to call the method




    }


    //Type a method to add integers
    public static int add(int a , int b){//int a and int b are parameters
        int sum = a + b;
        return sum;
    }
    //Type a method to multiply three numbers:
    public static double multiplyThreeNumbers(double a, double b, double c) {
    return a*b*c;
    }

    //Type a method that joins two Strings

    public static String str(String a, String b){
        return a.concat(b);
        //we are using concat to join the Strings


    }


}

