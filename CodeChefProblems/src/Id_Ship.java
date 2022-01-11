import java.util.Scanner;

public class Id_Ship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            char ID = sc.next().charAt(0);
            if (ID == 'B' || ID == 'b'){
                System.out.println("BattleShip");
            }
            else if (ID == 'C' || ID == 'c'){
                System.out.println("Cruiser");
            }
            else if (ID == 'D' || ID == 'd'){
                System.out.println("Destroyer");
            }
            else if (ID == 'F' || ID == "f"){
                System.out.println("Frigate");
            }
        }
    }
}
