package Homework;

import java.util.Scanner;

public class SumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberRangeOne = Integer.parseInt(input.nextLine());
        int numberRangeTwo = Integer.parseInt(input.nextLine());
        int number = Integer.parseInt(input.nextLine());
        int combinations = 0;

            for (int i = numberRangeOne; i <= numberRangeTwo; i++) {
                for (int b = numberRangeOne; b <= numberRangeTwo; b++) {
                    combinations++;
                    if (i + b == number) {
                        System.out.printf("Combination N:%d (%d + %d = %d)", combinations, i, b, number);
                        return;
                    }
                }
        }
    }
}
