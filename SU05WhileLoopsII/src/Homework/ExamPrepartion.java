package Homework;

import java.util.Scanner;

public class ExamPrepartion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int allowedBadGrades = Integer.parseInt(input.nextLine());
        int solvedProblems = 0;
        double avgGrades = 0.00;
        String lastProblem = "";
        int badGrades = 0;

        while (badGrades < allowedBadGrades) {
            String taskName = input.nextLine();
            if (taskName.equals("Enough")) {
                System.out.printf("Average score: %.2f\n", avgGrades / solvedProblems);
                System.out.printf("Number of problems: %d\n", solvedProblems);
                System.out.printf("Last problem: %s", lastProblem);
                break;
            } else {
                lastProblem = taskName;
            }
            int grade = Integer.parseInt(input.nextLine());
            if (grade <= 4) {
                badGrades++;
                avgGrades += grade;
                solvedProblems++;
            } else {
                solvedProblems++;
                avgGrades += grade;
            }
        }

        if (badGrades == allowedBadGrades) {
            System.out.printf("You need a break, %d poor grades.", badGrades);
        }
    }
}
