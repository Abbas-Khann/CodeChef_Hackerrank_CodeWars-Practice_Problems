

import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int factor = 1;
            for (int j = 1; j < n; j++) {
                if (n % j == 0){
                    factor++;
                }
            }
            if (factor == 2){
                System.out.println("yes");
            }
                else{
                System.out.println("no");
            }
        }
    }
}
