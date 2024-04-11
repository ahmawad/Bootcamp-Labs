package org.example;

import java.util.Scanner;

/*
print needed variables from user :

add scanner for input

declare variables

calculate daily fees

add up days

final surcharge

print total
 */

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please answer the following for your car rental:
                What day will you be picking up?
                Please enter in MM/DD/YY.""");
        String pickUpDay = scanner.nextLine();

        System.out.println("How many days will you be renting for?");
        int daysRent = scanner.nextInt();

        scanner.nextLine();

                        double tTag = (00.00);
                        System.out.println("""
                                The daily charge for an electronic toll tag is $3.95 per day.
                                Would you like an electronic toll tag for your rental?
                                Please answer (Y)es or (N)o""");
                        String tollTag = scanner.nextLine();
                        if (tollTag.equalsIgnoreCase("y")){
                            System.out.println("A daily charge of $3.95 will be added.");
                            tTag = (3.95);
                        }
                        else{
                            tTag = 0;
                        }

                        double bGPS = (00.00);
                        System.out.println("""
                                The daily charge for GPS is $2.95 per day.
                                Would you like GPS for your rental?
                                Please answer (Y)es or (N)o""");
                        String boolGPS = scanner.nextLine();
                        if (boolGPS.equalsIgnoreCase("y")){
                            System.out.println("A daily charge of $2.95 will be added.");
                            bGPS = (2.95);
                        }
                        else {
                            bGPS = 0;
                        }

                        double bRSA = (00.00);
                        System.out.println("""
                                The daily charge for enrolling in roadside assistance is $3.95 per day.
                                Would you like to enroll for roadside assistance with your rental?
                                Please answer (Y)es or (N)o""");
                        String boolRSA = scanner.nextLine();
                        if (boolRSA.equalsIgnoreCase("y")){
                            System.out.println("A daily charge of $3.95 will be added.");
                            bRSA = (3.95);
                        }
                        else {
                            bRSA = 0;
                        }


                double surchAge = (00.00);
                double shownAgeCharge = 0;
                System.out.println("""
                        The minimum age is 18 years old and the is a surcharge of 30% for those renting under 25 years of age.
                        Please enter your age.""");
                int boolAge = scanner.nextInt();
                if (boolAge < 18){
                    System.out.println("Rentals are not permitted for those younger than 18. Have a nice day.");
                }
                else if (boolAge >= 18 && boolAge < 25){
                    System.out.println("The 30% surcharge will be applied to your total charge.");
                    surchAge = (1.30);
                    shownAgeCharge = .30;
                }
                else if (boolAge >= 25){
                    System.out.println("No surcharge will be applied to your total.");
                    surchAge = (1.00);
                }


        double baseCharge = (29.99);

        double totalCharges = ((baseCharge + tTag + bGPS + bRSA) * surchAge * daysRent);

        System.out.printf("Basic car rental:       $%.2f \n" , baseCharge * daysRent);
        System.out.printf("Daily optional charges: $%.2f \n" , (tTag + bGPS + bRSA) * daysRent);
        System.out.printf("Age surcharge:          $%.2f \n" ,((((baseCharge + tTag + bGPS + bRSA) * daysRent) * shownAgeCharge)));
        System.out.printf("_____________________________ \n");
        System.out.printf("Total:                  $%.2f \n" , totalCharges);


    }
}
