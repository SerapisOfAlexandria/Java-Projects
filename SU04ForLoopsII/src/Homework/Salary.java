package Homework;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tabs = Integer.parseInt(input.nextLine());
        double salary = Double.parseDouble(input.nextLine());

        for(int i = tabs; i >= 1; i--) {
            if(salary <= 0) {
                break;
            }
            String website = input.nextLine();
            if(website.equals("Facebook")) {
                salary -= 150;
            } else if (website.equals("Instagram")) {
                salary -= 100;
            } else if (website.equals("Reddit")) {
                salary -= 50;
            }
        }
        if(salary > 0) {
            System.out.println((int)salary);
        } else {
            System.out.println("You have lost your salary.");
        }
    }
}
