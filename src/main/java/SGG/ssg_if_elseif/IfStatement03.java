package SGG.ssg_if_elseif;

public class IfStatement03 {

    public static void main(String[] args) {

        //Example 1: Checking if a number is odd or not by using just if statement
        int number = 3;
        if(number %2!=0){
            System.out.println("The number is odd");

        }


        //Example 1: Check  if a number is even or odd by using if-else statement
        int number1 = 20;
        if(number1 %2==0){
            System.out.println("The number is even");

        }else{
            System.out.println("The number is odd");
        }

        //Checking if a person is eligible to vote
        int age = 20;
        if(age>=18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not old enough to vote");
        }

        //Example 5: Checking if a number is within a specific range.
        int num2 = 25;//10 and 50
        if(num2>9 && num2<51){
            System.out.println("The number is  within the range");
        }else {
            System.out.println("It is not within the range");
        }

        //determining the grade based on a numerical score

        int score = 100;
        if(score<0){
            System.out.println("Your grade cannot be negative ");
        }else if(40>score){
            System.out.println("Your grade is D");
        }else if (69>score){
            System.out.println("Your grade is C");
        }else if(85>score){
            System.out.println("Your grade is B");
        }else if(score>84 && score<101) {
            System.out.println("Your grade is A");
        }else {
            System.out.println("You are typing wrong");
        }






    }
}
