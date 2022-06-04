package aplikasikepegawaian;
public class HitungGaji {

public long gaji(String gol){
    long gajiPokok = 0;
    
    switch(gol){
        case "A" :
            gajiPokok = 10000000;
        break;
          
        case "B" :
            gajiPokok = 8000000;
        break;
          
        case "C" :
            gajiPokok = 5000000;
        break;
          
        case "D" :
            gajiPokok = 3500000;
        break;
                  
        case "E" :
            gajiPokok = 2000000;
        break;
        default:
            gajiPokok = 0;  
    }
    return gajiPokok;
}
    
public long insentifKu(int jamKerja){
    long insentif = 0;
    if (jamKerja >= 200){
        jamKerja = jamKerja - 200;
        insentif = 10000 * jamKerja;
    }  
    return insentif;
}
}
//    String nama;
//    int gol, jamKerja, gajiPokok;
//
//public void gaji(){
//    System.out.println("=====================================================");
//    System.out.println("=======Selamat Datang di  Aplikasi Kepegawaian======="); 
//    System.out.println("=====================================================");
//
//    Scanner data = new Scanner(System.in);
//    System.out.println("");
//    System.out.print("Masukkan Nama Anda: ");
//    nama = data.nextLine();
//    System.out.print("Masukkan Golongan(A-E): ");
//    gol = data.next().charAt(0);
//         
//    switch( gol ){
//        case 'A' :
//            gajiPokok = 10000000;
//        break;
//          
//        case 'B' :
//            gajiPokok = 8000000;
//        break;
//          
//        case 'C' :
//            gajiPokok = 5000000;
//        break;
//          
//        case 'D' :
//            gajiPokok = 3500000;
//        break;
//                  
//        case 'E' :
//            gajiPokok = 2000000;
//        break;
//        default:
//            gajiPokok = 0;
//    }
//
//    System.out.print("Masukkan Jam Kerja: ");
//    jamKerja = data.nextInt();
// }  
//

//}    
//}  

   
