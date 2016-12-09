package pl.dmichalski.gui_swing.ui.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private JPanel mainPanel;
    private JButton welcomeBtn;
    private JTextArea welcomeTA;

    public MainFrame() {
        setSize(WIDTH, HEIGHT);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
    }

    public JButton getWelcomeBtn() {
        return welcomeBtn;
    }

    public JTextArea getWelcomeTA() {
        return welcomeTA;
    }
}

