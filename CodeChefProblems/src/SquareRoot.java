import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double sq = 0;
        for (int i = 0; i < t; i++) {
            double n = sc.nextDouble();
            sq = Math.sqrt(n);
            System.out.println(sq);
        }
    }
}
