package day07_string_manipulations;
public class C02StringManipulations03{
    public static void main(String[] args) {
        //Example 3: Type code to print just the unique characters in a String
       //           "Hello" ==> Heo

        String word = "Hello";
        String unique = "";
        int firstOccrH = word.indexOf('H');//indexOf() takes Sting and char
        int lastOccrH = word.lastIndexOf('H');
        if(firstOccrH == lastOccrH){
            System.out.print("H");
            unique = unique + "H"; //if the condition is correct, "H" will concat with "".
                                   //"H"
        }

        int firstOccrE = word.indexOf('e');
        int lastOccrE = word.lastIndexOf('e');
        if(firstOccrE == lastOccrE){
            System.out.print("e");
            unique = unique + "e";//"He"
        }

        int firstOccrL = word.indexOf('l');
        int lastOccrL= word.lastIndexOf('l');
        if(firstOccrL == lastOccrL){
            System.out.print("l");
            unique = unique + "l";//it is not correct. So, it is still "He"
        }
        int firstOccrO = word.indexOf('o');
        int lastOccrO = word.lastIndexOf('o');
        if(firstOccrO == lastOccrO){
            System.out.print("o");
            unique = unique + "o";//"Heo"
        }


        System.out.println(unique);//Heo





    }



}













