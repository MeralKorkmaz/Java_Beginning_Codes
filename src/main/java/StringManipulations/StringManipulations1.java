package StringManipulations;

public class StringManipulations1 {

    public static void main(String[] args) {
        // Q 1: Write a Java code snippet to convert the first character of a string to uppercase.

        String str = "hello";
       String firstChar = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        System.out.println(firstChar);//Hello


        //Q 2: Write a Java code to count the occurrences of a character in a string.

        String str1 = "Learn from your mistakes and use them as opportunities for growth";
        char target = 'o';
        int count = 0;
        for (int i=0; i<str1.length(); i++){
            if(str1.charAt(i)==target){
                count++;
            }
        }

        System.out.println(target + " is used: " + count+ " times");//o is used: 6 times


        //Q 3: Write a Java code snippet to count the number of words in a string.

        String str2 = "Set clear goals and work towards them consistently.";
        String[] words = str2.split("\\s");
        int wordCount = words.length;
        System.out.println(wordCount);//8
        System.out.println(count);

        /*
        another questions solution
       String  str2    =   "Set clear goals and work towards them consistently.";
      String [] k     =   str2.split(" ");
      int count   =   0;
      for (String w: k){
    count++;

        }
        System.out.println(count);

         }

         */

        //Q 4: How do you split a string into an array of substrings using a delimiter in IntelliJ?
        String str3 = "Hello,world,Java";
        String[] subStrings = str3.split(",");
        for (String substring : subStrings){
            System.out.println("Substring:  " +substring);
            /*
            Substring:  Hello
            Substring:  world
            Substring:  Java
             */
        }


        /*
         //Q 5: How can you check if a string starts with a specific prefix in IntelliJ?
        String str4 = "Never give up on your dreams and aspirations. ";
        String prefix = "Never";
        boolean star = str4.startsWith(prefix);
        System.out.println("Starts with prefix? " + star);



        //Q 6: Write a Java code snippet in IntelliJ to find the index of the first and last
        // occurrence of a character in a string.
        String str5 = "Believe in yourself and your potential.";
        char target1 = 'o';

        int fI = str5.indexOf(target1);
        int LI = str5.lastIndexOf(target1);
        System.out.println("Index of '" + target1 + "': " + fI);
        System.out.println("Index of '" + target1 + "': " + LI);



         */







    }
}
