import java.util.Scanner;

public class VolumeControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int i = 0; i < testcases; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int greater_num = Math.max(x, y);
            int smaller_num = Math.min(x, y);
            System.out.println(greater_num - smaller_num);
        }
    }
}
