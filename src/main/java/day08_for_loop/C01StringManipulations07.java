package day08_for_loop;

public class C01StringManipulations07 {

    public static void main(String[] args) {

        String str = " Javas is Java";
        char chr = str.charAt(2);
        System.out.println(chr);

        //charAt is whats the character at that index
        boolean b1 = str.startsWith("J");
        System.out.println(b1);
        //If starts with that letter or not

        boolean b2 = str.endsWith("A");
        System.out.println(b2);
        //If it ends with that letter

        System.out.println("str.repeat(3) = " + str.repeat(3));
        //it concatenates the variable the number that we write

        boolean b3 = str.contains("Java");
        System.out.println(b3);

        //we are using it to check if the variable contains the String

        //String b4 = str.strip("Java");
        //trim cannot remove some spaces because of the language. Strip is powerful than trim()






    }

}
