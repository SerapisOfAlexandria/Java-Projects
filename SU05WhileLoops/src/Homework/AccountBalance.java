package Homework;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0.0;

        while (true) {
            String amount = input.nextLine();
            if (amount.equals("NoMoreMoney")) {
                break;
            } else {
                if (Double.parseDouble(amount) <= 0) {
                    System.out.println("Invalid operation!");
                    break;
                } else {
                    System.out.printf("Increase: %.2f\n", Double.parseDouble(amount));
                    sum += Double.parseDouble(amount);
                }
            }
        }
        System.out.printf("Total: %.2f", sum);
    }
}
