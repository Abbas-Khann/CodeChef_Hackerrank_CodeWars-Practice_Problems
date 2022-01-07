import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int second_largest = 0;
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a > b && b > c){
                second_largest = b;
            }
            else if (a > c && c > b){
                second_largest = c;
            }
            else if (b > a && a > c){
                second_largest = a;
            }
            else if (b > c && c > a){
                second_largest = c;
            }
            else if (c > a && a > b){
                second_largest = a;
            }
            else if (c > b && b > a){
                second_largest = b;
            }
            System.out.println(second_largest);
        }

    }
}
