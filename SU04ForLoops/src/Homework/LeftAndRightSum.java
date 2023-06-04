package Homework;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine()) * 2;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= n; i++) {
            if(i <= n / 2) {
                leftSum += Integer.parseInt(input.nextLine());
            } else {
                rightSum += Integer.parseInt(input.nextLine());
            }
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSum-rightSum));
        }
    }
}
