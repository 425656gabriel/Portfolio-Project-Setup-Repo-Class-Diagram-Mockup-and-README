import javax.swing.JButton;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Graphics;
import java.awt.Color;

public class RoundButton extends JButton {

    public RoundButton(String text) {
        super(text);
        setContentAreaFilled(false); // Quita el fondo cuadrado
        setFocusPainted(false);      // Quita el borde de enfoque
        setBorderPainted(false);    // Quita el borde cuadrado original

        addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                setBackground(Color.LIGHT_GRAY); // Change color
            }
            public void mouseExited(MouseEvent e) {
                setBackground(Color.WHITE); // Reset color
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Colors the circle
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth(), getHeight(),1000 ,1000);
        
        // Pintar el texto del botón
        super.paintComponent(g);
    }
}