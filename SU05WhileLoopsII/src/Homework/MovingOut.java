package Homework;

import java.util.Scanner;

public class MovingOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int volume = Integer.parseInt(input.nextLine()) * Integer.parseInt(input.nextLine()) * Integer.parseInt(input.nextLine());

        while (true) {
            if (volume <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
                break;
            }
            String boxes = input.nextLine();
            if (boxes.equals("Done")) {
                System.out.printf("%d Cubic meters left.", volume);
                break;
            }
            volume -= Integer.parseInt(boxes);
        }
    }
}
