package problemset5_3;
/**
 *
 * @author julii
 */
import java.util.Scanner;
public class StopLightSwitch {

    public static void main(String[] args) {
        System.out.println("1. Red");
        System.out.println("2. Orange");
        System.out.println("3. Green");
        System.out.println("Enter a color Code: ");
        Scanner sc = new Scanner(System.in);
        int currentColor = sc.nextInt();
        
        switch (currentColor){
            case 1 :
                    System.out.println("Next Traffic Light is Green");
                    break;
            case 2 :
                    System.out.println("Next Traffic Light is Red");
                    break;
            case 3 :
                    System.out.println("Next Traffic Light is Orange");
                    break;
            default:
                    System.out.println("Invalid Colour!");
        }
    }
    
}
