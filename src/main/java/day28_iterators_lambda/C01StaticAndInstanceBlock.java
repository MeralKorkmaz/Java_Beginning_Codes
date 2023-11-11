package day28_iterators_lambda;

import java.time.LocalDate;

public class C01StaticAndInstanceBlock {
    /*
    Static variables created together with the class.
     1)They are fixed to the class
     2)They are shared by all object, all instances
     3)If I make any changes in a static variable, that change will affect all objects.
     4)Static variable sometimes may not have constant value when you run your class. It might have their initial value
     depending on some conditions. If you face such a condition, use static block.

     Static method
     1)When I make any change in a static methods, all objects using this class will be affected.
     2)It is shared for all objects.

     */

       /*
            1) "static block": is used to initialize static variables
            We sometimes need to write codes to initialize static variables.
            If we need to write codes  to initialize static variable we use "static block"

            2)  "instance block": is used , when you need to execute some code in everytime we run constructor.
            (If we need to execute some codes, we use instance block. It will be executed automatically)
                "instance block" prevents repetition

     */

   /*
    public static int price = 1000; //First option: I can initialize my static variable together with the class.
   public C01StaticAndInstanceBlock() {
   price = 1000;
    } //Second option: I can create my static variable inside a constructor.

    //static{
    price = 1000;
    }Third option:  I can crate a static block and then I can use my static block to give first value of my static variable.
    !Under some conditions, if I want to change in a value of the price when I start my class running, if this february, price
    of that product should start with another value, but in the other months, the price of this product start with different
    value. In this case, I need to initialize value of price with a different value. You can use static block.
    In static block, You will write some codes(the conditions) your class with start according to those conditions.


    */



    public static int price;


    static {
        LocalDate d = LocalDate.now();
        if(d.getMonthValue()==2){//if it is equal to february
            price= 800;
        } else {
            price = 1000;
        }
    }//this code will initialize price value, according to a condition(if it is february).

    //If in every constructor call, there is a same code that you are executing, instead of writing inside every constructor,

    public C01StaticAndInstanceBlock() {
       // System.out.println("Hi"); before instance block
    }

    public C01StaticAndInstanceBlock(int price) {
        this.price =price;
        //System.out.println("Hi"); before instance block

    }


    {//instance block. You can put it anywhere you want.
        //which constructor you call does not matter, this code will be first to run.
        System.out.println("Hi");
    }

}

