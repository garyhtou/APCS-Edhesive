package _Home_Projects;

import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  

//http://zetcode.com/tutorials/javaswingtutorial/firstprograms/

public class Graphics extends JFrame {

    public void Graphics() {

        initUI();
    }

    private void initUI() {
        
        setTitle("This is a window!!!!!!");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
        	Graphics ex = new Graphics();
            ex.setVisible(true);
        });
    }
}