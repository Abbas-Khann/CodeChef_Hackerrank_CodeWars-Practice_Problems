import java.util.Scanner;

public class MinimumPizzas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int i = 0; i < testcases; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int achieved_amount = n * x;
            if (achieved_amount % 4 == 0) {
                System.out.println(achieved_amount / 4);
            }
            else {
                System.out.println(achieved_amount/ 4 + 1);
            }
        }
    }
}
