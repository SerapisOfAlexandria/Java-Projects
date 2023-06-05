package Homework;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double group1 = 0;
        double group2 = 0;
        double group3 = 0;
        double group4 = 0;
        double group5 = 0;

        int n = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(input.nextLine());
            if (number < 200) {
                group1 ++;
            } else if (number <= 399) {
                group2 ++;
            } else if (number <= 599) {
                group3 ++;
            } else if (number <= 799) {
                group4 ++;
            } else {
                group5 ++;
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
