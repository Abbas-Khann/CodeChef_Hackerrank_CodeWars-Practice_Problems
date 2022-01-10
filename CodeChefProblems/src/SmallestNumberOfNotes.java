// Find the smallest number of notes

import java.util.Scanner;

public class SmallestNumberOfNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
        int denom [] = {100,50,10,5,2,1};
        int ans = 0;
        int n = sc.nextInt();
            for (int j = 0; j <= 5; j++) {
                ans += n/denom[j];
                n = n%denom[j];
            }
            System.out.println(ans);
        }
    }

}
