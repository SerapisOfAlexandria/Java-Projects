package Homework;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int budget = Integer.parseInt(input.nextLine());
        String season = input.nextLine();
        int  numberOfFishermen = Integer.parseInt(input.nextLine());
        double price = 0;

        switch(season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }

        if (numberOfFishermen <= 6) {
            price = price * .9;
        } else if (numberOfFishermen > 7 && numberOfFishermen <= 11) {
            price = price * .85;
        } else if (numberOfFishermen > 12) {
            price = price * .75;
        }

        if (numberOfFishermen % 2 == 0 && !season.equals("Autumn")) {
            price = price * .95;
        }

        double moneySum = budget - price;

        if (moneySum >= 0) {
            System.out.printf("Yes! You have %.2f leva left.", moneySum);
        } else if (moneySum < 0) {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(moneySum));
        }

    }
}
