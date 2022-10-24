import java.util.Scanner;

public class WaterBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            int a = k / x;
            if (a >= n) {
                System.out.println(n);
            }
            else {
                System.out.println(a);
            }
        }
    }
}
