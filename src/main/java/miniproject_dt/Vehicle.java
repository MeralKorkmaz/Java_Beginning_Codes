package miniproject_dt;

import java.util.Scanner;

public class Vehicle {


    String vehicleType;
    int   payment;

  public  int  countPayment(int term){

      if(term ==1 ){
          switch (vehicleType){

              case "CAR":
                  payment = 2000;
                  break;
              case "TRUCK":
                  payment = 3000;
                  break;
              case "BUS":
                  countBusPayment(term);
                  break;
              case "MOTORCYCLE":
                  payment = 1500;
                  break;
              default:
                  System.out.println("Incorrect data entrance");
                  payment = 0;
          }

      }else if(term==2){
          switch (vehicleType){

              case "CAR":
                  payment = 2500;
                  break;
              case "TRUCK":
                  payment = 3500;
                  break;
              case "BUS":
                  countBusPayment(term);
                  break;
              case "MOTORCYCLE":
                  payment = 1750;
                  break;
              default:
                  System.out.println("Incorrect data entrance");
                  payment = 0;
          }


      }else{
          System.out.println("Calculation failed");

      }
      return payment;

  }



  public int countBusPayment(int term){
      Scanner input = new Scanner(System.in);
      System.out.println("Choose the type of the Bus");
      System.out.println("Bus type 1: 18-30 seats");
      System.out.println("Bus type 2: 31 and above seats");

      int busType = input.nextInt();


      switch (busType){
          case 1:
              if (term==1){
                  payment=4000;
              }else{
                  payment=4500;
              }
              break;
          case 2:
              if (term==1){
                  payment=5000;
              }else {
                  payment = 5500;
              }
              break;
          default:
              System.out.println("Incorrect data entrance");
      }

      return payment;
  }




}
