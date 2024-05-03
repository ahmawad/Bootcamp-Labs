package org.example;

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class FileReadWrite {

    private static final String filePath = "src/main/resources/transactions.csv";
    private static final DecimalFormat def = new DecimalFormat("#0.00");


    public static List<Transaction> readTransaction() {

        List<Transaction> transactions = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                String[] data = line.split("\\|");

                String date = data[0];
                String time = data[1];
                String description = data[2];
                String vendor = data[3];
                double amount = Double.parseDouble(data[4]);

                Transaction transaction = new Transaction(date, time, description, vendor, amount);
                transactions.add(transaction);
            }

        }
        catch (IOException ex) {
            System.out.println("""
                    Are these hieroglyphics?
                    Yeah I can't read these lil bro.
                    """);
        }

        return transactions;
    }


    public static void writeTransaction(Transaction transaction) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {

            transaction.currentDate();
            transaction.currentTime();
            writer.newLine();

            writer.write(transaction.getDate() + "|" + transaction.getTime() + "|" + transaction.getDescription() + "|" + transaction.getVendor() + "|" + def.format(transaction.getAmount()));
            System.out.println("Another money move for the history books.");
        }
        catch (IOException ex) {
            System.out.println("How do you want me to write for you when you can't afford a pen you bum.");
        }
    }


}