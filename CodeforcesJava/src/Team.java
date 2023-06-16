import java.util.Scanner;

//problem - https://codeforces.com/problemset/problem/231/A
public class Team {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int problems = Integer.parseInt(input.nextLine());
        int submitedSolutions = 0;

        for (int i = 1; i <= problems; i++) {
            String vote = input.nextLine();
            int petya = Integer.parseInt(vote.charAt(0) + "");
            int vasya = Integer.parseInt(vote.charAt(2) + "");
            int tonya = Integer.parseInt(vote.charAt(4) + "");
            if (petya + tonya + vasya >= 2) {
                submitedSolutions++;
            }
        }
        System.out.println(submitedSolutions);
    }
}
