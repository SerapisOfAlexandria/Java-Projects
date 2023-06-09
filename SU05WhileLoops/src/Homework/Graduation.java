package Homework;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double grades = 0.00;
        double gradesSum = 0.00;
        String name = input.nextLine();
        int failedGrades = 0;
        int i = 0;

        while (i != 12) {
            i++;
            if (failedGrades == 2) {
                System.out.printf("%s has been excluded at %d grade", name, i);
                break;
            } else {
                grades = Double.parseDouble(input.nextLine());
                if (grades < 4) {
                    failedGrades++;
                    i--;
                } else {
                    gradesSum += grades;
                }
            }
        }
        if (failedGrades < 2) {
            System.out.printf("%s graduated. Average grade: %.2f", name, gradesSum / 12.00);
        }
    }
}
