package Homework;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int time = Integer.parseInt(input.nextLine());
        String day = input.next();

        if (time <= 18 && time >= 10) {
            if(day.equals("Sunday")) {
                System.out.println("closed");
            } else {
                System.out.println("open");
            }
        } else {
            System.out.println("closed");
        }
    }
}
