import java.util.Scanner;

public class LuckyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int count = 0;
            while (n>0){
                int rem = n % 10;
                n/=10;

            if (rem == 4) {
                count++;
            }
            }
            System.out.println(count);
        }
    }
}
