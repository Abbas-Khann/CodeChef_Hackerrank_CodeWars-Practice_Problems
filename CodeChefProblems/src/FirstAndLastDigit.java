import java.util.Scanner;

public class FirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int sum = 0;
            int n = sc.nextInt();
            int ld = n % 10;
            while (n > 0) {
                sum = n % 10;
                n /= 10;
            }
            System.out.println(ld + sum);
        }
    }
}