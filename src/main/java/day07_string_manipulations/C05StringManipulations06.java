package day07_string_manipulations;

public class C05StringManipulations06 {
    public static void main(String[] args) {
        // "\\p{Punct}"
       //Example 6: Type a code to find the number of punctuation marks used in a String.
       //         "Wooow!... Toms is 13, and he is in university...????"

        String s1 = "Wooow!... Toms is 13, and he is in university...????";
        String newSentence = s1.replaceAll("[^\\p{Punct}]","");
      //We want to reach only punctuations. So, we are replacing the others with nothing by using replaceAll() to get rid of others.
       //System.out.println(newSentence);
        int numOfPunc = newSentence.length();
        System.out.println(numOfPunc);



        //Example 7: Type a code to find the number of words used in a String
                //          "Learn Java, earn huge amount of money.".....> ?

     //first method: count number of spaces and add 1
        String s2 = "Learn Java, earn huge amount of money.";
        int numOfSpace = s2.trim().replaceAll("[^ ]","").length();

     //for a group of data (all characters) we are gonna use replaceAll. For just learn just replace.
     //the other letters except spaces are replacing by nothing. So, we can have only spaces

        int numOfWords = numOfSpace + 1;
        System.out.println(numOfWords);

      //second method by using split() method
        int numOfWords2 = s2.trim().split(" ").length;
        System.out.println(numOfWords2);


        //Example 8: Type a code to find the number of letters used in a String
        //         "Learn Java, earn huge amount of money.".....>    30

        int numOfLetters = s2.replaceAll("[A-Za-z]","").length();
        System.out.println(numOfLetters);



    }
}
