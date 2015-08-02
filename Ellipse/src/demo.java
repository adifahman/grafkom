import java.util.Scanner;

public class demo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        EllipseMidPoint ellipse = new EllipseMidPoint();
        
        System.out.println("\nMasukan koordinat titik pusat");
        System.out.print("X : ");
        int x = scan.nextInt();
        System.out.print("Y : ");
        int y = scan.nextInt();
        
        System.out.println("Masukan jari - jari elips : ");
        System.out.print("RX : ");
        int rx = scan.nextInt();
        System.out.print("RY : ");
        int ry = scan.nextInt();
        ellipse.paintEllipse(x, y, rx, ry);
    }
}