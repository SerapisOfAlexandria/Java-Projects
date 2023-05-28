package Homework;

import java.util.Scanner;

public class AreaOfFigures {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String object = input.nextLine();

        double x = Double.parseDouble(input.nextLine());

        if (object.equals("rectangle") || object.equals("triangle")) {
            double y = Double.parseDouble(input.nextLine());
            if (object.equals("rectangle")) {
                System.out.println(x * y);
            } else {
                System.out.println(0.5 * x * y);
            }
        } else if (object.equals("square")) {
            System.out.println(x * x);
        } else if (object.equals("circle")) {
            System.out.println(Math.PI * (x * x));
        }

    }
}
