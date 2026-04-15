package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      taking different inputs
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = scanner.nextLine();

        System.out.print("How many tickets would you like? ");
        int tickets = scanner.nextInt();

//      formatting the name and date
        String[] namepart = name.split(" ");

        for (int i = 0; i < namepart.length; i++) {
            System.out.println(namepart[i]);
        }
        //format the date
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate eventDate = LocalDate.parse(date,formatter);

        System.out.println(eventDate.getMonthValue());


        // print out it in the format the exercise wants
        // System.out.printf("%d tickets purchased for ");


    }
}

