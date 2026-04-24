import java.awt.*; 
import javax.swing.*;

public class Jacks extends JPanel{
    public Jacks(RythmGame game) {
        setBackground(Color.decode("#FFFFFF")); 
        setLayout(null);
}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2)); 

        int startX = 300; 
        int startY = 0;
        int endY = 800;
        int columnWidth = 60;

        for (int i = 0; i <= 4; i++) {
                int x = startX + (i * columnWidth);
            g2d.drawLine(x, startY, x, endY);
        }
    }
}
