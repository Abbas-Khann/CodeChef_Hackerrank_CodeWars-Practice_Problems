import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int i = 0; i < testcases; i++) {
            int n = sc.nextInt();
            int d[] = new int[n];
            int amount_to_remove = 0;
            for (int j = 0; j < n; j++) {
                d[j] = sc.nextInt();
                if (d[j] >= 1000) {
                    amount_to_remove++;
                }
            }
            System.out.println(amount_to_remove);
        }
    }
}
