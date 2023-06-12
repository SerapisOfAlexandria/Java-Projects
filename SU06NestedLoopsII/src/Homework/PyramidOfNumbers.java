package Homework;

import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        int number = 1;
        outer:
        for (int i = 1; i <= n; i++){
            for (int b = i; b >= 1; b--) {
                System.out.printf("%d ", number);
                if (number == n) {
                    break outer;
                }
                number++;
            }
            System.out.printf("\n");
        }
    }
}
