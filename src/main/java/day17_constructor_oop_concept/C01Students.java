package day17_constructor_oop_concept;

/*
1)To create object we need Constructor. Without constructor, it is impossible to create an object.
2)When you create a Class, Java creates constructor automatically
This constructor is invisible because the parent (object) has this,not the kid(class).
This invisible constructor is called as "default constructor"
3)If we want we can create several constructors
4)When we create a constructor default constructor is removed.
5)To create constructors with different parameters make your code flexible

Interview Questions: What is the difference between method and constructor
                    1) Method are used for some actions, constructors are used to create an object(object has methods and variables)
                    2)methods have return types but constructors have no return type
                    3)methods can have any name, but constructors name must be same with the class name.
 */
public class C01Students {


    //!!keep in my that classes also has variable and methods as objects.
    // Furthermore, the variable and methods in the Objects are created by using classes.
    //Moreover, classes are template for objects
    //to create an object MyFirstClass (className) myObject(objectName) = new (from strach) MyFirstClass()(constructor);
    //we are creating templates, the class not create the student


    /*
    we are not able to create object without constructor
    Object is parent class for String class (it is also data type), array class and other class that I created
    All classes can use Object's features since they are parent of the class.
    Object has a constructor, the kids (classes) can use it.
     */

    //before creating our own constructor, we have one constructor called default constructor
    //after creating our constructor, we cannot use default constructor which belongs to Object class



    String name = "Tom Hanks"; //variable
    int age = 13; //variable

    private String  stdId = "TM2010001"; //variable



    public void study(){//method
        System.out.println("Study hard....");
    }

    public void doSport(){//method
        System.out.println("Doing sports is good for health.....");
    }


    //How to create constructor manually
    public C01Students(){//same with default constructor but it cannot use from another class. It has a specific className
        //the simplest constructor


    }

    public C01Students(String name, int age){
        this.name = name;

        //this means in this template in this class
        //we are assigning the other name in the runner to this.name in this class

        this.age = age;
    }


    /*public C01Students(String name, int age, String stdId){
        this.name= name;
        this.age = age;
        this.stdId = stdId;
    }

     */


    //How to crate constructor with the help of Intellij


    public C01Students(String name) {
        this.name = name;
    }

    public C01Students(String name, int age, String stdId) {
        this.name = name;
        this.age = age;
        this.stdId = stdId;
    }




}
