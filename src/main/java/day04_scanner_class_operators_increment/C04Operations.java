package day04_scanner_class_operators_increment;

public class C04Operations {

    public static void main(String[] args) {

        //"=" Assignment operator: assigns value on the right to the value on the left

        //"==" Equality Operator: Compares right hand side with the left hand side
        // 3+5 ==8===>true 3+2 ==2 ===>false
        // 'A' == 65 ===> true


        //if we use chars together with math operations Java uses their ASCII value
        System.out.println('A' == 65);
        System.out.println('A' + 'a');
        // we cannot make concet with chars and chars. So, Java understands that we are trying to make addition

        System.out.println("A" + 'a'); //concet. Java is taking char a not the ASCII value

        //Example: Find ASCII value of 'I' by typing code
        System.out.println('!' + 0);
        System.out.println('!'*1);

        //'!' Not Operator: !true == false  !false ==true !!true == true . It make statement opposite
        //'!=' Not Equal: 3 + 4 != 1 ===> true  2+5 != 7 ===> false
        //'>', '<', '>=', '<=' they return me booleans

        /*
        '==' with Strings
        for every String data there are two main parts: 1)value 2)address
        When we compare String value do not prefer to use '==' operator.
        To compare two Strings use String methods. (equals())
         */


        String s1 = " Tom ";
        String s2 = " Hanks";
        String s3 = " Tom ";
        String s4 = new String("Tom");
        //normally Java wants to make same references for same value. We are using it to crate different references for same value


        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//true
        System.out.println(s1==s4);//false
        //!!! == is using references and value while compereing Strings
        //It is logical to use == for compering numbers and char

        System.out.println(s1.equals(s4)); //true
        ///!!! use equals operator to compere Strings. It is only using values
        //if the one value is written by capital or small it effects equality

        //System.out.println(s1.equalsIgnoreCase(s4));


    }
}
