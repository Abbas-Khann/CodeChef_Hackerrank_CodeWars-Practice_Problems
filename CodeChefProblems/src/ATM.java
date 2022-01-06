import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        float y = sc.nextFloat();
        if (x % 5 == 0 && x < y){
            y = (y - x - 0.5f);
            System.out.print(y);
        }
        else if (x % 5 !=0){
            System.out.print(y);
        }
        else if(x>y){
            System.out.println(y);
        }
    }
}
