package day18_oopconcept02;

  /*
    How Constructors work in Inheritance
    1)Java uses "constructors" from parent Classes to inherent child.
    because without having parent we cannot create a child
    2)Every Constructor has invisible "super()" key word in the first line. If you
    want you can make it visible
    3)super() keyword is for calling parent constructor with given parameters
     (You can write parameters inside super() to decide with constructor to work)
     4)"this()" keyword is used for calling constructor in the same class.
     5)Using "super()" and "this()" keyword in object creation provides flexibility
     6)We can create an object which has data type of parent class
     7)If you have variable with the same name in inheritance,
     the value of variable will be selected according to Class used as data type
     8)If we use methods with same name in inheritance,
     the method will be selected from the class that constructor is crated.
     9)"super" is used to call "variables" or "methods" in the parent class (just one level up)
       "this" is used to call "variable" or "methods" in the same class.

     */

public class C01Animal {
    public String name;

    public int age;
    public boolean isPet;

    public int weight = 12;

    public void eat(){
        System.out.println("Animals eat");
    }

    public C01Animal() {
        this("Hope",4,true);
        System.out.println("A No Parameters");//to be sure that it is working
    }

    public C01Animal(String name, int age) {

        System.out.println("String name, int age Parameters");
        this.name = name;
        this.age = age;
    }

    public C01Animal(String name, int age, boolean isPet) {
        super();
        System.out.println("String name, int age, boolean isPet Parameters");
        this.name = name;
        this.age = age;
        this.isPet = isPet;
    }




}
