package aplikasipengaduan;
import java.util.Scanner;
public class AplikasiPengaduan {

public void menu(){  

    Daftar rg = new Daftar();
    rg.daftarBaru();

    Pengaduan pn = new Pengaduan();
    pn.formatPengaduan();
}

public void nilai(){
    String saran;

    Scanner nilai = new Scanner(System.in);
    System.out.println("");
    System.out.println("=======================================================================");
    System.out.println("             Terima Kasih Atas Pengaduan yang di Sampaikan             ");
    System.out.println("Bantu Kami Agar Menjadi Lebih Baik Dengan Memberikan Penilaian & Saran:");
    System.out.println("Ketikkan Saran Anda Untuk Kami: ");
    saran = nilai.nextLine();
    System.out.println("");
    System.out.println("Pilih Penilaian Anda Untuk Kami");
    System.out.println("1.Sangat Kecewa");
    System.out.println("2.Kurang");
    System.out.println("3.Standar");
    System.out.println("4.Sangat Baik");
    System.out.println("5.Luar Biasa");
    System.out.println("Penilaian: ");
    int bintang = nilai.nextInt();
        
    switch (bintang){
        case 1 : 
                System.out.println("");
                System.out.println("Penilaian : Sangat Kecewa");
                System.out.println("Saran     : "+saran);
        break;

        case 2 : 
                System.out.println("");
                System.out.println("Penilaian : Kurang");
                System.out.println("Saran     : "+saran);
        break;

        case 3 : 
                System.out.println("");
                System.out.println("Penilaian : Standar");
                System.out.println("Saran     : "+saran);
        break;

        case 4 : 
                System.out.println("");
                System.out.println("Penilaian : Sangat Baik");
                System.out.println("Saran     : "+saran);
        break;

        case 5 : 
                System.out.println("");
                System.out.println("Penilaian : Luar Biasa");
                System.out.println("Saran     : "+saran);
        break;
    }
}

public static void main(String[] args) {
    Scanner Ulang = new Scanner(System.in);
    boolean lagi = true;
    AplikasiPengaduan menu = new AplikasiPengaduan();
    AplikasiPengaduan nilai = new AplikasiPengaduan();
        
    String answer;
    
    while(lagi!=false){
        System.out.println("");
        menu.menu();
        System.out.print("Ingin mengajukan Pengaduan Ulang (y/n) ?");
        answer = Ulang.nextLine();
            if (answer.equalsIgnoreCase("y")){
                lagi = true;
                System.out.println("y");
                }
            else {
                nilai.nilai();
                lagi = false;
                }
    }   
}   
}