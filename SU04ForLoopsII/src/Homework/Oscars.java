package Homework;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String actorName = input.nextLine();
        double totalPoints = Double.parseDouble(input.nextLine());
        int judges = Integer.parseInt(input.nextLine());

        for(int i = judges; i >= 1; i--) {
            String judgeName = input.nextLine();
            double judgePoints = Double.parseDouble(input.nextLine());
            totalPoints += (judgeName.length() * judgePoints) / 2;
            if (totalPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
                break;
            }
        }

        if (totalPoints < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalPoints);
        }
    }
}
