package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        float num1 = scanner.nextFloat();

        System.out.println("Enter the second number:");
        float num2 = scanner.nextFloat();

        scanner.nextLine();

        System.out.println("""
        Possible calculations:
        (A)dd
        (S)ubtract
        (M)ultiply
        (D)ivide
        Please select an option: """);

        String choice = scanner.nextLine();


        if(choice.equalsIgnoreCase("a")){
            System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
        }
        else if (choice.equalsIgnoreCase("s")) {
            System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
        }
        else if (choice.equalsIgnoreCase("m")) {
            System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
        }
        else if (choice.equalsIgnoreCase("d")) {
            System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
        }

    }
}