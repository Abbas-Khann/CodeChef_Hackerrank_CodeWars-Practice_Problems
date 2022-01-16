// Solution to the lead game problem on Codechef

import java.util.Scanner;

public class TheLeadGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int winner = 0;
        int lead = 0;
        int s1 = 0;
        int s2 = 0;
        int diff = 0;
        for (int i = 0; i < t; i++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            s1 += p1;
            s2 += p2;
            if (s1 > s2){
                diff = s1 - s2;
                if (diff > lead){
                    lead = diff;
                    winner = 1;
                }
            }
            else
                diff = s2 - s1;
                if (diff > lead) {
                    lead = diff;
                    winner = 2;
                }
        }
        System.out.print(winner+" "+lead);
    }
}
