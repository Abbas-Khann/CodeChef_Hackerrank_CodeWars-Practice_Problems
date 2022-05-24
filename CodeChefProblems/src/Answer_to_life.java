import java.util.Scanner;

public class Answer_to_life {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            if(n != 42) {
                System.out.println(n);
                continue;
            }
            else {
                break;
            }
        }
    }
}
/*
1
2
88
42
99
 */