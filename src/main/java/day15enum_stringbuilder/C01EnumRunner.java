package day15enum_stringbuilder;

import java.util.Arrays;
import java.util.Scanner;

public class C01EnumRunner {
    public static void main(String[] args) {
        //Enum is used to store constant values...
        //variables are private. I can use methods to reach the variables

        String capital = UsStates.NEW_JERSEY.getCapital();
        System.out.println("capital = " + capital);//capital = Trenton
        
        String capital1 = UsStates.CALIFORNIA.getCapital();
        System.out.println("capital1 = " + capital1);//capital1 = Sacramento

        //Example 1: Ask user to enter state name then give user capital city

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter State Name");
        String state = input.nextLine().toUpperCase();

        switch (state){
            case "ALABAMA":
                System.out.println(UsStates.ALABAMA.getCapital());
                break;
            case "ALASKA":
                System.out.println(UsStates.ALASKA.getCapital());
                break;
            case "AMERICAN SAMOA":
                System.out.println(UsStates.AMERICAN_SAMOA.getCapital());
                break;
            case "ARIZONA":
                System.out.println(UsStates.ARIZONA.getCapital());
                break;
            case "ARKANSAS":
                System.out.println(UsStates.ARKANSAS.getCapital());
                break;
            default:
                System.out.println("Invalid State Name");
        }

        UsStates[] states = UsStates.values();
        //data type is UsStates Array
        //System.out.println(Arrays.toString(states));

        for(UsStates w: states){//data type is UsStates and array name is states
          if(state.equals(w.toString())){
              //w is array. we cannot compare String with another data type. So, we are making w String with using toString
              System.out.println(w.getCapital());
              break;
          }
        }



       /*
        package day15_dateandtime_enum_StringBuilder;

        public enum MyClients {
            MR_ADAM(43,"brown","meat"),
            MISS_JANE(12,"dfsds","sfgdh"),
            MISS_MARRY(34,"sds","hfjj"),
            MR_JAKE(1,"sas","vfe");
            private final int age;
            private final String eyeColour;
            private  final String food;
            MyClients(int age, String eyeColour, String food){
                this.age= age;
                this.eyeColour= eyeColour;
                this.food = food;
            }
            public String getEyeColour() {
                return eyeColour;
            }
            public String getFood() {
                return food;
            }
            public int getAge() {
                return age;
            }
        }

        */









































    }
}
