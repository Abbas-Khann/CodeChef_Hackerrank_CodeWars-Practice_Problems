import java.util.Arrays;
import java.util.Scanner;

public class PracticeMakesPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int p3 = sc.nextInt();
            int p4 = sc.nextInt();
            int[] arr;
            arr = new int[4];
            arr[0] = p1;
            arr[1] = p2;
            arr[2] = p3;
            arr[3] = p4;
            int ans = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= 10) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
}
