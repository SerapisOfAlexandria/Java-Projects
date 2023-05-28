package Homework;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner gradeInput = new Scanner(System.in);

        int grade = Integer.parseInt(gradeInput.nextLine());

        if (grade == 5 || grade == 6) {
            System.out.println("Excellent!");
        }
    }
}
