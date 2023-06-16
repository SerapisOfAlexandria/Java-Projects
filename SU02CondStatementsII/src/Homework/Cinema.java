package Homework;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cinemaType = input.nextLine();
        int seatRows = Integer.parseInt(input.nextLine());
        int seatColumns = Integer.parseInt(input.nextLine());
        int totalSeats = seatColumns * seatRows;
        double totalEarnings = 0;

        if (cinemaType.equals("Premiere")) {
            totalEarnings = totalSeats * 12.0;
        } else if (cinemaType.equals("Normal")) {
            totalEarnings = totalSeats * 7.5;
        } else {
            totalEarnings = totalSeats * 5.0;
        }
        System.out.printf("%.2f leva", totalEarnings);
    }
}
