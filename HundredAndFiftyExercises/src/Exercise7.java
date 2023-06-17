import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", x, i, x * i);
        }
    }
}
