// CodeChef problem for Finding the GCD and LCM of two numbers

import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextInt();
            long b = sc.nextInt();


            long gcdRes = GCD(a,b);
            long lcmRes = (a * b)/gcdRes;

            System.out.println(gcdRes+" "+lcmRes);
        }
    }
    static long GCD(long a, long b){
        if (a == b)
            return a;
        if(a>b)
            return GCD(a-b,b);
        else
            return GCD(a,b-a);
    }
}
