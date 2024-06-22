package b197.AutoInsurancePaymentCalculation;

import java.util.Scanner;

public class VehicleInsurancePaymentCalculation {

       /*
       Project: Auto Insurance Payment Calculator
       Vehicle types: car, truck, bus, motorcycle
                     -bus: 18-30 seats or 31 and above seats
      Tariff period: December 2023, June 2023
      1st term: June 2023                      2nd term: December 2023
         cars: 2000                            cars: 2500
         truck: 3000                           truck: 3500
         bus: type1: 4000 type2: 5000          bus: type1: 4500,  type2: 5500
         motorcycle: 1500                      motorcycle: 1750
       In case of incorrect entry, the "Calculation failed" warning should be given to the user and the menu should be shown again.
       To be able to let user restart, we should present option to restart
*/

    public static void main(String[] args) {

        //55 put startCalculation
        startCalculation();

    }

    //1) Create our own method
    //2) create do while loop

    // Create our own method
    public static void startCalculation(){

        //6) create scanner object

        Scanner input=new Scanner(System.in);

        //7) then go to do part and give message to user

        //4) create empty isFailed boolean to continue or break our loops

        boolean isFailed;

        //3) go to while conditions and put true then explain why and then come back do part

        do {


            //5)assign false into isFailed

            isFailed=false;

            //8) create print and give message to user for welcoming
            //9) create a print message for our parameter based on term
            System.out.println("---Calculation for Vehicle Insurance---");
            System.out.println("--- Choose a term for payment calculation: ---"); // \n
            System.out.println("1- June 2023");
            System.out.println("2- December 2023");

            //10) after giving message to user create a term variable

            int term= input.nextInt();

            //11)create if statement  then put term into conditions and go else part then give a message to user "Incorrect term is selected. Calculation failed...

            //if the term entered correctly, the process should go on
            if (term==1 || term==2){

                //15)Explain students ==> We need to get data from user to create vehicle types

                //16) Create vehicle class and go there

                //42 create object from vehicle class

                Vehicle objVehicle=new Vehicle();  // to access the variables and methods from Vehicle class, we create its object

                //43 give a message to user

                System.out.println("Enter the type of vehicle for payment calculation: ");
                System.out.println("Car, Truck, Bus, Motorcycle");

                //44 create input.next.uppercase then asssing objVehicle.type
                objVehicle.type= input.next().toUpperCase();

                //45 create a variable and assign countpayment into payment...
                objVehicle.payment=objVehicle.countPayment(term);


                //46 give comment then create if statement

                //check if the payment is greater than 0, give a message to the user "Calculation Done! OR Insurance Details:"
                //if the payment is 0 or negative give a message to the user "Incorrect data entrance"

                //48 create a string and put ternary

                String termName= term==1 ? "June 2023": "December 2023"; // create a ternary and store in local variable
                int select;

                //47 create if statement and make payment higher than zero then inside if body put insurance details...

                if (objVehicle.payment>0){

                    System.out.println("Insurance Details: ");

                    System.out.println("Vehicle Type: "+ objVehicle.type);

                    // System.out.println(objVehicle.busType == 1 ? "Bus type 1: 18-30 seats" : "Bus type 2: 31 and above seats");

                    // To print term name, create a ternary and store in a local String variable termName

                    //49 create print to see details for term
                    System.out.println("Term : "+ termName);

                    //50 create print to see payment
                    System.out.println("Payment due: " + objVehicle.payment);

                    //51 create print to give a chance for user and create select to get data from user to give chance user
                    // give option to restart if user wants to calculate insurance for another vehicle
                    System.out.println("To Restart Please Press 1, To Exit Please Press 0 ");
                    select= input.nextInt();


                    //52 create if statement to check what user give number for chance
                    if(select==1) {
                        isFailed = true;
                    }else{
                        isFailed=false;
                    }


                    //53 create else part for negative numbers complete also with  if part

                }else{  // if payment is negative, warn user and ask user if he wants to restart the application
                    System.out.println("Incorrect data entrance");
                    System.out.println("To Restart Please Press 1, To Exit Please Press 0: ");
                    select= input.nextInt();
                    if (select==1){
                        isFailed=true;

                    }else {

                        isFailed=false;
                    }

                    //54 go to main method and call the startCalculation....

                }



            }else{  //if the term entered incorrectly, user should get a warning message

                //12) give a message to user incorret data


                System.out.println("Incorrect data. Calculation failed!!");

                //13) create isFailed to give a chance for user

                isFailed=true;

                //14) go up to if term part


            }



        }while (isFailed);





    }


}
