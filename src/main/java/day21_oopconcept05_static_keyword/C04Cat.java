package day21_oopconcept05_static_keyword;



public class C04Cat implements C01Animal, C02Mammal, C03Carnivouris{
   // public class extends C01Animal, extends C02Mammal, extends C03Carnivouris we cannot do we should change them interf
   //interface can have multiple parents

    @Override
    public int eat() {
        return 3;
    }

    @Override
    public String eat(String foodName) {
        return foodName.toUpperCase();
    }
}




