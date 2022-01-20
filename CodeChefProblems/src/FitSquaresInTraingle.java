// Fit squares in triangle problem on CodeChef

import java.util.Scanner;

public class FitSquaresInTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            int b = sc.nextInt(); //  b for base of the triangle
            b -= 2;
            b /= 2;
            b = b *(b+1)/2;
            System.out.println(b);
        }
    }
}
