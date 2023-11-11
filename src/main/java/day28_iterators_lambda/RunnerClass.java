package day28_iterators_lambda;

public class RunnerClass {


    public static void main(String[] args) {

        C01StaticAndInstanceBlock obj1 = new C01StaticAndInstanceBlock();//Hi from first constructor, no parameter

        //!Even if the first constructor empty, I will see "Hi" on the console because of instance block.
        // Instance block will be active whenever you use any of the constructors.

        C01StaticAndInstanceBlock obj2 = new C01StaticAndInstanceBlock(700);//Hi from second constructor, one parameter





    }

}




