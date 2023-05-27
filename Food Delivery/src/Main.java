import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner numberOfChickenMeals = new Scanner(System.in);
        Scanner numberOfFishMeals = new Scanner(System.in);
        Scanner numberOfVegetarian = new Scanner(System.in);

        int chickenMeals = Integer.parseInt(numberOfChickenMeals.nextLine());
        int fishMeals = Integer.parseInt(numberOfFishMeals.nextLine());
        int vegeterianMeals = Integer.parseInt(numberOfVegetarian.nextLine());

        double chickenMealsPrice = chickenMeals * 10.35;
        double fishMealsPrice = fishMeals * 12.40;
        double vegetarianMealsPrice = vegeterianMeals * 8.15;

        double mealsTotalPrice = chickenMealsPrice + fishMealsPrice + vegetarianMealsPrice;
        double dessertPrice = mealsTotalPrice * .2;

        double bill = mealsTotalPrice + dessertPrice + 2.50;

        System.out.println(bill);

    }
}