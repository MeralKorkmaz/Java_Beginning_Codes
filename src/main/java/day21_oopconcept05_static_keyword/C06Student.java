package day21_oopconcept05_static_keyword;

public class C06Student {
    /*
    What is the difference between "static" and "non_static" keywords
         i)Static class (moon) members are common for all object, non-static class (cin Ali) members are shared only by
           them object itself
           ii) When we make updates on "static class" members the update will affect all objects.
               When we make updates on "non-static" class members the update will affect only the specific object
               If we want other object to inform we need to type a code.

            iii)To access "static" members we need only class name.
                To create "non-static" members, we need to create object


            iv)"Static" class members are created together with class.
                "Non-Static" class members are created while we are creating an object.


            v) "static" class members are created once, "non-static" class members are created in every object creation.

          */



       public static int numOfStudents = 0;//we can get directly from class, no need constructor.

       public int numOfEyes = 0; //for non-static we need constructor. we need an object

    public C06Student() {
        this.numOfEyes = numOfEyes + 2;
        numOfStudents++;
    }


}
