package day07_string_manipulations;

public class CO4StringManipulations05 {
    public static void main(String[] args) {
        //Example 5: String shirtPrice = "$12.99";
        //         String bookPrice = "$35.99";
        //         Type code to find the sum of the shirt and book prices.
        //In shopping applications, we use String data.Because, there are symbol in front of the numbers


        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        //First step is get rid of $ sign:
        shirtPrice = shirtPrice.replace("$","");
        //we replace $ sign with nothing to get ridd of that
        bookPrice = bookPrice.replace("$","");

        System.out.println(bookPrice);

        //Second Step: converting String data to double by Wrapper Class methods

        double doubleShirt = Double.valueOf(shirtPrice);
        double doubleBook   = Double.valueOf(bookPrice);

  /*
  For converting String to primitive data type. First we should convert it to Wrapper Class of the primitive
  data. Then, converting it to primitive data by assining the Wrapper Class to primitive data
  String b1 = "true";
  boolean b2 =  Boolean.valueOf(b1);
  */
        double sum = doubleBook + doubleShirt;

        System.out.println(sum);




    }
}
