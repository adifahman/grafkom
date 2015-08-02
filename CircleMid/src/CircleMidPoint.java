import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class CircleMidPoint extends JPanel{
    
    private int xCenter;
    private int yCenter;
    private int radius;

    public CircleMidPoint() {
    }    

    public CircleMidPoint(int xCenter, int yCenter, int radius) {
        setXCenter(xCenter);
        setYCenter(yCenter);
        setRadius(radius);
    }
  
    public void paintCircle (int xCenter, int yCenter, int rad){
        JFrame frame = new JFrame("Circle Mid Point");
        frame.add(new CircleMidPoint(xCenter, yCenter, rad));
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);        
    }
    
    @Override
	public void paintComponent(Graphics g){
            int p, x, y;
            p = x = y = 0;

            y = radius;

            g.drawLine(xCenter +x, yCenter +y, xCenter +x, yCenter +y);
            g.drawLine(xCenter -x, yCenter +y, xCenter -x, yCenter +y);
            g.drawLine(xCenter +x, yCenter -y, xCenter +x, yCenter -y);
            g.drawLine(xCenter -x, yCenter -y, xCenter -x, yCenter -y);
            g.drawLine(xCenter +y, yCenter +x, xCenter +y, yCenter +x);
            g.drawLine(xCenter -y, yCenter +x, xCenter -y, yCenter +x);
            g.drawLine(xCenter +y, yCenter -x, xCenter +y, yCenter -x);
            g.drawLine(xCenter -y, yCenter -x, xCenter -y, yCenter -x);

            p = 1 - radius;
            while (x < y){
                if (p < 0){
                    x = x + 1;
                }else{
                    x = x + 1;
                    y = y - 1;
                }

                if (p < 0){
                    p = p + 2 * x + 1;
                }else{
                    p = p + 2 * (x - y) + 1;
                }

                g.drawLine(xCenter +x, yCenter +y, xCenter +x, yCenter +y);
                g.drawLine(xCenter -x, yCenter +y, xCenter -x, yCenter +y);
                g.drawLine(xCenter +x, yCenter -y, xCenter +x, yCenter -y);
                g.drawLine(xCenter -x, yCenter -y, xCenter -x, yCenter -y);
                g.drawLine(xCenter +y, yCenter +x, xCenter +y, yCenter +x);
                g.drawLine(xCenter -y, yCenter +x, xCenter -y, yCenter +x);
                g.drawLine(xCenter +y, yCenter -x, xCenter +y, yCenter -x);
                g.drawLine(xCenter -y, yCenter -x, xCenter -y, yCenter -x);
            }
	}

    public int getXCenter() {
        return xCenter;
    }

    public void setXCenter(int xCenter) {
        this.xCenter = xCenter;
    }

    public int getYCenter() {
        return yCenter;
    }

    public void setYCenter(int yCenter) {
        this.yCenter = yCenter;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}