package Homework;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        int odd = 0;
        int even = 0;

        for (int i = 1; i <= n; i++) {
            int oddEvenNumber = Integer.parseInt(input.nextLine());
            if (i % 2 == 0) {
                even += oddEvenNumber;
            } else {
                odd += oddEvenNumber;
            }
        }
        if (odd == even) {
            System.out.println("Yes");
            System.out.printf("Sum = " + (odd));
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(odd - even));
        }

    }
}
