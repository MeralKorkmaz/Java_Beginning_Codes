package day18_oopconcept02;

public class C06AnimalRunner {
    public static void main(String[] args) {

                                    /* C03Dog myDog = new C03Dog();
                                      In order to create dog object
                                      A No Parameters
                                      M NO Parameters
                                      D No Parameters
                                      */

        /*
        After indicating the constructors with super
        String name, int age, boolean isPet Parameters
        String type,int height parameters
        D No Parameters
         */

        //Default parameters are first runner.

        C03Dog myDog = new C03Dog();        /*
                                                     String name, int age Parameters
                                                     String type parameter
                                                     Price Parameter
                                                     */

        myDog.eat();//Dogs eat

        C01Animal myDog1 = new C03Dog();
        C01Animal myDog2 = new C03Dog();
        System.out.println(myDog2);


        C02Mammal myDog5 = new C02Mammal();
        myDog5.eat();//Mamals eat




    }
}