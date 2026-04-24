import javax.swing.*;
import java.awt.*;

public class Settings extends JPanel {
    public Settings(RythmGame game) {
        // Establecer color de fondo para diferenciarlo del menú
        setBackground(Color.decode("#4a4a4a")); 
        setLayout(null);

        RectButton asdf = new RectButton("The name of the beatmap");
        asdf.setBounds(200, 300, 200, 100);
        asdf.setBackground(Color.WHITE);
        add(asdf);

        RoundButton homeButton = new RoundButton("Back to menu");
        homeButton.setBounds(150, 500, 100, 100);
        homeButton.setBackground(Color.WHITE);
        homeButton.addActionListener(e -> game.changeScreen("MENU"));
        add(homeButton);
    }
}