package problemset5_2;
/**
 *
 * @author julii
 */
import java.util.Scanner;
public class StopLight {

    public static void main(String[] args) {
        System.out.println("1. Red");
        System.out.println("2. Orange");
        System.out.println("3. Green");
        System.out.println("Enter a color Code: ");
        Scanner sc = new Scanner(System.in);
        int currentColor = sc.nextInt();
        
        if (currentColor == 1) {
            System.out.println("Next Traffic Light is Green");
        } else if (currentColor == 2) {
            System.out.println("Next Traffic Light is Red");
        } else if (currentColor == 3) {
            System.out.println("Next Traffic Light is Orange");
        } else {
            System.out.println("Invalid Colour!");
        }
    }
}
