import java.util.Scanner;

public class ExchangeRateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter sum in BGN: ");

        double bgn = Double.parseDouble(input.nextLine());

        double usd = bgn * 1.83;

        System.out.printf("Your converted sum in USD is: %f", usd);
    }
}