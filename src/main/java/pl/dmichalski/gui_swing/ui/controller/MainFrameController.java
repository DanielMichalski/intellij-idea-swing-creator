package pl.dmichalski.gui_swing.ui.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import pl.dmichalski.gui_swing.ui.view.MainFrame;

public class MainFrameController {

    private MainFrame mainFrame;
    private JButton welcomeBtn;
    private JTextArea welcomeTA;

    public MainFrameController() {
        initComponents();
        initListeners();
    }

    public void showMainFrameWindow() {
        mainFrame.setVisible(true);
    }

    private void initComponents() {
        mainFrame = new MainFrame();

        welcomeBtn = mainFrame.getWelcomeBtn();
        welcomeTA = mainFrame.getWelcomeTA();
    }

    private void initListeners() {
        welcomeBtn.addActionListener(new WelcomeBtnLister());
    }

    private class WelcomeBtnLister implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            welcomeTA.append("Welcome IntelliJ IDEA Swing Creator\n");
        }
    }
}
