import java.util.Scanner;
public class RadiansToDegreesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number of radians: ");

        double radians = Double.parseDouble(input.nextLine());

        double degrees = radians * (180 / Math.PI);

        System.out.println("Degrees are equal to : " + degrees);
    }
}