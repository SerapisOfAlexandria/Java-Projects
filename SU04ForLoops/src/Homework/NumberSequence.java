package Homework;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int iterations = Integer.parseInt(input.nextLine());

        int maxNumber = 0;
        int minNumber = 0;

        for (int i = 1; i <= iterations; i++) {
            int number = Integer.parseInt(input.nextLine());
            if (i == 1) {
                maxNumber = number;
                minNumber = number;
            } else {
                if (number > maxNumber) {
                    maxNumber = number;
                } else {
                    if (number < minNumber) {
                        minNumber = number;
                    }
                }
            }
        }
        System.out.printf("Max number: %d \n", maxNumber);
        System.out.printf("Min number: %d", minNumber);
    }
}
