package Exam;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfComputers = Integer.parseInt(input.nextLine());

        double avgRating = 0;
        double totalSales = 0;

        for (int i = 1; i <= numberOfComputers; i++) {

            String computer = input.nextLine();

            char firstDigit = computer.charAt(0), secondDigit = computer.charAt(1), thirdDigit = computer.charAt(2);

            String firstDigitString = Character.toString(firstDigit);
            String secondDigitString = Character.toString(secondDigit);
            String firstAndSecond = firstDigitString + secondDigitString;
            double firstTwoDigitsDouble = Double.parseDouble(firstAndSecond);

            double rating = Double.parseDouble(Character.toString(thirdDigit));
            avgRating += rating;

            if (rating == 2) {
                totalSales += firstTwoDigitsDouble * 0;
            } else if (rating == 3) {
                totalSales += firstTwoDigitsDouble * .5;
            } else if (rating == 4) {
                totalSales += firstTwoDigitsDouble * .7;
            } else if (rating == 5) {
                totalSales += firstTwoDigitsDouble * .85;
            } else if (rating == 6) {
                totalSales += firstTwoDigitsDouble * 1;
            }


        }
        System.out.printf("%.2f\n", totalSales);
        System.out.printf("%.2f", avgRating / numberOfComputers);
    }
}
