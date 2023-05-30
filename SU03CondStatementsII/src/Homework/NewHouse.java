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
            flowersPrice = 5;
        } else if (flowers.equals("Dahlias")) {
            flowersPrice = 3.8;
        } else if (flowers.equals("Tulips")) {
            flowersPrice = 2.8;
        } else if (flowers.equals("Narcissus")) {
            flowersPrice = 3;
        } else if (flowers.equals("Gladiolus")) {
            flowersPrice = 2.5;
        }

        double totalPrice = flowerQuantity * flowersPrice;

        if (flowerQuantity > 80 && flowers.equals("Roses")) {
            totalPrice = totalPrice - (totalPrice * .1);
        } else if (flowerQuantity > 90 && flowers.equals("Dahlias")) {
            totalPrice = totalPrice - (totalPrice * .15);
        } else if (flowerQuantity > 80 && flowers.equals("Tulips")) {
             totalPrice = totalPrice - (totalPrice *.15);
        } else if (flowerQuantity < 120 && flowers.equals("Narcissus")) {
            totalPrice = totalPrice + (totalPrice *.15);
        } else if (flowerQuantity < 80 && flowers.equals("Gladiolus")) {
            totalPrice = totalPrice + (totalPrice *.2);
        }

        double ad = budget - totalPrice;

        if (ad >= 0) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowerQuantity,flowers,ad);
        }
        if (ad < 0) {
            System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(ad));
        }

    }
}