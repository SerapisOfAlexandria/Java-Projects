import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int weigth = Integer.parseInt(input.nextLine());

        if (weigth % 2 == 0 && weigth != 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}