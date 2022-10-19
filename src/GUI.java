import javax.swing.*;
import java.awt.*;

public class GUI {


    int w= 1920;
    int h =1080;
    int bw=300;
    int bh=100;
    JFrame frame;
    JPanel panel;
    JButton login;
    JButton createBank;
    JLabel title;
    



    public GUI(){
        GUIMenu();
    }
    
    void GUIMenu(){

// make the frame
        frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// make the panel
        panel  = new JPanel();
        panel.setPreferredSize(new Dimension(w, h));
        // setting a border
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        // setting up a grid layout
        panel.setLayout(new GridLayout(4, 4));
        // making the frame Fullscreen
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setUndecorated(true);

        // Putting in the text NTI BANKEN and putting it in the center
        title = new JLabel("NTI BANKEN", SwingConstants.CENTER);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Serif", Font.BOLD, 60));
        panel.add(title);
        //Making a button that says login
        login = new JButton("Login");  
        login.setSize(bw, bh);
        login.setFont(new Font("Serif", Font.BOLD, 30));
        panel.add(login);
        //Making a button that says Create bank account
        createBank = new JButton("Create bank account");  
        createBank.setFont(new Font("Serif", Font.BOLD, 30));
        createBank.setSize(bw, bh);
        panel.add(createBank);
        //setting the background of the application to black
        panel.setBackground(Color.BLACK);
        //putting the panel in the frame
        frame.getContentPane().add(panel);
        
        frame.pack();   
        frame.setVisible(true);
    }
}
