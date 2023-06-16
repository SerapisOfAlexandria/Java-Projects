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
                if (days <= 14 && days > 7) {
                    studio = studio * 0.95;
                } else if (days > 14) {
                    studio = studio * 0.7;
                    apartment = apartment * 0.9;
                }
                break;
            case "June":
            case "September":
                studio = 75.20;
                apartment = 68.70;
                if (days > 14) {
                    studio = studio * 0.8;
                    apartment = apartment * 0.9;
                }
                break;
            case "July":
            case "August":
                studio = 76.0;
                apartment = 77.0;
                if(days > 14) {
                    apartment = apartment * .9;
                }
                break;
        }


        double apartamentTotal = apartment * days;
        double studioTotal = studio * days;


        System.out.printf("Apartment: %.2f lv.\n", apartamentTotal);
        System.out.printf("Studio: %.2f lv.", studioTotal);
    }
}
