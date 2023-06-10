package Homework;

import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dailySteps = 0;

        while (dailySteps < 10000) {
            String steps = input.nextLine();

            if (steps.equals("Going home")) {
                dailySteps += Integer.parseInt(input.nextLine());
                if (dailySteps >= 10000) {
                    System.out.printf("Goal reached! Good job!\n");
                    System.out.printf("%d steps over the goal!", dailySteps - 10000);
                    break;
                } else {
                    System.out.printf("%d more steps to reach goal.", 10000 - dailySteps);
                    break;
                }
            }
            dailySteps += Integer.parseInt(steps);
            if (dailySteps >= 10000) {
                System.out.printf("Goal reached! Good job!\n");
                System.out.printf("%d steps over the goal!", dailySteps - 10000);
                break;
            }

        }
    }
}
