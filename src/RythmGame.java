import javax.swing.*;
import java.awt.*;

public class RythmGame extends JFrame {
    private CardLayout cardLayout = new CardLayout();
    private JPanel mainContainer = new JPanel(cardLayout);

    public RythmGame() {
        setTitle("Rythm Game");
        setSize(1000, 800);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainContainer.add(new Menu(this), "MENU");
        mainContainer.add(new PlayScreen(this), "PLAY");
        mainContainer.add(new Settings(this), "SETTINGS");
        mainContainer.add(new Jacks(this), "JACKS");
        mainContainer.add(new Streams(this), "STREAMS");
        mainContainer.add(new Trills(this), "TRILLS");
        mainContainer.add(new Staircase(this), "STAIRCASE");

        add(mainContainer);
        setVisible(true);
    }

    // Método para cambiar de pantalla desde cualquier lugar
    public void changeScreen(String screenName) {
        cardLayout.show(mainContainer, screenName);
    }

    public static void main(String[] args) {
        new RythmGame();
    }
}
