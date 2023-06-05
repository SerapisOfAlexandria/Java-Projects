package Homework;

import javax.swing.*;
import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        int maxValue = 0;
        int sum = 0;

        for (int i = n; i >= 1; i--) {
            int number = Integer.parseInt(input.nextLine());
            if (i == n) {
                maxValue = number;
            } else if (number > maxValue) {
                sum += maxValue;
                maxValue = number;
            } else {
                sum += number;
            }
        }

        if (maxValue == sum) {
            System.out.println("Yes");
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs((maxValue - sum)));
        }
    }
}
