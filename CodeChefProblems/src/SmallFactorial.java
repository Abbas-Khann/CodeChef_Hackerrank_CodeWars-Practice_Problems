//import java.util.Scanner;
//
//public class SmallFactorial {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        int fact = 1;
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            while (n>0){
//                fact = fact *n ;
//                n--;
//            }
//        }
//        System.out.println(fact);
//
//    }
//}


import java.util.Scanner;

public class SmallFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

    }
}