package problemset3_0;
import javax.swing.JOptionPane;
public class ProblemSet3_0 {

public static void main(String[] args) {
    String nama, umurString, alamat, asalKota, hobi, citaCita, status, pekerjaan, lamaKerja, gajiString;

    nama = JOptionPane.showInputDialog("Masukkan Nama: ");
    umurString = JOptionPane.showInputDialog("Masukkan Umurmu: ");
    int umur = Integer.parseInt(umurString);
    alamat = JOptionPane.showInputDialog("Masukkan Alamat Saat ini: ");
    asalKota = JOptionPane.showInputDialog("Masukkan Asal Kota Anda: ");
    hobi = JOptionPane.showInputDialog("Masukkan Hobi Anda: ");
    citaCita = JOptionPane.showInputDialog("Masukkan Cita-Cita Anda: ");
    status = JOptionPane.showInputDialog("Masukkan Status Anda Saat ini: ");
    pekerjaan = JOptionPane.showInputDialog("Saat ini Anda Bekerja di Bidang apa?: ");
    lamaKerja = JOptionPane.showInputDialog("Masukkan Berapa Lama Anda Telah Berkerja: ");
    int lama = Integer.parseInt(lamaKerja);
    gajiString = JOptionPane.showInputDialog("Masukkan Jumlah Gaji Anda: ");
    double gaji = Double.parseDouble(gajiString);

    umur = umur + 0;
    lama = lama + 0;
    System.out.println("=========================================================");
    System.out.println("==================DAFTAR RIWAYAT HIDUP===================");
    System.out.println("=========================================================");
    System.out.println("Nama          : " + nama );
    System.out.println("Umur          : " + umur );
    System.out.println("Alamat        : " + alamat );
    System.out.println("Asal Kota     : " + asalKota );
    System.out.println("Hobi          : " + hobi );
    System.out.println("Cita-cita     : " + citaCita );
    System.out.println("Status        : " + status );
    System.out.println("Pekerjaan     : " + pekerjaan );
    System.out.println("Lama Bekerja  : " + lama );
    System.out.println("Gaji          : " + gaji );
    }
    
}
