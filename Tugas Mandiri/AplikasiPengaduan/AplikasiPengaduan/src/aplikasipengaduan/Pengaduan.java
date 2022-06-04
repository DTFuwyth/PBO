package aplikasipengaduan;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Pengaduan {
    private String namaPasien, alamat;
    String desc;

    public void formatPengaduan() {
        Scanner data = new Scanner(System.in);
        System.out.println("");
        System.out.println("Masukkan Nama Pasien: ");
        namaPasien = data.nextLine();
        System.out.println("Masukkan Pesan Pengaduan Terkait Masalah Yang Terjadi: ");
        desc = data.nextLine();
        System.out.println("Masukkan Alamat Pasien: ");
        alamat = data.nextLine();
        
        DateFormat waktu = new SimpleDateFormat("HH:mm:ss dd/MMMM/yyyy");
	Date tanggal = new Date();

        System.out.println("");
        System.out.println("============================================");
        System.out.println("===============Data Pengaduan===============");
        System.out.println("============================================");
        System.out.println("Nama Pasien : "+ namaPasien);
        System.out.println("Pengaduan   : "+ desc);
        System.out.println("Alamat      : "+ alamat);
        System.out.println("Waktu       : "+ waktu.format(tanggal));
        System.out.println("");
}
} 
