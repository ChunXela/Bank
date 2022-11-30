import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.*;


public class GUI extends Kunder{

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
    JTextField namnJTextField;
    JTextField efternamnJTextField;
    JTextField personNummerJField;
    GridBagConstraints gbc = new GridBagConstraints();

    

    public GUI(){
        GUIMenu();
        storeInFile(name, lastname, personnumber, accountNumber);


    }

    // Menu

    void GUIMenu(){

        // make the frame
        frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // make the panel
        panel  = new JPanel();
        panel.setPreferredSize(new Dimension(w, h));
        frame.setLayout(new GridBagLayout());

        // setting a border
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

        //Setting the layout to a 2x2 grid
        panel.setLayout(new GridBagLayout());
        
        // making the frame Fullscreen
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setUndecorated(true);

        // Putting in the text NTI BANKEN and putting it in the center
        title = new JLabel("NTI BANKEN");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Serif", Font.BOLD, 50));
        panel.add(title);

        

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

        gbc.gridx = 1000 ;
        gbc.gridy = 5;
       // gbc.gridwidth = 10;
      //  gbc.fill = GridBagConstraints.HORIZONTAL;

        panel.add(login, gbc);

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

        gbc.gridx = 0;
        gbc.gridy = 5;
        //gbc.gridwidth = 2;
       // gbc.fill = GridBagConstraints.HORIZONTAL;

        panel.add(createBank, gbc);


        //setting the background of the application to black
        panel.setBackground(Color.BLACK);

        //putting the panel in the frame
        frame.getContentPane().add(panel);
        


        frame.pack();   
        frame.setVisible(true);
    }

void CreateBank(){
   // Creating the frame and the panel
 
    frame = new JFrame("Create new bank");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    frame.setLayout(new GridLayout(2,2));
    frame.setUndecorated(true);

    panel = new JPanel();
    panel.setPreferredSize(new Dimension(w, h));
    panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
    panel.setBackground(Color.BLACK);
    frame.getContentPane().add(panel);

    title = new JLabel("NTI BANKEN");
    title.setForeground(Color.WHITE);
    title.setFont(new Font("Serif", Font.BOLD, 70));
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
            
            name =  namnJTextField.getText();

           getNameGui(name);
        
        }
    });

    System.out.println(name);
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
            
            lastname =  efternamnJTextField.getText();

            getLastnameGui(lastname);
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
            
            personnumber =  personNummerJField.getText();

            getPersonnumberGui(personnumber);


        }
    });
    smallbox.add(personNummerJField);
  
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