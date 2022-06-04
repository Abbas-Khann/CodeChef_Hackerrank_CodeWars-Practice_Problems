import java.util.Scanner;

public class Consistent_score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i = 0; i < testcases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (c >= a && d >= b) {
                System.out.println("Possible");
            }
            else {
                System.out.println("Impossible");
            }
        }
    }
}
