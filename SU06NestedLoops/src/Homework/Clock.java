package Homework;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 23; i++) {
            for (int b = 0; b <= 59; b++) {
                System.out.printf("%d:%d\n", i, b);
            }
        }
    }
}
