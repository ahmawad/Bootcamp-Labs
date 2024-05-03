package org.example;

import java.util.*;

public class Screen {

    public static String selection() {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public static void homeScreen() {
        while (true) {

            System.out.println("""
                    What money moves are you making today?
                    D) Add Deposit (We stack racks!)
                    P) Make Debit Payment (No credit because we own the debt!)
                    L) View Ledger (We counting our money?)
                    X) Exit (I'm not about my bread.)
                    """);

            switch (selection().toLowerCase()) {
                case "d" -> addDeposit();
                case "p" -> addPayment();
                case "l" -> ledgerScreen();
                case "x" -> {
                    System.out.println("""
                                                                                                            ░░                                                                   \s
                                                                                                          ░░▒▒░░░░░░▒▒░░░░                                                       \s
                                                                                                          ▒▒░░▒▒  ▒▒░░    ░░░░                                                   \s
                                                                                                ░░▒▒▒▒    ▒▒░░░░  ▒▒  ▒▒░░    ░░░░  ▒▒                                           \s
                                                                                    ░░  ▓▓  ▒▒░░░░░░░░    ▒▒░░░░░░▒▒  ▒▒░░░░▒▒░░  ▒▒  ▒▒░░                                       \s
                                                                                    ▒▒  ▒▒  ▒▒  ▒▒░░    ░░▒▒░░  ▒▒░░▒▒▒▒  ▒▒▒▒░░░░░░░░▒▒  ▒▒  ░░                                 \s
                                                                                    ▒▒  ▒▒░░▓▓  ▒▒▒▒    ▒▒░░░░░░▒▒  ▒▒░░  ▒▒▒▒  ▒▒  ▒▒░░░░  ░░░░                                 \s
                                                                              ░░░░  ▓▓  ▒▒░░▒▒  ▒▒░░    ▒▒    ▒▒░░░░▒▒  ▒▒▒▒  ░░  ▒▒▒▒░░  ░░▒▒  ▒▒░░                             \s
                                                                  ░░░░    ░░░░▒▒░░  ▒▒  ▒▒░░░░░░▒▒░░  ░░▒▒░░░░▒▒  ▒▒░░▒▒░░░░  ░░░░░░  ░░░░▒▒  ▒▒░░░░▒▒                           \s
                                                                ░░░░    ▒▒░░  ▓▓    ▒▒  ▓▓  ░░░░░░    ▒▒░░░░░░░░░░▒▒  ▒▒░░  ░░░░▒▒  ░░░░▒▒  ▒▒░░░░▒▒  ░░▒▒                       \s
                                                              ▒▒  ▒▒  ░░▒▒▒▒  ▓▓    ▒▒  ░░░░  ▒▒░░    ▒▒░░  ░░  ▒▒  ▒▒    ░░  ▒▒  ░░  ▒▒  ▒▒░░▒▒▒▒  ▒▒░░  ░░▒▒▒▒                 \s
                                                          ▒▒  ░░  ░░  ░░░░▒▒░░▒▒░░  ▒▒  ░░▒▒  ▒▒░░    ░░  ░░░░  ░░░░▒▒  ░░  ▒▒░░░░  ▒▒  ▒▒░░░░▒▒  ▒▒░░  ░░▒▒▒▒▒▒▒▒               \s
                                                      ░░  ▒▒░░  ▒▒  ░░░░  ▒▒░░░░░░  ▒▒  ░░▒▒  ▒▒    ░░▒▒  ░░  ░░  ▒▒      ░░░░░░  ▒▒  ▒▒  ▒▒░░░░▒▒  ░░▒▒░░░░  ░░  ░░             \s
                                                        ▒▒  ▒▒  ▒▒  ▒▒    ▒▒▒▒░░░░  ▒▒  ░░░░░░░░    ░░░░░░░░    ░░░░  ░░░░░░░░  ░░  ░░  ▒▒░░░░░░  ░░░░▓▓░░░░░░    ░░░░           \s
                                                    ░░░░░░  ▒▒▒▒  ░░░░    ░░░░  ▒▒  ▒▒    ░░░░░░    ▒▒  ▒▒░░    ▒▒      ░░░░  ░░  ░░  ▒▒  ░░░░░░░░▒▒▒▒  ░░░░░░      ░░  ░░       \s
                                                    ▒▒░░  ▒▒  ▒▒  ▒▒  ░░    ▒▒  ▒▒  ░░      ░░░░  ░░░░  ▒▒    ░░░░    ░░    ░░  ░░  ░░  ░░  ░░▒▒▒▒░░  ░░░░░░░░        ▒▒  ░░░░   \s
                                                ▒▒▒▒  ▓▓▒▒  ░░░░░░  ░░░░    ▒▒  ▒▒          ░░    ░░  ░░░░    ▓▓    ░░    ░░  ░░  ░░░░░░  ▒▒▒▒▒▒░░▒▒░░░░░░░░            ▒▒  ░░   \s
                                              ░░  ▒▒░░░░▒▒░░    ▒▒  ▒▒      ▒▒░░░░░░░░      ░░    ░░  ▒▒    ▒▒░░    ░░  ░░  ░░░░░░░░░░░░▒▒▒▒▒▒░░░░░░░░░░░░              ░░       \s
                                            ░░░░▒▒  ▒▒░░░░░░░░░░  ░░    ░░  ░░░░░░░░░░  ░░░░░░    ░░░░░░  ░░▒▒    ░░  ░░  ░░░░░░░░  ░░▓▓▒▒░░▒▒░░░░░░░░  ░░              ░░▒▒     \s
                                      ░░      ▒▒▒▒▒▒  ▒▒░░▒▒░░    ░░  ░░░░    ░░  ░░░░    ░░░░  ░░  ▒▒    ▒▒    ░░      ░░░░  ░░░░▒▒▒▒▒▒░░░░░░▒▒░░░░░░▒▒░░▒▒                ▒▒   \s
                                      ░░    ░░  ▒▒▒▒░░░░▒▒  ▒▒░░    ░░░░      ░░  ░░      ░░    ░░░░░░  ░░░░            ░░  ░░░░▒▒▓▓▒▒  ░░░░░░░░░░░░▒▒░░▒▒░░░░░░          ░░  ▓▓ \s
                                          ░░      ▒▒▒▒░░░░▒▒  ▒▒    ░░  ░░    ░░░░▒▒  ░░  ▒▒    ░░▒▒░░  ▒▒                  ░░▒▒▒▒░░░░▒▒▒▒░░░░  ░░▒▒░░▒▒▒▒▒▒░░░░  ░░    ▒▒▒▒░░▒▒▒▒
                                    ░░░░  ▒▒░░      ▒▒░░  ░░▒▒  ▒▒    ░░░░    ░░░░    ░░  ░░      ▒▒  ░░                  ▒▒▒▒▒▒░░░░░░░░░░░░    ░░░░▒▒░░▒▒░░░░░░░░░░░░▒▒░░░░▒▒░░▒▒
                                  ░░    ░░  ░░░░      ░░▒▒  ░░░░░░░░            ░░░░  ░░        ░░░░  ░░        ░░    ░░░░░░░░░░░░▒▒░░░░          ▒▒░░▒▒░░  ░░░░░░░░▒▒▒▒░░░░▒▒▒▒ \s
                                  ░░  ░░▓▓░░  ░░▒▒      ░░▒▒  ░░░░░░░░  ░░░░    ░░      ░░      ░░  ▒▒              ░░░░░░░░░░░░▓▓░░░░░░░░░░      ░░▒▒░░░░░░░░░░░░▒▒░░▒▒▒▒▒▒░░   \s
                                ░░  ░░    ▒▒▒▒░░  ▒▒      ░░░░  ░░  ░░          ░░      ░░    ░░░░░░              ░░░░▒▒░░░░░░░░░░▓▓▒▒░░░░░░  ░░    ░░░░░░░░  ░░  ░░▒▒░░▒▒       \s
                                ░░  ░░▒▒    ░░▒▒░░  ▒▒      ░░░░  ▒▒  ▒▒                ░░    ░░  ░░            ▒▒▒▒░░░░░░░░░░░░▒▒▒▒▓▓░░░░░░░░░░  ░░░░░░  ░░░░  ░░▒▒▒▒▒▒         \s
                                ░░  ░░░░▒▒░░    ▒▒░░  ▒▒░░    ░░░░  ▒▒  ░░        ░░          ░░░░            ▒▒▒▒░░▓▓░░░░░░░░▒▒░░▒▒▒▒▓▓▓▓░░░░    ░░    ░░░░░░▒▒░░▒▒░░           \s
                                    ░░▒▒  ░░▒▒░░  ░░▒▒    ░░    ░░▒▒  ░░  ░░      ░░        ░░            ░░▒▒▒▒░░░░▓▓▒▒░░░░▒▒▒▒░░░░▓▓▒▒▓▓▓▓░░░░░░  ░░░░░░░░▒▒░░▒▒               \s
                                  ░░▒▒  ░░▒▒  ░░▒▒    ▒▒░░░░░░    ░░░░  ░░░░      ░░░░      ░░░░    ░░  ░░▒▒░░░░░░░░▓▓▓▓▒▒░░░░░░░░▒▒▒▒▓▓▓▓▓▓▒▒░░░░  ░░░░▒▒░░▒▒░░                 \s
                                  ░░  ▒▒░░  ░░░░  ▒▒░░  ░░░░  ░░    ░░░░  ░░░░      ░░    ░░          ▒▒░░▒▒░░    ░░▒▒▒▒▓▓░░░░░░░░░░░░▒▒▓▓▓▓▒▒░░  ░░░░░░▒▒▒▒                     \s
                                ░░▒▒▒▒░░  ░░░░  ░░░░░░▒▒    ░░  ▒▒      ░░  ░░░░    ░░              ▒▒░░░░░░░░    ░░░░▒▒▒▒▒▒░░░░░░░░░░░░▒▒▓▓▓▓▒▒  ▒▒▒▒▒▒░░                       \s
                                ▒▒▒▒▒▒▒▒▓▓░░░░░░░░  ░░  ░░    ░░  ░░░░    ░░                    ░░░░▒▒░░░░░░░░    ░░░░▒▒▓▓▓▓░░░░░░░░░░▒▒▓▓▓▓▒▒▒▒▒▒░░▒▒                           \s
                                  ░░▓▓▒▒▒▒░░▒▒░░  ▒▒░░  ░░░░░░  ░░  ░░░░    ░░░░░░      ░░  ░░░░░░▒▒░░  ░░░░      ░░░░▓▓▒▒▓▓▓▓▒▒░░░░▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒                             \s
                                ░░░░  ░░▒▒▒▒▒▒░░░░░░  ░░░░░░░░░░░░  ░░  ░░    ░░░░░░  ░░░░  ▒▒▒▒░░░░  ░░      ░░    ░░▓▓▓▓▒▒▓▓▒▒░░░░░░▒▒░░░░▒▒░░░░                               \s
                                ░░░░  ░░░░  ░░▒▒▓▓░░░░░░  ░░  ░░  ░░  ░░  ▒▒      ▒▒  ░░    ░░░░  ░░░░░░░░░░░░░░░░░░░░▒▒▓▓▓▓▓▓▓▓░░░░░░░░░░▒▒▒▒░░                                 \s
                                ░░▒▒▓▓▒▒░░  ░░░░  ░░▒▒░░░░░░  ░░  ░░  ░░░░  ░░░░  ░░          ░░    ░░░░░░░░▒▒▒▒▒▒▒▒▒▒░░▒▒▓▓▓▓▓▓▓▓▒▒░░░░░░░░                                     \s
                              ▒▒▒▒░░    ░░▒▒▒▒░░  ░░░░  ░░░░░░░░      ░░  ░░░░░░▒▒░░            ░░  ░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒░░░░░░                                   \s
                                  ░░▒▒▓▓░░░░  ░░▒▒▒▒░░        ░░▒▒░░░░        ░░░░░░  ░░  ░░  ░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▓▓▓▓▓▓░░░░▒▒▒▒░░                                 \s
                                            ░░▒▒▒▒    ░░░░░░      ░░░░░░░░      ░░░░        ░░░░░░▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██▓▓░░▒▒▒▒▒▒▒▒░░░░                               \s
                                                    ░░░░░░  ░░░░░░      ░░░░░░  ░░░░░░        ░░░░░░▒▒░░░░▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒                               \s
                                                            ░░░░    ░░░░      ░░░░    ░░░░    ░░░░░░░░▒▒░░░░▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░                             \s
                                                                          ░░      ░░▒▒  ░░░░░░░░░░░░░░▒▒░░░░▒▒░░░░▒▒░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒                             \s
                                                                                    ░░░░  ░░░░░░░░░░░░░░▒▒░░░░░░░░▓▓▒▒░░▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░                           \s
                                                                                    ░░░░░░░░░░░░░░░░░░░░░░▒▒░░▒▒▓▓▓▓▒▒▒▒░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                           \s
                                                                                      ░░▒▒▒▒░░░░▓▓██████░░░░▓▓▓▓▓▓▒▒░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░                         \s
                                                                                      ░░░░▒▒░░░░░░░░░░░░░░░░▒▒▓▓▓▓░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                         \s
                                                                                      ░░▒▒▒▒▒▒░░░░░░░░░░░░▒▒░░▓▓░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                         \s
                                                                                        ▒▒▒▒▒▒░░░░▓▓▓▓░░░░░░▒▒░░░░░░░░▓▓▒▒░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░                       \s
                                                                                          ░░▒▒▒▒▒▒▒▒▒▒▓▓░░░░░░▒▒░░░░▓▓▓▓▒▒░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░                       \s
                                                                                            ░░░░▒▒▒▒▒▒▒▒▒▒░░▒▒▓▓▓▓▓▓▒▒▒▒▒▒░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                       \s
                                                                                                  ░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                     \s
                                                                                                      ░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░                   \s
                                                                                                          ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░                 \s
                                                                                                                ░░▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                 \s
                                                                       $$$  If you wanna stay broke then say that!  $$$
                                                                       $$$  Watch this money spread on the way out!  $$$
                            """);
                    System.exit(0);
                }
                default -> {
                    System.out.println("That wasn't a cash money move!");
                    System.out.println("Select using the letter options listed!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    private static void addDeposit() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            try {
                System.out.println("$$$ Depositing the Dough $$$");

                Transaction deposit = new Transaction();

                System.out.println("""
                        What's the move?
                        Drop that description!""");
                String description = scanner.nextLine();

                System.out.println("Who was the vendor?");
                String vendor = scanner.nextLine();

                System.out.println("I'm gonna need that dollar amount.");
                System.out.println("How much are we moving?");
                double amount = Double.parseDouble(scanner.nextLine());

                deposit.setDescription(description);
                deposit.setVendor(vendor);
                deposit.setAmount(amount);
                FileReadWrite.writeTransaction(deposit);
            }
            catch (NumberFormatException ex) {
                System.out.println("""
                        I'm asking about the money man.
                        NOTHING ELSE!!!
                        """);

                try {Thread.sleep(2000);}
                catch (InterruptedException e) {throw new RuntimeException(e);}
            }
            homeScreen();
        }

    }

    private static void addPayment() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("$$$ Gotta Spend Money to Make Money $$$");

                Transaction payment = new Transaction();

                System.out.println("""
                        What's the move?
                        Drop that description!""");
                String description = scanner.nextLine();

                System.out.println("Who was the vendor?");
                String vendor = scanner.nextLine();

                System.out.println("I'm gonna need that dollar amount.");
                System.out.println("How much are we moving?");
                double amount = Math.abs(Double.parseDouble(scanner.nextLine())) * -1;

                payment.setDescription(description);
                payment.setVendor(vendor);
                payment.setAmount(amount);
                FileReadWrite.writeTransaction(payment);
            }
            catch (NumberFormatException ex) {
                System.out.println("""
                        I'm asking about the money man.
                        NOTHING ELSE!!!
                        """);

                try {Thread.sleep(2000);}
                catch (InterruptedException e) {throw new RuntimeException(e);}
            }
            homeScreen();
        }
    }

    private static void ledgerScreen() {

        System.out.println("$$$ Let's Check Our Pockets for a Second $$$");

        while (true) {
            System.out.println("""
                    Let's see these money moves.
                    A) All the Transactions (All the money moves!)
                    D) All the Deposits (Let's see that money coming in!)
                    P) All the Payments (Let's see what we bought. Something light.)
                    R) Filtered Reports (Need something specific. Let's check if someone still owes us.)
                    H) Return to Home screen (I don't need to check my pockets. I got it like that!)
                    """);

            switch (selection().toLowerCase()) {
                case "a" -> {
                    List<Transaction> allTransactions = SortSearch.getAllTransactions(FileReadWrite.readTransaction());
                    transactionPrint(allTransactions);
                }
                case "d" -> {
                    List<Transaction> deposits = SortSearch.getAllDeposits(FileReadWrite.readTransaction());
                    transactionPrint(deposits);
                }
                case "p" -> {
                    List<Transaction> withdraw = SortSearch.getAllPayments(FileReadWrite.readTransaction());
                    transactionPrint(withdraw);
                }
                case "r" -> sortSelection();
                case "h" -> homeScreen();
                default -> {
                    System.out.println("""
                            How are you gonna reach for your pocket and miss?
                            Select using the letter options listed!
                            Run that back.
                            """);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }

    public static void sortSelection() {

        System.out.println("$$$ Let's Dig Deeper in Them Pockets $$$");

        while (true) {
            System.out.println("""
                    How deep we getting into those pockets?
                    I'm not writing something for all these options ngl.
                    1) Month To Date
                    2) Last Month
                    3) Year To Date
                    4) Last Year
                    5) Search by Vendor
                    6) Custom Search
                    0) Back to Ledger Screen
                    """);

            switch (selection()) {
                case "1" -> {
                    List<Transaction> monthToDate = SortSearch.transactionsByPeriod(FileReadWrite.readTransaction(), "MonthToDate");
                    transactionPrint(monthToDate);
                }
                case "2" -> {
                    List<Transaction> previousMonth = SortSearch.transactionsByPeriod(FileReadWrite.readTransaction(), "PreviousMonth");
                    transactionPrint(previousMonth);
                }
                case "3" -> {
                    List<Transaction> yearToDate = SortSearch.transactionsByPeriod(FileReadWrite.readTransaction(), "YearToDate");
                    transactionPrint(yearToDate);
                }
                case "4" -> {
                    List<Transaction> previousYear = SortSearch.transactionsByPeriod(FileReadWrite.readTransaction(), "PreviousYear");
                    transactionPrint(previousYear);
                }
                case "5" -> {
                    List<Transaction> vendorSort = SortSearch.searchByVendor(FileReadWrite.readTransaction());
                    transactionPrint(vendorSort);
                }
                case "6" -> customSift();
                case "0" -> ledgerScreen();
                default -> {
                    System.out.println("""
                            Pockets can get deep but not that deep.
                            Select using the numbers listed!
                            Run that back.
                            """);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    public static void transactionPrint(List<Transaction> transactions) {

        int transactionCount = 0;

        for (Transaction transaction : transactions) {
            System.out.printf("Date: %s Time: %s Description: %s Vendor: %s Amount: %s\n",
                    transaction.getDate(), transaction.getTime(), transaction.getDescription(), transaction.getVendor(), transaction.getAmount());

            transactionCount++;
        }
        if (transactionCount == 0) {
            System.out.println("""
                    Couldn't find anything like that.
                    Might wanna get those eyes checked.
                    """);

            try {Thread.sleep(2000);}
            catch (InterruptedException e) {throw new RuntimeException(e);}
        }
        else {
            System.out.println("Those are all the money moves I found.");
        }
    }

    public static void customSift() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Let's get elbows deep in them pockets.
                Leave it blank and press enter if you can't remember.
                """);
        System.out.println("How early am I checking for? (yyyy-mm-dd)");
        String startDate = scanner.nextLine();

        if(startDate.isEmpty()){
            startDate = null;
        }

        System.out.println("What about the latest? (yyyy-mm-dd)");
        String endDate = scanner.nextLine();

        if(endDate.isEmpty()){
            endDate = null;
        }

        System.out.println("""
                        You know what it is.
                        Drop that description!""");
        String description = scanner.nextLine();

        System.out.println("Who was the vendor?");
        String vendor = scanner.nextLine();

        System.out.println("""
                        Let me know what I'm working with.
                        What's the highest I'm looking for?""");
        String maxAmountInput = scanner.nextLine();

        System.out.println("What about the lowest?");
        String minAmountInput = scanner.nextLine();

        Double minAmount = null;
        Double maxAmount = null;

        try {
            if (!minAmountInput.isEmpty() && !maxAmountInput.isEmpty()) {
                minAmount = Double.parseDouble(minAmountInput);
                maxAmount = Double.parseDouble(maxAmountInput);
            }
        }
        catch (NumberFormatException ex){
            System.out.println("""
                        I'm asking for numbers man.
                        You think this is rocket science?!
                        """);

            try {Thread.sleep(2000);}
            catch (InterruptedException e) {throw new RuntimeException(e);}
        }
        transactionPrint(CustomSearch.customSearch(FileReadWrite.readTransaction(),
                startDate, endDate, description, vendor, minAmount, maxAmount));
    }
}