package Homework;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = Integer.parseInt(input.nextLine());
        int sumNum = 0;

        while (true) {
            sumNum += Integer.parseInt(input.nextLine());
            if (sumNum >= num) {
                System.out.println(sumNum);
                break;
            }
        }
    }
}
