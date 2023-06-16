package Homework;

import java.util.Scanner;

public class MovieTickets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nameOfMovie = input.nextLine();
        int freeSeats = Integer.parseInt(input.nextLine());
        double totalTickets = 0;
        double studentTickets = 0;
        double standardTickets = 0;
        double kidTickets = 0;


            while (true) {
                int boughtTickets = 0;

            while (boughtTickets != freeSeats) {
                String typeOfTicket = input.nextLine();
                if (typeOfTicket.equals("End")) {
                    break;
                }

                if (typeOfTicket.equals("student")) {
                    studentTickets++;
                } else if (typeOfTicket.equals("standard")) {
                    standardTickets++;
                } else if (typeOfTicket.equals("kid")) {
                    kidTickets++;
                }
                boughtTickets++;
            }
            totalTickets += boughtTickets;
            double seats = (100 / (freeSeats + 0.01 - 0.01) * boughtTickets);
            System.out.printf("%s - %.2f%% full.\n", nameOfMovie, seats);

            nameOfMovie = input.nextLine();
            if (nameOfMovie.equals("Finish")) {
                break;
            }
            freeSeats = Integer.parseInt(input.nextLine());
        }

        System.out.printf("Total tickets: %.0f\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", (100 / totalTickets) * studentTickets);
        System.out.printf("%.2f%% standard tickets.\n", (100 / totalTickets) * standardTickets);
        System.out.printf("%.2f%% kids tickets.", (100 / totalTickets) * kidTickets);
    }
}
