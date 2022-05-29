package math;

import java.util.Scanner;
public class Math {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jari-jari bola : ");
    int r = sc.nextInt();
    double pi = (double)22/7;  
    double volumeBola = (4/3) * pi * r * r * r;
    
    System.out.println("Volume Bola: "+volumeBola);

    }
    
}
