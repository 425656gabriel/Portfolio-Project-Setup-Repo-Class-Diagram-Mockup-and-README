import javax.swing.*;
import java.awt.*;

public class PlayScreen extends JPanel {
    public PlayScreen(RythmGame game) {
        setBackground(Color.decode("#54afe3")); 
        setLayout(null);

        JLabel label = new JLabel("Select pattern");
        label.setForeground(Color.WHITE);
        label.setBounds(400, 20, 200, 50);
        label.setFont(new Font("Pacific", Font.BOLD, 24));
        add(label);

        RectButton jacks = new RectButton("Jacks");
        jacks.setBounds(250,400,70,70);
        jacks.addActionListener(e -> game.changeScreen("JACKS"));
        RectButton streams = new RectButton("Streams");
        streams.setBounds(350,400,70,70);
        streams.addActionListener(e -> game.changeScreen("STREAMS"));
        RectButton trills = new RectButton("Trills");
        trills.setBounds(450,400,70,70);
        trills.addActionListener(e -> game.changeScreen("TRILLS"));
        RectButton staircase = new RectButton("Staircase");
        staircase.setBounds(550,400,70,70);
        staircase.addActionListener(e -> game.changeScreen("STAIRCASE"));
        add(jacks);
        add(streams);
        add(trills);
        add(staircase);
    }
}