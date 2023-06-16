package Homework;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String flowers = input.nextLine();
        int flowerQuantity = Integer.parseInt(input.nextLine());
        int budget = Integer.parseInt(input.nextLine());
        double flowersPrice = 0;

        if (flowers.equals("Roses")) {
            flowersPrice = flowerQuantity *  5;
            if (flowerQuantity > 80) {
                flowersPrice = flowersPrice * .9;
            }
        } else if (flowers.equals("Dahlias")) {
            flowersPrice = flowerQuantity *  3.8;
            if (flowerQuantity > 90) {
                flowersPrice = flowersPrice * .85;
            }
        } else if (flowers.equals("Tulips")) {
            flowersPrice = flowerQuantity *  2.8;
            if (flowerQuantity > 80) {
                flowersPrice = flowersPrice * .85;
            }
        } else if (flowers.equals("Narcissus")) {
            flowersPrice = flowerQuantity *  3;
            if (flowerQuantity < 120) {
                flowersPrice = flowersPrice * 1.15;
            }
        } else if (flowers.equals("Gladiolus")) {
            flowersPrice = flowerQuantity *  2.5;
            if (flowerQuantity < 80) {
                flowersPrice = flowersPrice * 1.20;
            }
        }

        double differenceInBudget = budget - flowersPrice;

        if (differenceInBudget >= 0) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowerQuantity,flowers,differenceInBudget);
        }
        if (differenceInBudget < 0) {
            System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(differenceInBudget));
        }

    }
}