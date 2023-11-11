package day07_string_manipulations;

public class C03StringManipulations04 {
    public static void main(String[] args) {

        /*Example 4: Check if a password has the following conditions
                     i)It should not be empty
                     ii)It should not be just space
                     iii) It should not have spaces at beginning and at the end
                    iv)'i' should be a character in the password and first occurrence of 'i' should be at the index 4
                     v)'K' should be a character in the password and last occurrence of 'K' should be at index 5
        */


        String password = "A23giKi";
        //i)It should not be empty
        boolean first = password.isEmpty(); //isEmpty() method checks if there are any chars including space
        System.out.println(first);
        //isEmpty checks nothing in inside. isBlank there can be spaces inside
        //Spaces is not empty, it has values. It seems empty


        //ii)It should not be just space
        boolean second = password.isBlank();//isBlank() returns true if I type all spaces
        System.out.println(second);
     /*
      1)if the variable is String password = "";
      boolean first = password.isEmpty();
      boolean first = password.isBlank();
       both of them gonna return "true"

        2)if the variable is String password = " ";
        boolean first = password.isEmpty(); return false because there is space inside it
          boolean first = password.isBlank(); returns true
       !!Blank means cannot be seen. It is not visible
        Example if we have a bottle. There is air inside the bottle. We cannot see the air so it is blank.
        If there is air inside the bottle it is not empty. If we evaluated the air from it, it is empty
        "  s " is nor empty either blank
       */

        //iii) It should not have spaces at beginning and at the end
        boolean third = password.trim().equals(password);


        /*
      if it equals to my first String there is no spaces. But, after trim if they are not equal, they are spaces.
      Example: my first String is
      String password = "A23giK "
      the second one is the one that after trim() which is
       boolean third = password.trim().equals(password); ....>"A23giK"
       */
        //equals() method is saying that if the password and third variables are equal to each other.

        System.out.println(third);

        //iv)'i' should be a character in the password and first occurrence of 'i' should be at the index 4
        boolean fourth = password.indexOf("i") ==4;


        //indexOf() return me the first appearance of the char
        System.out.println(fourth);

        //v)'K' should be a character in the password and last occurrence of 'K' should be at index 5
        boolean fifth = password.lastIndexOf("K")==5;
        System.out.println(fifth);

        //First way to write message to user
        if (!first && !second && third && fourth && fifth){
            System.out.println(" Correct Password....");
        }else {
            System.out.println(" Invalid Password ");
        }

        //Second wau to write a message to user

        if(first){
            System.out.println("Password cannot be empty...");
        }
        if(second){
            System.out.println("Password cannot have only spaces");
        }
        if(!third){
            System.out.println("Password cannot start or end with space");
        }
        if(!fourth){
            System.out.println("'i' should be fourth char in the password");
        }

        if(!fifth){
            System.out.println("'K' should be fifth char in the password" );
        }
        //we are not writing with if else to check every steps

        if (!first && !second && third && fourth && fifth){
            System.out.println(" Correct Password....");
        }else {
            System.out.println(" Invalid Password ");
        }










    }
}




