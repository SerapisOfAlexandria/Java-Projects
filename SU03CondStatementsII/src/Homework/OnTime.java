package Homework;

import java.util.Scanner;

public class OnTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int examHour = Integer.parseInt(input.nextLine());
        int examMinute = Integer.parseInt(input.nextLine());
        int arrivalHour = Integer.parseInt(input.nextLine());
        int arrivalMinute = Integer.parseInt(input.nextLine());

        int x = (examHour * 60) + examMinute;
        int y = (arrivalHour * 60) + arrivalMinute;

        if (x < y) {
            System.out.println("Late");
            if (y > x + 60) {
                int lateShowUp = y - x;
                int lateShowUpHours = lateShowUp / 60;
                int lateShowUpMinutes = lateShowUp % 60;
                System.out.printf("%d:%02d hours after the start", lateShowUpHours, lateShowUpMinutes);
            } else {
                int lateShowUp = y - x;
                System.out.printf("%d minutes after the start", lateShowUp);
            }
        } else if (x == y) {
            System.out.printf("On Time");
            System.out.println("");
        } else if (y >= x - 30) {
            System.out.println("On Time");
            int earlyShowUp = x - y;
            System.out.printf("%d minutes before the start", earlyShowUp);
        } else {
            System.out.println("Early");
            if (y > x - 60) {
                int earlyShowUp = x - y;
                System.out.printf("%d minutes before the start", earlyShowUp);
            } else {
                int earlyShowUp = x - y;
                int earlyShowUpHours = earlyShowUp / 60;
                int earlyShowUpMinutes = earlyShowUp % 60;
                System.out.printf("%d:%02d hours before the start", earlyShowUpHours, earlyShowUpMinutes);
            }

        }

        }
}
