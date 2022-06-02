import java.util.Scanner;

public class Self_Defence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        int counter = 0;
        for(int i = 0; i < testcases; i++) {
            int n = sc.nextInt();
            for(int j = 0; j < n; j++) {
                int u = sc.nextInt();
                if (u >= 10 && u <= 60) {
                    counter++;
                }
            }
        System.out.println(counter);
        }
    }
}
