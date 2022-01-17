//Puppy and Sum problem on CodeChef

import java.util.Scanner;

public class PuppyAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int d = sc.nextInt();
            int n = sc.nextInt();
            int curr = n;

            for (int j = 0; j < d; j++) {
                curr = (curr * (curr + 1)) / 2;
            }
            System.out.println(curr);
        }
        }
}
