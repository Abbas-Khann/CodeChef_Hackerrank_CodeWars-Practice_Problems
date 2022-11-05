import java.util.Scanner;

public class RecentContestProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases --> 0) {
            int n = sc.nextInt();
            int c1 = 0;
            int c2 = 0;
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                if (s.equals("START38")) {
                    c1++;
                }
                    if (s.equals("LTIME108")) {
                        c2++;
                    }
            }
            System.out.println(c1+" "+c2);
        }
    }
}
