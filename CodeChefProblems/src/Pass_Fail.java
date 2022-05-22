import java.util.Scanner;

public class Pass_Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int i = 0; i < testcases; i++) {
                int total_questions = sc.nextInt();
                int correct_questions = sc.nextInt();
                int passing_marks = sc.nextInt();
                int chef_marks = 0;
                int incorrect_questions = total_questions - correct_questions;
            for (int j = 0; j < correct_questions; j++) {
                chef_marks += 3;
            }
            for (int j = 0; j < incorrect_questions; j++) {
                chef_marks--;
            }
            if (chef_marks >= passing_marks) {
                System.out.println("Pass");
            }
            else {
                System.out.println("Fail");
            }
         }
    }
}
