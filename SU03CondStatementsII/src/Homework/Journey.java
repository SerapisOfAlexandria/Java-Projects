package Homework;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double budget = Double.parseDouble(input.nextLine());
        double leftBudget = budget;
        String season = input.nextLine();
        String destination = " ";
        String typeOfAccommodation = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    budget = budget * .7;
                    break;
                case "winter":
                    budget = budget * .3;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    budget = budget * .6;
                    break;
                case "winter":
                    budget = budget * .2;
                    break;
            }
        } else if (budget > 1000) {
            destination = "Europe";
            budget = budget * 0.1;
        }

        if (destination.equals("Europe")) {
            typeOfAccommodation = "Hotel";
        }
        else if (season.equals("summer")) {
            typeOfAccommodation = "Camp";
        } else {
            typeOfAccommodation = "Hotel";
        }

        System.out.printf("Somewhere in %s \n", destination);
        System.out.printf("%s - %.2f",typeOfAccommodation, leftBudget - budget);

    }
}
