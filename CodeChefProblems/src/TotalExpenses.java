// Total Expenses problem on CodeChef

import java.util.Scanner;

public class TotalExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int quantity = sc.nextInt();
            int price = sc.nextInt();
            double total = quantity * price;
            if (quantity > 1000){
                total -= total * 0.1;
            }
            System.out.println(total);
        }

    }
}
