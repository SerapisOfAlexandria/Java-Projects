package Homework;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tournamentsNum= Integer.parseInt(input.nextLine());
        int totalPoints = Integer.parseInt(input.nextLine());
        int wins = 0;
        int finals = 0;
        int semifinals = 0;

        for (int i = tournamentsNum; i >= 1; i--) {
            String tournamentResult = input.nextLine();
            if (tournamentResult.equals("W")) {
                wins ++;
                totalPoints += 2000;
            } else if (tournamentResult.equals("F")) {
                totalPoints += 1200;
                finals ++;
            } else {
                totalPoints += 720;
                semifinals ++;
            }
        }
        double winrate = (wins * 1.0 / tournamentsNum * 1.0) * 100;
        System.out.printf("Final points: %d\n", totalPoints);
        System.out.printf("Average points: %d\n", ((wins * 2000) + (finals * 1200) + (semifinals * 720)) / tournamentsNum);
        System.out.printf("%.2f%%", winrate);

    }
}
