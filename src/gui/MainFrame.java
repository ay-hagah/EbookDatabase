
package gui;

import java.awt.CardLayout;
import java.awt.*;
import javax.swing.*;

public class MainFrame {

    // default frame dimensions
    public final int     WIDTH = 800;
    public final int     HEIGHT = 500;
    public final int     MIN_WIDTH = 400;
    public final int     MIN_HEIGHT = 400;
    public final String TITLE = "E-Book Store Database";

    public MainFrame() {
    
        JFrame frame = new JFrame();
        JPanel wp = new WelcomePanel(); // welcome panel
        JPanel lp = new LoginPanel(); // login panel
        
        JPanel cards = new JPanel(new CardLayout());

        frame.setLayout(new BorderLayout());
        cards.add(wp);
        cards.add(lp);

        frame.setMinimumSize(new Dimension(MIN_WIDTH, MIN_HEIGHT));

        frame.add(cards);
        frame.pack();
        
        cards.setVisible(true);
        wp.setVisible(false);
        lp.setVisible(true);
        
        frame.setTitle(TITLE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }   
}