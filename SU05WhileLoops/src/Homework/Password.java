package Homework;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nickname = input.nextLine();
        String password = input.nextLine();

        while (true) {

            String logInPass = input.nextLine();

            if (logInPass.equals(password)) {
                break;
            }
        }
        System.out.println("Welcome " + nickname + "!");
    }
}
