import java.util.Scanner;

public class Discus_Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        int largest_num;
        for (int i = 0; i < testcases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a >= b && a >= c) {
                largest_num = a;
            } else if (b >= a && b >= c) {
                largest_num = b;
            } else {
                largest_num = c;
            }
            System.out.println(largest_num);
        }
    }
}
