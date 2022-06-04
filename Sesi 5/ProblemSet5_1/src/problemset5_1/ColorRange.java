package problemset5_1;
/**
 *
 * @author julii
 */
import java.util.Scanner;
public class ColorRange {

    public static void main(String[] args) {
        Scanner pil = new Scanner(System.in);
        System.out.println("Enter Number of Wavelength: ");
        int num = pil.nextInt();
        
        if (num >= 380 && num < 450) {
            System.out.println("The Color Is Violet");
        } else if (num >= 450 && num < 495) {
            System.out.println("The Color Is Blue");
        } else if (num >= 495 && num < 570) {
            System.out.println("The Color Is Green");
        } else if (num >= 570 && num < 590) {
            System.out.println("The Color Is Yellow");
        } else if (num >= 590 && num < 620) {
            System.out.println("The Color Is Orange");
        } else if (num >= 620 && num < 750) {
            System.out.println("The Color Is Red");
        } else {
            System.out.println("The entered wavelength is not part of visible spectrum");
        }
    }   
}
