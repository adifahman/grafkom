
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class EllipseMidPoint extends JPanel{
    private int Rx, Ry, X1, Y1;

    public EllipseMidPoint() {
    }

    public EllipseMidPoint(int X1, int Y1, int Rx, int Ry) {
        setRx(Rx);
        setRy(Ry);
        setX1(X1);
        setY1(Y1);
    }
    
    public void paintEllipse (int X1, int Y1, int Rx, int Ry){
        JFrame frame = new JFrame("Ellipse");
        frame.add(new EllipseMidPoint(X1, Y1, Rx, Ry));
        frame.setSize(250, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int xCentre = 0, yCentre = 0, p, px, py, x = 0, y = 0, Ry2, Rx2, twoRx2, twoRy2;
        
        g2d.drawLine(xCentre + x, yCentre + y, xCentre + x, yCentre + y);
        g2d.drawLine(xCentre - x, yCentre + y, xCentre - x, yCentre + y);
        g2d.drawLine(xCentre + x, yCentre - y, xCentre + x, yCentre - y);
        g2d.drawLine(xCentre - x, yCentre - y, xCentre - x, yCentre - y);
        
        Ry2 = Ry * Ry;
	Rx2 = Rx * Rx;
	twoRy2 = 2 * Ry2;
	twoRx2 = 2 * Rx2;
        
        x = 0;
	y = Ry;
	p = (int) Math.round(Ry2 - Rx2 * Ry + (0.25 * Rx2));
	px = 0;
	py = twoRx2 * y;
        
        //radius 1
        while(px < py){
            x = x + 1;
            px = px + twoRy2;
            if (p >= 0){
                y = y - 1;
                py = py - twoRx2;
            }
            g2d.drawLine(x + X1, y + Y1, x + X1, y + Y1);
            g2d.drawLine(x * (-1) +X1, y + Y1, x * (-1) + X1, y + Y1);
            g2d.drawLine(x * (-1) +X1, y * (-1) + Y1, x * (-1) + X1, y * (-1) + Y1);
            g2d.drawLine(x + X1, y * (-1) + Y1, x + X1, y * (-1) + Y1);
            
            if (p < 0){
                p = p + Ry2 + px;
            }else p = p + Ry2 + px - py;
        }
        //radius 2
        p = (int) Math.round(Ry2 * (x + 0.5) * (x + 0.5) + Rx2 * (y - 1) * (y - 1) - Rx2  * Ry2);
        
        while (y > 0){
            y = y - 1;
            py = py - twoRx2;
            
            if (p <= 0){
                x = x + 1;
                px = px + twoRy2;
            }
            g2d.drawLine(x + X1, y + Y1, x + X1, y + Y1);
            g2d.drawLine(x * (-1) +X1, y + Y1, x * (-1) + X1, y + Y1);
            g2d.drawLine(x * (-1) +X1, y * (-1) + Y1, x * (-1) + X1, y * (-1) + Y1);
            g2d.drawLine(x + X1, y * (-1) + Y1, x + X1, y * (-1) + Y1);
            
            if (p > 0){
                p = p + Rx2 - py;
            }else p = p + Rx2 - py + px;

        }

    }

    public int getRx() {
        return Rx;
    }

    public void setRx(int Rx) {
        this.Rx = Rx;
    }

    public int getRy() {
        return Ry;
    }

    public void setRy(int Ry) {
        this.Ry = Ry;
    }

    public int getX1() {
        return X1;
    }

    public void setX1(int X1) {
        this.X1 = X1;
    }

    public int getY1() {
        return Y1;
    }

    public void setY1(int Y1) {
        this.Y1 = Y1;
    }
}