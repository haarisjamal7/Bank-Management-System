package bank.mang.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
//we are defining buttons globally because we also need to access it from outside of the constructor
    JButton signin,clear,signup; 
    JTextField CardTextField;
    JPasswordField PinTextField;
    Login()
    {
        setLayout(null);
        setTitle("ATM");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(90,10,100,100);
        add(label);
        //For adding text in the frame we are using JLabel and setting fonts position and size of the text
        //heading
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("OSWARD",Font.BOLD, 38));
        text.setBounds(230,40,400,40);
        add(text);
        
        //cardno.
        JLabel cardno = new JLabel("Card No :");
        text.setFont(new Font("Raleway",Font.BOLD, 36));
        cardno.setBounds(200,150,400,40);
        add(cardno);
        //cardtextfield
        CardTextField = new JTextField();
        CardTextField.setBounds(280,150, 220, 40);
        CardTextField.setFont(new Font("Arial",Font.BOLD, 14));
        add(CardTextField);
        
        //pin
        JLabel pin = new JLabel("Pin :");
        text.setFont(new Font("Raleway",Font.BOLD, 36));
        pin.setBounds(200,220,250,40);
        add(pin);
        //Pintextfield
        PinTextField = new JPasswordField();
        PinTextField.setBounds(280,220, 220, 40);
        PinTextField.setFont(new Font("Arial",Font.BOLD, 14));
        add(PinTextField);
        
        //loginbutton
        signin =  new JButton("SIGN IN");
        signin.setBounds(280, 300, 100, 30);
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        signin.addActionListener(this);
        add(signin);
        
        //clearbutton
        clear =  new JButton("CLEAR");
        clear.setBounds(400, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        //signup
        signup =  new JButton("SIGN UP");
        signup.setBounds(280, 350, 220, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        
        getContentPane().setBackground(Color.white);
        setSize(720,480);
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == clear){
            CardTextField.setText("");
            PinTextField.setText("");
        }
        else if(ae.getSource() == signin){
            Conn conn = new Conn();
            String cardnumber = CardTextField.getText();
            String pinnumber = PinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pinnumber = '"+pinnumber+"'";
            try{
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Credentials");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource() == signup){
            setVisible(false);
            new SignUpOne().setVisible(true); //connecting signup button to signup page
        }
        
    }
    public static void main(String[]args)
    {
       new Login();  
    }
}
