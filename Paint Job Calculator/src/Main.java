import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dustsheetInSqM = new Scanner(System.in);
        Scanner paintInLiters = new Scanner(System.in);
        Scanner thinnerInLiters = new Scanner(System.in);
        Scanner workTimeInHours = new Scanner(System.in);

        int neededDustsheet = Integer.parseInt(dustsheetInSqM.nextLine());
        int neededPaint = Integer.parseInt(paintInLiters.nextLine());
        int neededThinner = Integer.parseInt(thinnerInLiters.nextLine());
        int neededHours = Integer.parseInt(workTimeInHours.nextLine());

        double dustsheetPrice = (neededDustsheet + 2) * 1.5;
        double paintPrice = (neededPaint + (neededPaint * .10)) * 14.5;
        double thinnerPrice = neededThinner * 5;

        double totalPriceInventory = dustsheetPrice + paintPrice + thinnerPrice + 0.40;

        double workersPrice = (totalPriceInventory * .30) * neededHours;

        double totalPrice = workersPrice + totalPriceInventory;


        System.out.println(totalPrice);



    }
}