// Ciel and Receipt
// Find the minimum number
import java.util.Scanner;

public class Ciel_Reciept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++){
            int p = sc.nextInt();
            int menu_items = 0;
            for (int i = 11; i >= 0; i--) {
                int curr_pow = (int) Math.pow(2, i);
                while (p >= curr_pow) {
                    p -= curr_pow;
                    menu_items++;
                }
            }
            System.out.println(menu_items);
        }


    }
}
