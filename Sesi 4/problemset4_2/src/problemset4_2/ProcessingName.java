package problemset4_2;
/**
 *
 * @author julii
 */
import java.util.Scanner;
public class ProcessingName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda: ");
        String namaDepan = sc.nextLine();
        String namaBelakang = sc.nextLine();
        System.out.println(namaDepan.length());
        System.out.println("Nama Anda Adalah: "+namaBelakang+", "+namaDepan.charAt(0)+".");
    }
    
}
