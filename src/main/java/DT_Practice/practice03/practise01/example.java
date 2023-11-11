package DT_Practice.practice03.practise01;

import java.util.Scanner;

public class example {


    public static void main(String[] args) {
        System.out.println(" Annemi seviyorum");
        
        String anne = " Seni seviyorum";
        System.out.println("anne = " + anne);

        Scanner input = new Scanner(System.in);

        System.out.println(" Please Enter Your Name");

        String name = input.nextLine();

        System.out.println(" Your name is " + name );

        System.out.println("  Please enter your age");

        byte age = input.nextByte();

        System.out.println(" Your age is " + age);
    }
}
