package inputanlagi;
import java.lang.Math;
import java.util.Scanner;
public class ClassMath {
public static void classMath(){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    double volumeBola = (4/3) * Math.PI * r * r * r;
    System.out.println("Volume Bola: "+volumeBola);
}
}
