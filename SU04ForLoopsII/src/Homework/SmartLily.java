package Homework;

import java.util.Scanner;

public class SmartLily {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = Integer.parseInt(input.nextLine());
        double washingMachine = Double.parseDouble(input.nextLine());
        double toyPrice = Double.parseDouble(input.nextLine());
        double totalSum = 0;

        for(int i = 1; i <= age; i++) {
            if (i == 2) {
                totalSum += 9;
            } else if (i % 2 == 0) {
                totalSum += ((i / 2) * 10) - 1;
            } else {
                totalSum += toyPrice;
            }
        }
        if (totalSum >= washingMachine) {
            System.out.printf("Yes! %.2f",totalSum - washingMachine);
        } else {
            System.out.printf("No! %.2f", Math.abs(totalSum - washingMachine));
        }
    }
}
