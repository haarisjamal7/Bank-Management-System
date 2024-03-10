package bank.mang.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
    JButton w100,w500,w1000,w2000,w5000,w10000,back;
    String pinnumber;
    
    FastCash(String pinnumber){
        this.pinnumber = pinnumber;
        
        //imageicon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        //heading
        JLabel text = new JLabel("SELECT YOUR WITHDRAWL AMOUNT");
        text.setBounds(215, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        //deposit button
        w100 = new JButton("Rs 100");
        w100.setBounds(150,390,150,25);
        w100.addActionListener(this);
        image.add(w100);
        
        //cashwithdrawl
        w500 = new JButton("Rs 500");
        w500.setBounds(355,390,150,25);
        w500.addActionListener(this);
        image.add(w500);
        
        //fastcash
        w1000 = new JButton("Rs 1000");
        w1000.setBounds(150,425,150,25);
        w1000.addActionListener(this);
        image.add(w1000);
        
        //ministatement
        w2000 = new JButton("Rs 2000");
        w2000.setBounds(355,425,150,25);
        w2000.addActionListener(this);
        image.add(w2000);
        
        //pin change
        w5000 = new JButton("Rs 5000");
        w5000.setBounds(150,460,150,25);
        w5000.addActionListener(this);
        image.add(w5000);
        
        //balanceenquiry
        w10000 = new JButton("Rs 10000");
        w10000.setBounds(355,460,150,25);
        w10000.addActionListener(this);
        image.add(w10000);
        
        //exit
        back = new JButton("Back");
        back.setBounds(355,495,150,25);
        back.addActionListener(this);
        image.add(back);
        
        
        //making frame
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== back)
        {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        else{
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn c = new Conn();
        
        try{
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            int balance = 0;
            while(rs.next())
            {
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }
                else
                {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            
            if(ae.getSource()!= back && balance < Integer.parseInt(amount))
            {
                JOptionPane.showMessageDialog(null,"Insufficient Balance");
                return;
            }
            
            Date date = new Date();
            String query = "insert into bank values('"+pinnumber+"','"+date+"', 'Withdrawl' , '"+amount+"')";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Rs "+ amount + " Debited Sucessfully");
            
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
            
            
        }catch(Exception e){
            System.out.print(e);
        }
     }
    }
    public static void main(String[]args){
        new FastCash("");
    }
}