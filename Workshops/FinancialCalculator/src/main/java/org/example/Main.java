package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("""
                Hello
                Welcome to The Super Awesome Financial Calculator.
                Please enter your name.
                """);
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Thank you for choosing to use our calculator " + userName + ".\n");
        System.out.println("""
                There are three Super Awesome calculators to choose from.
                
                First there is the Super Awesome Mortgage Calculator.
                This one allows you to calculate your monthly payment and total interest paid.
                All you need to provide is principle, interest rate, and loan length.
                
                Second there is the Super Awesome Future Value Calculator.
                This one allows you to calculate the interest gained in a certificate of deposit.
                It also works on untouched savings accounts.
                All that is needed is your starting deposit, interest rate, and number of years of your CD.
                
                Lastly we have the Super Awesome Present Value Calculator.
                This one allows you to calculate how much present value is required for your ideal annuity.
                Your annuity must include monthly payout, expected interest rate, and the duration in years.
                
                To continue, please press enter.
                """);

        scanner.nextLine();

        System.out.println("""
                Please select one of the Super Awesome calculators using the letters listed:
                
                A.)Super Awesome Mortgage Calculator
                
                B.)Super Awesome Future Value Calculator
                
                C.)Super Awesome Present Value Calculator
                
                """);
        while (true) {
            String calChoice = scanner.nextLine();

            if (calChoice.equalsIgnoreCase("a")) {
                Main.MortgageCalc();
                break;
            }
            else if (calChoice.equalsIgnoreCase("b")) {
                Main.FutureValue();
                break;
            }
            else if (calChoice.equalsIgnoreCase("c")) {
                Main.PresentValue();
                break;
            }
            else {
                System.out.println("Invalid input. Please select one of the three calculators.");
            }
        }



        }


    public static void MortgageCalc(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("You selected the Super Awesome Mortgage Calculator.\n");

        System.out.println("Please enter your principal: ");
        long mortPrin = scanner.nextLong();

        System.out.println("Now enter your interest rate:");
        double mortInt = scanner.nextDouble();

        System.out.println("Finally, enter your loan length in years:");
        int mortYears = scanner.nextInt();

        //M = P[r(1+r)^n] / [(1+r)^n-1]

        double mortMonthInt = ((mortInt/12)/100);

        int numOfPay = (mortYears*12);

        double exponent = Math.pow(1+mortMonthInt,numOfPay);

        double monthPay = mortPrin*(mortMonthInt*exponent/(exponent-1));

        double totInt = (monthPay*numOfPay)-mortPrin;

        System.out.printf("Your monthly pay will be $%.2f\n",monthPay);
        System.out.printf("Your total interest paid will be $%.2f\n",totInt);

    }
    public static void FutureValue(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("You selected the Super Awesome Future Value Calculator.\n");

        System.out.println("Please enter your deposit:");
        long deposit = scanner.nextLong();

        System.out.println("Now enter your interest rate:");
        double annIntInput = scanner.nextDouble();

        System.out.println("Next, enter how long you will be saving for in years:");
        int yearSav = scanner.nextInt();

        System.out.println("""
                Finally, enter how often your interest is compounded per year:
                (For daily put 365, for monthly put 12, for quarterly put 4, etc.)""");
        int numCompound = scanner.nextInt();

        //FV = P(1 + r/n)^(n*t)
        //M = P[r(1+r)^n] / [(1+r)^n-1]

        double annInt = (annIntInput/100);

        double intInc = Math.pow(1+annInt/numCompound,numCompound*yearSav);

        double totInt = deposit*intInc;

        double intEarn = totInt-deposit;

        System.out.printf("Your total value will be $%.2f\n",totInt);
        System.out.printf("Your total interest earned will be $%.2f\n",intEarn);
    }
    public static void PresentValue(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("You selected the Super Awesome Present Value Calculator.\n");

        System.out.println("Please enter your annuities monthly pay:");
        long montPay = scanner.nextLong();

        System.out.println("Now enter your expected earned interest rate:");
        double annIntInput = scanner.nextDouble();

        System.out.println("Lastly, enter how long your annuity will be paying in years:");
        int yearSav = scanner.nextInt();

        double montInt = annIntInput/12/100;

        double motSav = yearSav*12;

        double exponent = Math.pow(1+montInt,-motSav);

        double annBase = montPay*((1-exponent)/montInt);

        System.out.printf("To reach your ideal annuity it will require $%.2f\n",annBase);

    }

}
