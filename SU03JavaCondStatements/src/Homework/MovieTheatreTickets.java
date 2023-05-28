package Homework;

import java.util.Scanner;

public class MovieTheatreTickets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String day = input.nextLine();
        int price = 0;

        switch(day) {
            case "Monday":
                price = 12;
                break;
            case "Tuesday":
                price = 12;
                break;
            case "Wednesday":
                price = 14;
                break;
            case "Thursday":
                price = 14;
                break;
            case "Friday":
                price = 12;
                break;
            case "Saturday":
                price = 16;
                break;
            case "Sunday":
                price = 16;
                break;
        }
        System.out.println(price);
    }
}
