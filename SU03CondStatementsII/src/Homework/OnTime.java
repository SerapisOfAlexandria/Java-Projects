package Homework;

import java.util.Scanner;

public class OnTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int examHour = Integer.parseInt(input.next());
        int examMinute = Integer.parseInt(input.next());
        int arrivalHour = Integer.parseInt(input.next());
        int arrivalMinute = Integer.parseInt(input.next());

        int totalExamMinutes = 60 * examHour + examMinute;
        int totalArrivalMinutes = 60 * arrivalHour + arrivalMinute;

        int diffMinutes = Math.abs(totalExamMinutes - totalArrivalMinutes);

        if (totalExamMinutes < totalArrivalMinutes) {
            System.out.println("Late");
            if (diffMinutes < 60) {
                System.out.printf("%d minutes after the start", diffMinutes);
            } else {
                int hour = diffMinutes / 60;
                int minutes = diffMinutes % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }
        } else if (diffMinutes <= 30) {
            System.out.println("On Time");
            if (diffMinutes != 0) {
                System.out.printf("%d minutes before the start", diffMinutes);
            }
        } else {
            System.out.println("Early");
            if (diffMinutes < 60) {
                System.out.printf("%d minutes before the start", diffMinutes);
            } else {
                int hour = diffMinutes / 60;
                int minutes = diffMinutes % 60;
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            }
        }
    }
}
