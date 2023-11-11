package DT_Practice.practice03.practise02;

public class Q03_ForLoop {

    public static void main(String[] args) {


        //Do not type lowercase letters in a given String.
        //Password = "Pwd123!Ab";

        String password = "Pwd123!Ab";

        for(int i = 0; i< password.length(); i++){

            char ch = password.charAt(i);

            if(ch>= 'a' && ch<='z'){
                continue;
            }else{

                System.out.print(ch + " ");
            }

        }

        //continue means check them but not print them. Just continue




    }
}
