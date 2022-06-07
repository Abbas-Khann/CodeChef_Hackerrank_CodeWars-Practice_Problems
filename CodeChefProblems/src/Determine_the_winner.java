import java.util.Scanner;

public class Determine_the_winner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i = 0; i < testcases; i++) {
            int Pa = sc.nextInt();
            int Pb = sc.nextInt();
            int Qa = sc.nextInt();
            int Qb = sc.nextInt();
            int p, q;
           if (Pa > Pb) {
               p = Pa;
           }
           else {
               p = Pb;
           }
           if (Qa > Qb) {
               q = Qa;
           }
           else {
               q = Qb;
           }
           if(p > q) {
               System.out.println("Q");
           }
           else if (p < q) {
               System.out.println("P");
           }
           else {
               System.out.println("Tie");
           }
        }
    }
}
