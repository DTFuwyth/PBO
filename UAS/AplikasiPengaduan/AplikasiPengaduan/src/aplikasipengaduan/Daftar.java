package aplikasipengaduan;
import java.lang.String;
import java.util.Scanner;
import java.util.Random;
public class Daftar {
    private String nama, nik;

public void daftarBaru(){
        System.out.println("============================================================");
        System.out.println("===Selamat Datang di Form Registrasi Aplikasi PengaduanKu===");
        System.out.println("============================================================");
        //Aplikasi ini di peruntukan Bagi Warga Negara Indonesia, untuk melakukan pengaduan terhadap tindakan-tindakan meresahkan/menganggu keamanan & kenyamanan warga.
        //Pada saat menjalankan Aplikasi ini, pengguna akan langsung di arahkan ke menu Registrasi untuk memastikan Pengguna adalah Warga Negara Indonesia.

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        nama = sc.nextLine();

        nik = "0";
        while(nik.length() != 8){
        System.out.print("Masukkan NIK Anda  : ");
        nik = sc.nextLine(); //NIK harus terdiri dari 16 Digit Angka, agar dapat melanjutkan ke Proses Selanjutnya
            if(nik.length() == 16){
            break;
            }
        System.out.println("NIK yang Anda Masukkan Tidak Terdaftar");
        }

    System.out.println("");
    System.out.println("====================================");
    System.out.println("      Registrasi Anda Berhasil      ");
    System.out.println("   Silahkan Ajukan Pengaduan Anda   ");
    System.out.println("====================================");
    
}
}