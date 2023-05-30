package Homework;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int celsiusDegrees = Integer.parseInt(input.nextLine());
        String period = input.nextLine();
        String outfit = "";
        String shoes = "";

        if (period.equals("Morning")) {
            if (celsiusDegrees >= 10 && celsiusDegrees <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (celsiusDegrees > 18 && celsiusDegrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if (period.equals("Afternoon")) {
            if (celsiusDegrees >= 10 && celsiusDegrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (celsiusDegrees > 18 && celsiusDegrees <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        } else if (period.equals("Evening")) {
            if (celsiusDegrees >= 10 && celsiusDegrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (celsiusDegrees > 18 && celsiusDegrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.",celsiusDegrees, outfit, shoes);
    }
}

