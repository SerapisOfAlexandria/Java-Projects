package Homework;

import java.util.Scanner;

public class Hotelroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String month = input.nextLine();
        int days = Integer.parseInt(input.nextLine());
        double studio = 0.0;
        double apartment = 0.0;

        switch (month) {
            case "May":
            case "October":
                studio = 50.0;
                apartment = 65.0;
                break;
            case "June":
            case "September":
                studio = 75.20;
                apartment = 68.70;
                break;
            case "July":
            case "August":
                studio = 76.0;
                apartment = 77.0;
                break;
        }

        double studioTotal = studio * days;
        double apartamentTotal = apartment * days;

        if ((days < 14 && days > 7) && (month.equals("May") || month.equals("October"))) {
            studioTotal = studioTotal * .95;
        } else if (days > 14 && (month.equals("October") || month.equals("May"))) {
            studioTotal = studioTotal * .7;
        }

        if (days > 14 && (month.equals("June") || month.equals("September"))) {
            studioTotal = studioTotal * .8;
        }

        if (days > 14) {
            apartamentTotal = apartamentTotal * .9;
        }

        System.out.printf("Apartment: %.2f lv.\n", apartamentTotal);
        System.out.printf("Studio: %.2f lv.", studioTotal);
    }
}
