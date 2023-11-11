package miniproject_dt;

import java.util.Scanner;

public class VehicleInsuranceCalculation {



    /*
Project: Auto Insurance Payment Calculator
Vehicle types: car, truck, bus, motorcycle
         -bus: 18-30 seats or 31 and above seats
Tariff period: December 2024, June 2024
1st term: June 2024                      2nd term: December 2024
cars: 2000                            cars: 2500
truck: 3000                           truck: 3500
bus: type1: 4000 type2: 5000          bus: type1: 4500 type2: 5500
motorcycle: 1500                      motorcycle: 1750
In case of incorrect entry, the calculation failed warning should be given to the user and the menu should be shown again.
To be able to let user restart we should present option to restart





*/
    public static void main(String[] args) {
        startCalculation();


    }

    public static void startCalculation(){
        boolean isFailed;

        Scanner input = new Scanner(System.in);
        do{
            isFailed = false;
            System.out.println(".......Welcome to the Insurance Calculator.........");
            System.out.println("Choose a term for insurance calculation" +
                    "\n Press 1 for Jun2 2024 term or Press 2 for December 2024");

            int term = input.nextInt();
            //if the term value is not 1 or 2 ask the user to restart the app.

            if(term ==1 || term==2){

                Vehicle objVehicle  = new Vehicle();//default constructor

                System.out.println("Enter the type of vehicle for payment calculation");
                System.out.println("Car, Truck, Bus, Motorcycle");

                objVehicle.vehicleType = input.next().toUpperCase();
                objVehicle.payment = objVehicle.countPayment(term);

                //check if the payment is greater than 0, give a message to the user "Calculation Done!"
                //if the payment is 0 give a message to user "Incorrect data entrance"

                String termName = term==1 ? "June 2024" : "December 2024";
                int select;

                if (objVehicle.payment>0){
                    System.out.println("Calculation Done!");
                    System.out.println("Vehicle Type: " + objVehicle.vehicleType);
                    System.out.println("Term:" + termName);
                    System.out.println("Total Payment:"  + objVehicle.payment);

                    System.out.println("To Restart Please Press 1 or To Exit Please Press 0");


                    select= input.nextInt();
                    if (select==1){

                        isFailed=true;

                    }else{
                        isFailed=false;
                    }


                }else {
                    System.out.println("Incorrect data entrance");
                    System.out.println("To Restart Please Press 1 or To Exit Please Press 0");

                    select = input.nextInt();

                    if (select ==1){
                        isFailed = true;

                    }else{
                        isFailed = false;

                    }
                }

            }else{
                System.out.println("Incorrect data entrance");
                isFailed = true;//while part will be true so it's going to do part again
            }

        }while(isFailed);

    }
}
