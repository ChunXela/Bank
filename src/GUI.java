import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.JTextComponent;

import javafx.scene.*;

import java.awt.*;
import java.awt.event.*;


public class GUI{

    //Normal variables

    int w= 1920;
    int h =1080;
    int bw=300;
    int bh=50;

    // make a new line in strings
    
    String newline = System.lineSeparator();  

    //Javax.swing Variables

    JFrame frame;
    JPanel panel;
    JButton login;
    JButton createBank;
    JLabel title;
    JLabel namnTitle;
    JLabel efternamnTitle;
    JLabel personNummerTitle;
    JLabel civilståndTitle;
    JTextField namnJTextField;
    JTextField efternamnJTextField;
    JTextField personNummerJField;
    JCheckBox civilståndTrue;
    JCheckBox civilståndFalse;
    String namn;
    String efternamn;
    String personnummer;
 

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

        //Setting the layout to null
        panel.setLayout(null);
        
        // making the frame Fullscreen
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setUndecorated(true);

        // Putting in the text NTI BANKEN and putting it in the center
        title = new JLabel("NTI BANKEN");
        title.setBounds(760, 50, 450, 100);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Serif", Font.BOLD, 50));
        panel.add(title);


        JTextComponent description = new JTextField("Välkommen till NTI banken" + newline + "Vi är den bästa Banken I hela NTI" + newline + "(Source: trust me)");
        description.setBounds(700, 200, 900, 125);
        description.setBackground(Color.BLACK);
        description.setForeground(Color.WHITE);
        description.setBorder(null);
        description.setFont(new Font(null, Font.PLAIN, 30));
        panel.add(description);
        

        //Making a button that says login
        login = new JButton("Login");  
        login.setBounds(100, 900, bw, bh);
        login.setFont(new Font("Serif", Font.PLAIN, 20));
        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
                Login();
            }
        });
        
        panel.add(login);

        //Making a button that says Create bank account
        createBank = new JButton("Create bank account"); 
        createBank.setBounds(1500, 900, bw, bh); 

        createBank.setFont(new Font("Serif", Font.PLAIN, 20));
        createBank.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
                CreateBank();
            }
        });

        panel.add(createBank);


        //setting the background of the application to black
        panel.setBackground(Color.BLACK);

        //putting the panel in the frame
        frame.getContentPane().add(panel);
        


        frame.pack();   
        frame.setVisible(true);
    }


private void addText(JTextPane description, String string, Color white) {
    }

void CreateBank(){
   // Creating the frame and the panel
 
    frame = new JFrame("Create new bank");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    frame.setUndecorated(true);

    panel = new JPanel();
    panel.setPreferredSize(new Dimension(w, h));
    panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
    panel.setLayout(null);
    panel.setBackground(Color.BLACK);
    frame.getContentPane().add(panel);

    title = new JLabel("NTI BANKEN");
        title.setBounds(785, 50, 350, 100);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Serif", Font.BOLD, 50));
        panel.add(title);

    //Making a smaller box and putting it in the center

    JPanel smallbox = new JPanel();
    smallbox.setBounds(710, 300, 500, 600);
    smallbox.setBackground(Color.black);
    smallbox.setLayout(null);
    Border border = new LineBorder(Color.white, 2, true);
    smallbox.setBorder(border);

    panel.add(smallbox);

    // title over the namn text field
    namnTitle = new JLabel("Förnamn");
    namnTitle.setForeground(Color.white);
    namnTitle.setFont(new Font("Serif", Font.PLAIN, 20));
    namnTitle.setBounds(200 ,25, 125,25);
    smallbox.add(namnTitle);

    // text field for name
    namnJTextField = new JTextField();
    namnJTextField.setBounds(150, 60, 200, 30);
    smallbox.add(namnJTextField);

    namnJTextField.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e){
            
            namn =  namnJTextField.getText();
            System.out.println(namn);
            Kunder kundNamn = new Kunder();
            kundNamn.kundNamn(namn);



        }
    });

    System.out.println(namn);
        // title over the lastname text field

    efternamnTitle = new JLabel("Efternamn");
    efternamnTitle.setForeground(Color.WHITE);
    efternamnTitle.setFont(new Font("Serif", Font.PLAIN, 20));
    efternamnTitle.setBounds(195, 100, 200, 30);
    smallbox.add(efternamnTitle);


        // text field for lastname

    efternamnJTextField = new JTextField();
    efternamnJTextField.setBounds(150, 140, 200, 30);
    efternamnJTextField.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e){
            
            efternamn =  efternamnJTextField.getText();
            System.out.println(efternamn);
            Kunder kundNamn = new Kunder();
            kundNamn.kundEfternamn(efternamn);



        }
    });
    smallbox.add(efternamnJTextField);
    

    personNummerTitle = new JLabel("Personnummer");
    personNummerTitle.setForeground(Color.white);
    personNummerTitle.setFont(new Font("Serif", Font.PLAIN, 20));
    personNummerTitle.setBounds(170,185, 200, 30);
    smallbox.add(personNummerTitle);

        // text field for personal number

    personNummerJField = new JTextField();
    personNummerJField.setBounds(150, 220, 200, 30);
    personNummerJField.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e){
            
            personnummer =  personNummerJField.getText();
            System.out.println(personnummer);
            Kunder kundNamn = new Kunder();
            kundNamn.kundPersonnummer(personnummer);



        }
    });
    smallbox.add(personNummerJField);

    civilståndTitle = new JLabel("Är du gift?");
    civilståndTitle.setForeground(Color.white);
    civilståndTitle.setFont(new Font("Serif", Font.PLAIN, 20));
    civilståndTitle.setBounds(200,255, 200, 30);
    smallbox.add(civilståndTitle);

    civilståndTrue = new JCheckBox("Ja");
    civilståndTrue.setBackground(Color.black);
    civilståndTrue.setForeground(Color.white);
    civilståndTrue.setFont(new Font("Sherif", Font.PLAIN, 16));
    civilståndTrue.setBounds(255,300,50,30);
    smallbox.add(civilståndTrue);

    civilståndFalse = new JCheckBox("Nej");
    civilståndFalse.setBackground(Color.black);
    civilståndFalse.setForeground(Color.WHITE);
    civilståndFalse.setFont(new Font("Sherif", Font.PLAIN, 16));
    civilståndFalse.setBounds(180,300,50,30);
    smallbox.add(civilståndFalse);


    





  
    frame.pack();
    frame.setVisible(true);


}

void Login(){

    // Creating the frame and the panel
    

    frame = new JFrame("Login");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    frame.setUndecorated(true);

    panel = new JPanel();
    panel.setPreferredSize(new Dimension(w, h));
    panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
    panel.setLayout(null);
    panel.setBackground(Color.BLACK);

    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true);
}

}