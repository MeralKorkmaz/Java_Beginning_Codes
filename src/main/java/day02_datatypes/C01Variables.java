package day02_datatypes;



public class C01Variables {

 public static void main(String[] args) {
     byte stdAge = 35; //data

     System.out.println(stdAge); //code


     //3245
     short numOfStdInSchool= 3245;
     System.out.println( numOfStdInSchool);

     //1200000

     int populationOfMiami = 1200000;
     System.out.println(populationOfMiami);


     long popOfWorld = 7000000000L;
     //we are adding L end of the number because Java do not want to use long and it insists on int to save memory. By using L, we are saying Java that use long

     System.out.println(popOfWorld);

     long popOfChina = 1500000000;
     System.out.println(popOfChina);

     //If we write long variable not in range of the int we need to add "L" to the end

     //If we write long variable in range of int we don't need to add "L" to the end

     float shirtPrice = 23.34F;
     System.out.println(shirtPrice);

     //float has 7 decimal

     double weightOfCell = 0.0000000012;
     System.out.println("weightOfCell = " + weightOfCell);

     //we selected soutv after writing variable name and adding .

     //1.2E-9 E means explanation number 1.2 x 10 -8 (on the top)

     boolean isRetired = false;
     System.out.println(isRetired);

     char initial = 'H';
     System.out.println (initial);

     String name = "Mark Twain";
     System.out.println("name = " + name);







 }

}
