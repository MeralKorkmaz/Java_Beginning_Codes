package day18_oopconcept02;

public class C02Mammal extends C01Animal{

    public String type;
    public int height;

    public void eat(){
        System.out.println("Mamals eat");
    }

    public C02Mammal() {
        this("Arlo");

        System.out.println("M NO Parameters");
    }

    public C02Mammal(String type){

        super();
        System.out.println("String type parameter");
        this.type = type;

    }

    public C02Mammal(String type,int height){

        System.out.println("String type,int height parameters");
        this.type = type;
        this.height = height;
    }
}
