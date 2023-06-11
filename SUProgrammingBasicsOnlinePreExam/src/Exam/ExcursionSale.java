package Exam;

import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int seaEx = Integer.parseInt(input.nextLine());
        int mountainEx = Integer.parseInt(input.nextLine());
        int totalSum = 0;

        while (true) {
            String desiredEx = input.nextLine();
            if (desiredEx.equals("Stop")) {
                System.out.printf("Profit: %d leva.", totalSum);
                break;
            } else if (desiredEx.equals("mountain") && mountainEx != 0) {
                totalSum += 499;
                mountainEx--;
            } else if (desiredEx.equals("sea") && seaEx != 0) {
                totalSum += 680;
                seaEx--;
            }

            if (seaEx == 0 && mountainEx == 0) {
                System.out.printf("Good job! Everything is sold.\n");
                System.out.printf("Profit: %d leva.", totalSum);
                break;
            }
        }
    }
}
