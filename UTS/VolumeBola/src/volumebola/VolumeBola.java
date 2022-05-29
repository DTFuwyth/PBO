package volumebola;
import java.util.Scanner;
public class VolumeBola {
    public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();
    double volumeBola = (4/3) * Math.PI * r * r * r;
    System.out.println("Volume Bola: "+volumeBola);

    }
    
}
