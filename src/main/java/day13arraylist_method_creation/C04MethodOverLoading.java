package day13arraylist_method_creation;

public class C04MethodOverLoading {
    public static void main(String[] args) {
        //method call
        add(3,8);

    }

    //Create a method to add two integers
    public static int add(int a, int b){
        return a + b;
    }
    //Create a method to add three integers
    public static int add(int a, int b, int c){
        return a+ b + c;
    }
    //Create a method to add one integer and one double
    public static double add(int a, double b){//auto widening for a
        return a + b;
    }
    //Create a method to add one double and one integer
    public static double add (double a, int b){
        return a + b;

        //method overloading means having different methods with similar functions and the same names
    }
    public static double add(double a, double b){
        return a+b;
    }

    /*
    parameters number and variable data types are make methods different
    changing order if the data types are same not make methods different
     */

    /*
    Method overloading: using same method name with different parameters in a class
    parameters can be made different by three ways:
    1) different number of parameters
    2)different data type
    3)order of parameters if they have different data type
     */

    /*
    Method Signature: method name + parameters
    add(int a, double b)
    add (double a, int b)
    method signatures are no same. The method name is same but parameters are different
    */


    //static and non-static methods can be overloaded
    //Access modifiers, static keyword and return types cannot make methods different and can be used in method overloading
    /*
    Java is OOP language. It has four principles:
    1) Inheritance
    2)Polymorphism = method overloading + method overwriting
    3)Encapsulation
    4)Abstraction
     */

}
