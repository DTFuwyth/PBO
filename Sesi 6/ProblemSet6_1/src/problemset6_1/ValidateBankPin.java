package problemset6_1;
/**
 *
 * @author julii
 */
import java.util.Scanner;
public class ValidateBankPin {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Masukkin PIN Anda : ");
        int pin = data.nextInt();
        
        while (pin != 123456){
            System.out.println("PIN Yang Anda Masukkan Salah");
            System.out.print("Masukkin PIN Anda : ");
            pin = data.nextInt();
        }
        System.out.println("PIN Yang Anda Masukkan Benar");
    }    
}
