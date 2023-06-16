package Homework;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int days = Integer.parseInt(input.nextLine()) - 1;
        String typeOfAccommodation = input.nextLine();
        String review = input.nextLine();
        double price = 0;

        switch(typeOfAccommodation) {
            case "room for one person":
                price = 18.00 * days;
                break;
            case "apartment":
                if (days < 10) {
                    price = (25.00 * days) * .7;
                } else if (days > 10 && days < 15) {
                    price = (25.00 * days) * .65;
                } else {
                    price = (25.00 * days) * .5;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    price = (35.00 * days) * .9;
                } else if (days > 10 && days < 15) {
                    price = (35.00 * days) * .85;
                } else {
                    price = (35.00 * days) * .8;
                }
                break;
        }
        if (review.equals("positive")) {
            price = price * 1.25;
        } else {
            price = price * .9;
        }

        System.out.printf("\n%.2f", price);
    }
}
