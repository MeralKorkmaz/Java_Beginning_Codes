package DT_Practice.practice03.practise01;

public class Practice01 {

    public static void main(String[] args){

        //initialize variable
        //data type - variable name- assignment operator - value - ;

        int                 age              =               12        ;

        byte customerAge = 35;
        double weight = 87.5;

        //Uninitialized variable;

        String name;
        String stuName = " Tom ";


        //Print variable with label

        System.out.println(" Age is: " + age); //Age is: 12

        System.out.println(" Customer age: "  + customerAge); // Customer age: 35

        System.out.println(" Weight is " + weight);

        //System.out.println("name = " + name); Java gives error if we do not instanciate the variable
        // When we select soutv, it is going to print the last value

        System.out.println("stuName = " + stuName);

        //Copy the variables value
        byte myAge = (byte)age; //Explicit narrowing
        System.out.println("myAge = " + myAge);

        double age3 = age; //Auto widening
        System.out.println(age3);

        //Declare multiple variables int the same line
       short  year = 2023, month = 9, day = 28;

       //Update a variable

        month = 12; // it is not allowed to update it by typing short in front of the value since we already declared same variable name before
        System.out.println("month = " + month);

        //Declare a variable: x
        int x;

        //Initialize variable z;
        int z  = 40;

        //Initialiaze x by using z;

        x = z;
        System.out.println("x = " + x);








    }
}
