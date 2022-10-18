import java.util.Scanner;

public class BatteryLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int i = 0; i < testcases; i++) {
            int x = sc.nextInt();
            if (x <= 15) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
