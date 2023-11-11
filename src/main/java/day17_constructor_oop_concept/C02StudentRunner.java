package day17_constructor_oop_concept;

public class C02StudentRunner {
    public static void main(String[] args) {


       C01Students std1 = new C01Students();
        System.out.println(std1.name);//Tom Hanks
        C01Students age1 = new C01Students();
        System.out.println(age1.age);//13
        //we cannot use student id which is in C01 to add constructor in C02 since it is private


        //We are changing the value. If we do not do that we are gonna create only the same object
        C01Students std2 = new C01Students();

        std2.name = "Emre";
        std2.age = 12;

        System.out.println(std2.name);//Emre

        C01Students std3 = new C01Students("Cagatay",14);
        System.out.println(std3.name);//Cagatay

        std2.doSport();//Doing sports is good for health.....
        std2.study();//Study hard....

        std3.doSport();//Doing sports is good for health.....















    }
}
