package Homework;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avgScore = 0;
        double presentationAvgScore = 0;
        int participants = 0;


        int numOfJudges = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Finish")) {
            for (int i = 1; i <= numOfJudges; i++) {
                double score = Double.parseDouble(scanner.nextLine());
                presentationAvgScore += score;
            }
            avgScore += presentationAvgScore / numOfJudges;
            System.out.printf("%s - %.2f.\n", input, presentationAvgScore / numOfJudges);
            presentationAvgScore = 0;
            participants++;
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", avgScore / participants);

    }
}
