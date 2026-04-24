import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel {
    public Menu(RythmGame game) {
        setLayout(null);
        setBackground(Color.decode("#00502d"));

        RoundButton playButton = new RoundButton("Play");
        playButton.setBounds(200, 300, 200, 200);
        playButton.setBackground(Color.WHITE);

        RoundButton settingsButton = new RoundButton("Settings");
        settingsButton.setBounds(600, 300, 200, 200);
        settingsButton.setBackground(Color.WHITE);

        // Acción: Cuando se presiona, llama al método changeScreen
        playButton.addActionListener(e -> game.changeScreen("PLAY"));
        settingsButton.addActionListener(e -> game.changeScreen("SETTINGS"));

        add(playButton);
        add(settingsButton);
    }
}