//package day23_exceptions;
//
//public class C02Exceptions02 {
//    /*
//    1) Exceptions are strict rules in Java to protect developers from critical mistakes.
//             For example when doing division, if we try to divide by 0, this is critical
//             mathematical mistakes. When Java encounters such a mistake it "throws exception".
//                i)explain about the exception
//                ii)stop execution
//
//      2)When exception occur in the codes the following codes will be not executed
//      3)When exception occur in try block following codes will nor be executed Java will jump to Catch block
//
//     */
//
//    public static void main(String[] args) {
//
//        //for the first method
//        System.out.println(divide(6, 2));//3
//        System.out.println(divide(1, 2));//normally it is 0.5 but Java is not rounding. So, 0
//        System.out.println(divide(0, 2));//0
//        System.out.println(divide(4, 0));//0//ArithmeticException Java throws when it faces critical mathematical mistakes.
//        System.out.println("Hi");
//
//        //for the second method
//        System.out.println(divideTwoNumbers(8, 0));
//        System.out.println("Hey");
//
//        System.out.println(numberOfCharInString("Java"));
//        System.out.println(numberOfCharInString(""));
//        System.out.println(numberOfCharInString(null));
//
//        System.out.println(numberOfChartersInString(null));
//
//    }
//
//
//    //Type a method to divide two integers
//    //First Way: (Not Recommended)
//    public static int divide(int a, int b){
//        if(b==0){
//            return 0;//return keyword end of the method
//        }
//        return a/b;
//    }
//
//    //Second Way: try-catch block
//
//    public static int divideTwoNumbers(int a, int b) {
//        int result1 = 0;
//        try {
//            result1 = a / b;//try to divide then assign the result
//            System.out.println("Hello World");//it is not printing
//
//        } catch(ArithmeticException e) {//e stands for exception. It can be any name
//            //catch(type of Exception e:common name)
//
//            System.out.println("You cannot divide by zero...");
//        }
//
//        return result1;
//    }
//
//
//
//    //Type a method that finds number of chars in a given String
//
////    //First Way:
////    public static int numberOfCharInString(String str){
////        if(str ==null){
////            return 0;
////        }
////        return str.length();
////    }
////
////    //second way:
//     public static int numberOfChartersInString(String str) {
//      int result = 0;
//        try{
//         result = str.length();
//            System.out.println("hey");
//
//        }catch(NullPointerException e){
//            System.out.println("Deep");
//     }
////
//    }
//
//}
