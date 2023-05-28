package Homework;

import java.util.Scanner;

public class VegetableOrFruit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String item = input.nextLine();

        switch(item) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
