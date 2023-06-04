package Homework;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfNumbers = Integer.parseInt(input.nextLine());
        int totalSum = 0;

        for (int i = numberOfNumbers; i >= 1; i--) {
            totalSum += Integer.parseInt(input.nextLine());
        }
        System.out.println(totalSum);
    }
}
