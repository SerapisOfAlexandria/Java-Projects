package Exam;

import java.util.Scanner;

public class PCstore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cpu = Double.parseDouble(input.nextLine()) * 1.57;
        double gpu = Double.parseDouble(input.nextLine()) * 1.57;
        double ram = Double.parseDouble(input.nextLine()) * 1.57;
        int numberOfRamSticks = Integer.parseInt(input.nextLine());
        double ramTotal = ram * numberOfRamSticks;
        double discount = Double.parseDouble(input.nextLine());

        double total = ((cpu + gpu) * (1 - discount)) + ramTotal;
        System.out.printf("Money needed - %.2f leva.", total);
    }
}
