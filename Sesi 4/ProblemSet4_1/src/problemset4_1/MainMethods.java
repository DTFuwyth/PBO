/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemset4_1;
import java.util.Scanner;
public class MainMethods {

    public static void main(String[] args) {
        ComputeMethods cm = new ComputeMethods();
        Scanner Sc = new Scanner(System.in);
        
        System.out.print("Masukkan Suhu Fahrenheit: ");
        double fahrenheit = Sc.nextDouble();
        fahrenheit = fahrenheit * 1.0;
        double Celcius = cm.fToC(fahrenheit);
        System.out.println("Temperatur Dalam Celcius: "+Celcius);
        
        System.out.println("");
        System.out.print("Masukkan Sisi a: ");
        int a = Sc.nextInt();
        System.out.print("Masukkan Sisi b: ");
        int b = Sc.nextInt();
        int c = cm.hypotenuse(a, b);
        System.out.println("Hypotenuse: "+ c);
        
        System.out.println("");
        int num = cm.roll();
        System.out.println("Total Nilai Dadu: "+ num);
    }
    
}
