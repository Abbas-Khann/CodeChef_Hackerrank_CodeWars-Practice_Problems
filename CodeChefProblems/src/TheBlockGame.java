import java.util.Scanner;

public class TheBlockGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int num = n;
            int rev = 0;
            while(n > 0){
                rev = rev * 10 + n % 10;
                n/=10;
            }
            if (num == rev){
                System.out.println("wins");
            }
            else {
                System.out.println("loses");
            }
        }

    }
}
