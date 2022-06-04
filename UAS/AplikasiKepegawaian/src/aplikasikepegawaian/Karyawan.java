package aplikasikepegawaian;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Karyawan {    

public static void main(String[] args) {
    HitungGaji rg = new HitungGaji();
    Scanner data = new Scanner(System.in);
    System.out.println("=====================================================");
    System.out.println("=======Selamat Datang di  Aplikasi Kepegawaian======="); 
    System.out.println("=====================================================");

    System.out.println("");
    System.out.print("Masukkan Nama Anda: ");
    String nama = data.nextLine();
    System.out.println("Silihkan Pilih Golongan Anda");
    System.out.println("1. A");
    System.out.println("2. B");
    System.out.println("3. C");
    System.out.println("4. D");
    System.out.println("5. E");
    System.out.print("Masukkan Golongan(A-E): ");
    String gol = data.nextLine();
    System.out.print("Masukkan Jam Kerja: ");
    int jamKerja = data.nextInt();
    
    long GajiPokok = rg.gaji(gol);
    long insentif = rg.insentifKu(jamKerja);
    long jumlahGaji = GajiPokok + insentif;
    
    DateFormat waktu = new SimpleDateFormat("HH:mm:ss dd/MMMM/yyyy");
    Date tanggal = new Date();
    
    System.out.println("");
        System.out.println("============================================");
        System.out.println("==============Data Kepagawaian==============");
        System.out.println("============================================");
        System.out.println("Nama Anda    : "+ nama);
        System.out.println("Gaji Pokok   : "+ GajiPokok);
        System.out.println("Insentif     : "+ insentif);
        System.out.println("Jumlah Gaji  : "+ jumlahGaji);
        System.out.println("Waktu        : "+ waktu.format(tanggal));
        System.out.println("");
}
}



//public void menu(){  
//
//    HitungGaji rg = new HitungGaji();
//    rg.gaji();
//
//}   
// 
//public void hasil(){
//System.out.println("");
//    System.out.println("============================================");
//    System.out.println("===============Data Pengaduan===============");
//    System.out.println("============================================");
//    System.out.println("Nama Anda : "+ nama);
//    //System.out.println("Golongan  : "+ gol);
//    //System.out.println("Jam Kerja      : "+ jam);
//    System.out.println("");
// 
//}
//
//  