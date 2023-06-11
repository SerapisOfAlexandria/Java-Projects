package Exam;

import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(input.nextLine());
        String season = input.nextLine();
        double price = 0.00;

        switch (season) {
            case "summer":
                if (numberOfPeople <= 5) {
                    price = 48.50 * .85;
                } else {
                    price = 45.00 * .85;
                }
                break;
            case "spring":
                if (numberOfPeople <= 5) {
                    price = 50.00;
                } else {
                    price = 48.00;
                }
                break;
            case "autumn":
                if (numberOfPeople <= 5) {
                    price = 60.00;
                } else {
                    price = 49.50;
                }
                break;
            case "winter":
                if (numberOfPeople <= 5) {
                    price = 86.00 * 1.08;
                } else {
                    price = 85.00 * 1.08;
                }
                break;
        }
        System.out.printf("%.2f leva.", price * numberOfPeople);
    }
}
