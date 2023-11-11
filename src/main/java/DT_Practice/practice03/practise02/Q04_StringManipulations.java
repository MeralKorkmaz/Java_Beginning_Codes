package DT_Practice.practice03.practise02;

public class Q04_StringManipulations {

    public static void main(String[] args) {
        //1.Task: Count the alphabetical characters in a given String value.
        // String str= "Wow! Edip is grown up and even if he is 13 years old he will go his 2nd university...";

        String str = "Wow! Edip is grown up and even if he is 13 years old he will go his 2nd university...";

        int totalNumOfChars= str.length();
        System.out.println("totalNumOfChars = " + totalNumOfChars); //85

       String strWithoutPunc =  str.replaceAll("\\p{Punct}",""); //Wow Edip is grown up and even if he is 13 years old he will go his 2nd university

        System.out.println(strWithoutPunc);

        String onlyLetters = strWithoutPunc.replaceAll("[^A-Za-z]","");
        System.out.println(onlyLetters);

        int totalNumOfLetters = onlyLetters.length();
        System.out.println(totalNumOfLetters);


    }
}
