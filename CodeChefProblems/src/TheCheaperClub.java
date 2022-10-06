import java.util.Scanner;

public class The_Cheaper_Cab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int i = 0; i < testcases; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x > y) {
                System.out.println("SECOND");
            } else if (y > x) {
                System.out.println("FIRST");
            } else {
                System.out.println("ANY");
            }
        }
    }
}
