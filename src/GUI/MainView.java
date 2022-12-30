package GUI;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    public MainView() throws HeadlessException {
        this.setTitle("Simples RPG");
        this.setSize(800,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        ImageIcon icon = new ImageIcon("unnamed.jpg");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(0x8DF3F3F3, true));
        this.setVisible(true);
    }
}
