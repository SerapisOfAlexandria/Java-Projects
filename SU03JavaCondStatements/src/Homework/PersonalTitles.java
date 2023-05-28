package Homework;


import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double age = Double.parseDouble(input.nextLine());
        String genderStr = input.nextLine();
        char gender = genderStr.charAt(0);

        if (gender == 'm' && age >= 16) {
            System.out.println("Mr.");
        } else if (gender == 'm' && age < 16) {
            System.out.println("Master");
        } else if (gender == 'f' && age >= 16) {
            System.out.println("Ms.");
        } else {
            System.out.println("Miss");
        }

    }
}
