package day21_oopconcept05_static_keyword;

import org.w3c.dom.ls.LSOutput;

public class C07StudentRunner {

    public static void main(String[] args) {

        C06Student std1 = new C06Student();

        System.out.println(std1.numOfEyes);//2
        System.out.println(std1.numOfStudents);//1

        System.out.println(C06Student.numOfStudents);//1


        C06Student std2 = new C06Student();
        System.out.println(std2.numOfEyes);//2
        System.out.println(C06Student.numOfStudents);//2
        System.out.println(std1.numOfStudents);//2

        C06Student std3 = new C06Student();
        System.out.println(std3.numOfEyes);//2
        System.out.println(C06Student.numOfStudents);//3







    }



}
