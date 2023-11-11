package day19_oopconcept03;

/*
1)To have specific implementations in the child class we use "Method Overriding"
2)In "Method overriding"  we change the method body.
  In "Method overriding" we do not change method name and method parameters
  Method name and method parameters are "Method Signatures"....> do not change method signatures
 3)In "Method overriding" if the method has "void" return type don't change it.
 */

public class C01Animal {
    public void eat(){
        System.out.println("Animals eat.....");
    }



    public int getWeight(){
        return 30;

    }

}


