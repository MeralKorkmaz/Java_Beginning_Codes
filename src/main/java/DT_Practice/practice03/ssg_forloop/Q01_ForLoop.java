package DT_Practice.practice03.ssg_forloop;

public class Q01_ForLoop {
    public static void main(String[] args) {
        //Java created different loop structures to handle repated work
        //There are 4 types of loops in Java
        //for loop.....> you can tell Java either to start from the beginning index or the end index
        //for each/enhanced loop //cannot go to form the last index to the starting index
        //while loop
        //do while loop


//Type code to print the integers divisible by 4 and by 6 from 13 to 211.

        //Way 1: with for loop
        for (int i = 13; i<212; i++){
           if (i%4==0 && i%6==0){
                System.out.print(i+ " ");
            }



        }

        System.out.println();


        //Way 2: with while loop
        //starting value is typed before while keyword

        int startingValue = 13;
        while (startingValue<212){

            if(startingValue%12==0){
                System.out.print(startingValue+ " ");
            }
            startingValue++;
        }
































    }












}
