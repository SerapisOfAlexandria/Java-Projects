package Homework;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfGroups = Integer.parseInt(input.nextLine());
        double group1 = 0;
        double group2 = 0;
        double group3 = 0;
        double group4 = 0;
        double group5 = 0;

        for (int i = 1; i <= numberOfGroups; i++) {
            int number = Integer.parseInt(input.nextLine());
            if (number <= 5) {
                group1 += number;
            } else if (number <= 12) {
                group2 += number;
            } else if (number <= 25) {
                group3 += number;
            } else if (number <= 40) {
                group4 += number;
            } else {
                group5 += number;
            }
        }
        double sum = 100 / (group1 + group2 + group3 + group4 + group5) ;
        System.out.printf("%.2f%%\n", (double) group1 * sum);
        System.out.printf("%.2f%%\n", (double) group2 * sum);
        System.out.printf("%.2f%%\n", (double) group3 * sum);
        System.out.printf("%.2f%%\n", (double) group4 * sum);
        System.out.printf("%.2f%%", (double) group5 * sum);

    }
}
