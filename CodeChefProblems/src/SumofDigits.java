import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int sum =0;
        for (int i = 0; i < t; i++) {
            int rem = 0;
            while (n > 0) {
                rem = n % 10;
                sum += rem;
                n/= 10;
            }
            System.out.println(sum);
        }
    }
}
