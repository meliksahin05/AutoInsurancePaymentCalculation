package b197.AutoInsurancePaymentCalculation;

import java.util.Scanner;

public class Vehicle {

    //new trying git
    //melik
    //Sout ekledim
    //yeni
    //cakisma localle

    //17) copy notes and paste here

    /*
     Tariff period: December 2023, June 2023
      1st term: June 2023                      2nd term: December 2023
         cars: 2000                            cars: 2500
         truck: 3000                           truck: 3500
         bus: type1: 4000 type2: 5000          bus: type1: 4500 type2: 5500
         motorcycle: 1500                      motorcycle: 1750
     */

    //18) create our variables
    //type , payment, busType

    public String type;
    public int payment;


    int busType;

    //19) create a method to calculate payment with parameter and explain why we use int term ...

    public int countPayment(int term){  // term will be given by the user
        // show basic if, if else() and else part(for incorrect data) of the statement and then add switch statement

        //20) create if statement conditions part without  switch

        if (term==1){

            //23 create switch part and put type variable then create case leri without bus because bus needs to have nested switch and nested switch is working slow


            switch (type){
                case "CAR":
                    payment=2000;
                    break;
                case "TRUCK":
                    payment=3000;
                    break;
                case "BUS":
                    // create separate method for Bus coz there are two types of buses... nested switch is not recommended

                    //40 call methodcall and put term into parenthesis
                    countBusPayment(term);
                    break;
                case "MOTORCYCLE":
                    payment=1500;
                    break;

                    //26 put default and print, payment=0 and break here
                default:
                    System.out.println("Incorrect data entrance");
                    payment=0;
                    break;
            }

            //21) create else if part conditions without puttting switch part

        }else if(term==2){

          //24 create switch part. To do this copy switch in term 1 and paste it here

            switch (type){
                case "CAR":
                    payment=2500;
                    break;
                case "TRUCK":
                    payment=3500;
                    break;
                case "BUS":

                    //41 call methodcall and put term into parenthesis
                    countBusPayment(term);

                    //42 go to vehicleInsurancePayment class

                    break;
                case "MOTORCYCLE":
                    payment=1750;
                    break;

                //27 put default and print, payment=0 and break here

                default:
                    System.out.println("Incorrect data entrance");
                    payment=0;
                    break;
            }

            //22) create else part and give message to user without payment part


        }else{

            System.out.println("Incorrect input");

            //25 put 0 and explain why
            payment=0;
        }

        //28 add return payment; here

        return payment;
    }

    /*
     Tariff period: December 2023, June 2023
      1st term: June 2023                      2nd term: December 2023
         cars: 2000                            cars: 2500
         truck: 3000                           truck: 3500
         bus: type1: 4000 type2: 5000          bus: type1: 4500 type2: 5500
         motorcycle: 1500                      motorcycle: 1750
     */

     //29 ile 39 arasinda ki adimlar burda
    //29 create a bus payment method with parametere and explain why we put parameter

    public int countBusPayment(int term){


        //30 create a scanner class and object

        Scanner input= new Scanner(System.in);

        //31 give a message to user to choose type of bus

        System.out.println("Enter the type of bus: ");
        System.out.println("Type 1: 18-30 seats"+"\nType 2: 31 and above seats");

        //32 create bus type to get data from user

        // int busType=input.nextInt();  create a local variable
        int busType=input.nextInt();         // or create class variable and initiate it here

        //33 create switch statement and put busType into the conditions

        switch (busType){

            //34 create case then create if statement then put term in the conditions

            case 1:  //if bus type = 1
                if(term==1) {
                    // 35 put payment and its value

                    payment = 4000;
                }else{
                    //36 put payment and its value
                    payment=4500;
                }

                //37 put break

                break;

                //38 create case 2 and create if part and put term and put payment and put else and put payment then put break

            case 2: //if bus type = 2
                if(term==1){
                    payment=5000;
                }else {
                    payment=5500;
                }
                break;

        }

        //39 put return payment; here

        return payment;

        //go up find 40(in the first switch for bus)
    }
     /*
    we can refine and improve our project even more by:
      1. adding discounts e.g. 10% less if you pay by this ....  date OR 25% less if you insure your car with us for 2 terms etc.
      2. we can add different calculations for cars (hybrid, electric, diesel etc.), for trucks (tow truck, trailer, flatbed truck  etc.) for motorcycles(heavy bike, mountain bike, hybrid bike etc.)
      3. discounts for registering more than one vehicles with us etc.

     */



}
