// Gross Salary Problem on CodeChef

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            double da = 0;
            double hra = 0;
            double basic = sc.nextInt();
            double gross = 0;
            if (basic < 1500){
                hra = (0.1 * basic); // 10% rawestalo chal
                da = (0.9 * basic);  // 90% of the basic
            }
            else {
                hra = 500;
                da = (0.98 * basic);
            }
            gross = basic + hra + da;
            System.out.println(gross);
        }
    }
}
