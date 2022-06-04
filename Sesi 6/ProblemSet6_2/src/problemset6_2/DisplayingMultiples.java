package problemset6_2;
/**
 *
 * @author julii
 */
import java.util.Scanner;
public class DisplayingMultiples {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int angka = Sc.nextInt();

        for (int a = 1 ; a < 13 ; a++){
           int nilai = angka * a;
           System.out.println(nilai);
        }
    }
}