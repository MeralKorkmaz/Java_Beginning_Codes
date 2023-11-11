package day04_scanner_class_operators_increment;

public class C05IncrementAndDecrement {


    public static void main(String[] args) {
        //Increment means to increase the value of a variable

        int age = 15;
        //System.out.println(age +1);
        //System.out.println(age);//15
        //When we do this the age is not changing. Age is still 15

        //First way of Increment
        age = age+1;
        System.out.println(age);//16

        //Second way of Increment
        age += 5;
        System.out.println(age);//21

        //We can do increment by multiplication
        age = age*2;
        System.out.println(age);//42

        age *= 2;
        System.out.println(age);//84

        //Decrement is to decrease the value of variable

        age = age - 3;
        System.out.println(age);//81

        age -=1;
        System.out.println(age); //80

        //We can do division

        age = age/4;
        System.out.println(age);  //20

        age /= 5;
        System.out.println(age); //4

        //Special format for increment by 1 and decrement by 1
        age++;
        System.out.println(age); //5

        age--;
        System.out.println(age);//4







    }



}
