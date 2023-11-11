package day02_datatypes;

public class C02TypeCasting {

    public static void main(String[] args) {

        // Type casting is changing data primitive data type of variable to another data type.  Changing data type of variable

        byte age = 35;
        byte myAge = age;

        //if we change data type of variable into a larger data type, this is called "Auto Widening"
        //Java does this operation automotically --> auto widening
        //We cannot charles to String and we cannot boolean to another ones
        short yourAge = age;
        System.out.println(yourAge);


        //if you want to carry small box to large box, Java allows you. If the assigned value smaller than the one that you want to carry, we can do having any problem


        //Explicit narrowing: Casting  large data type into smaller data type
        //                    Java does not do it automatically, we need do to it explicitly
        //                    by adding name of smaller data type in front of the variable which has larger data type

        short height = 128;
        byte heightOfBuilding = (byte)height;
        System.out.println(heightOfBuilding);

        // the return type  is - 128 because byte is between -128 and 127. It is turning the at the beginning/
        // if we write 129 instead of 128 it's gonna be -127. -128 + 1 == -127

      short heights = 12;
      double height2 =  heights;
        System.out.println("height2 = " + height2);

        double weight = 79.95;
        short weight1 = (short)weight;
        System.out.println("weight1 = " + weight1);
        //Java is not rounding numbers. It is ignoring the decimal part
        // Note: 1. When doing mathematical operation in java if data types are same, result must have same data type with the variables.
        //The result may not fit to the given data type, in this case Java will remove decimal parts.

        int numOfStd = 20;
        int amountOfMoney = 398;
        System.out.println(amountOfMoney/numOfStd  ); //the result is 19 instead of 19.9.
        //The result must be in int

        //2. When doing math operations and if the data types are different the result will be in the same data type with the larger data.


        int numberOfSudents = 20;
        float moneyAmount = 398.0F;
        System.out.println(moneyAmount/numberOfSudents);




    }



}
