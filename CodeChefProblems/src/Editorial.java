import java.util.Scanner;

public class Specialty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i = 0; i < testcases; i++) {
            int setter = sc.nextInt();
            int tester = sc.nextInt();
            int editorialist = sc.nextInt();
            if (setter > editorialist && setter > tester) {
                System.out.println("Setter");
            }
            else if (editorialist > setter && editorialist > tester) {
                System.out.println("Editorialist");
            }
            else if (tester > setter && tester > editorialist){
                System.out.println("Tester");
            }
        }
    }
}
