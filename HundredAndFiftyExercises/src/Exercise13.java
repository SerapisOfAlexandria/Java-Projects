import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double width = Double.parseDouble(input.nextLine());
        double height = Double.parseDouble(input.nextLine());

        System.out.printf("Area is %.1f * %.1f = %.2f\n", width, height, width * height);
        System.out.printf("Perimeter is 2 * (%.1f * %.1f) = %.2f", width, height, 2 * (width + height));
    }
}
