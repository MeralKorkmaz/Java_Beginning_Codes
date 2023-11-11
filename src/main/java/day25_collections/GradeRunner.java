package day25_collections;

import java.util.ArrayList;
import java.util.List;

public class GradeRunner {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        addGrade(grades,87);
        addGrade(grades,79);//[87, 79]
        //addGrade(grades,-80);//[87, 79, -80]//IllegalGradeException. Grade must be between 0 and 100

        System.out.println(grades);

    }

    //Create a method that adds a given grade to a grade list
    public static void addGrade(List<Integer> list, int grade){
        if(grade>=0 && grade<101){
            list.add(grade);
        }else {
            throw new IllegalGradeException("Grade must be between 0 and 100");
        }

    }

}
