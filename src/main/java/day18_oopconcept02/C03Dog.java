package day18_oopconcept02;

public class C03Dog extends C02Mammal{


    public double price;
    public int weight = 8;
    public void eat(){
        System.out.println("Dogs eat");
    }

   public C03Dog() {
       super();
        System.out.println("super variable....>" + super.weight);//it's used for parameters and it's take us the upper class
       System.out.println("this variable....>" + this.weight);
       // takes use parents
        //to use another constructor inside the class
        System.out.println("D No Parameters");
   }

    public C03Dog(double price){//normally super key word is not visible
        super();//without writing something, it is default for mammal
        System.out.println("Price Parameter");
        this.price = price;
    }

    //Dog can use animal's and mammal's constructor
    //To have a dog object the creation of constructor is 1)Animal 2)Mammal  3) Dog
}
