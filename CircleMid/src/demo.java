import java.util.Scanner;

public class demo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        CircleMidPoint circle = new CircleMidPoint();
        
        System.out.println("\nMasukan koordinat titik pusat");
        System.out.print("X : ");
        int x = scan.nextInt();
        System.out.print("Y : ");
        int y = scan.nextInt();
        System.out.print("Masukan jari - jari lingkaran : ");
        int r = scan.nextInt();
        circle.paintCircle(x, y, r);
    }
}
