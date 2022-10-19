import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class GUI {
    

    
    int w= 1920;
    int h =1080;
    int bw=300;
    int bh=100;
    

    public GUI(){
        GUIMenu();
    }
    
    void GUIMenu(){

        JFrame frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setPreferredSize(new Dimension(w, h));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setUndecorated(true);

        frame.getContentPane().setBackground(Color.BLACK);


        JButton login = new JButton("Login");
        JButton createBank = new JButton("Create bank account");
        login.setSize(new Dimension(bw,bh));
        createBank.setSize(new Dimension(bw, bh));
        
        frame.getContentPane().add(login, BorderLayout.NORTH);
        frame.getContentPane().add(createBank, BorderLayout.SOUTH);
        frame.pack();   
        frame.setVisible(true);
    }
}
