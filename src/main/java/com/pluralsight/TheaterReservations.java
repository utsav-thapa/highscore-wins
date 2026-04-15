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

        //format the date
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);
        //LocalDate eventDate = LocalDate.parse(date,formatter);


        System.out.print("How many tickets would you like? ");
        int tickets = scanner.nextInt();

//      formatting the name and date
        String[] namepart = name.split(" ");

//        for (int i = 0; i < namepart.length; i++) {
//            System.out.println(namepart[i]);
//        }

        // System.out.println(date);


        // print out it in the format the exercise wants
        if (tickets > 1) {
            System.out.println(tickets +" tickets purchased for " + date + " under " + namepart[1] +", " +namepart[0] );
        }else {
            System.out.println(tickets +" ticket purchased for " + date + " under " + namepart[1] +", " +namepart[0] );
        }


    }
}

