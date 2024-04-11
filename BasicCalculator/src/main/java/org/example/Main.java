package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

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
            int sum = addition(num1, num2);
            System.out.println(num1 + "+" + num2 + "=" + sum);
        }
        else if (choice.equalsIgnoreCase("s")) {
            int diff = subtraction(num1, num2);
            System.out.println(num1 + "-" + num2 + "=" + diff);
        }
        else if (choice.equalsIgnoreCase("m")) {
            int prod = product(num1, num2);
            System.out.println(num1 + "*" + num2 + "=" + prod);
        }
        else if (choice.equalsIgnoreCase("d")) {
            int quot = quotient(num1, num2);
            System.out.println(num1 + "/" + num2 + "=" + quot);
        }

    }
    public static int addition (int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static int subtraction (int num1, int num2){
        int diff = num1 - num2;
        return diff;
    }
    public static int product (int num1, int num2){
        int prod = num1 * num2;
        return prod;
    }
    public static int quotient (int num1, int num2){
        int quot = num1 / num2;
        return quot;
    }


}