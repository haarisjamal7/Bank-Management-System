package bank.mang.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Transactions extends JFrame implements ActionListener{
    
    JButton deposit,withdrawl,fastcash,pinchange,mini,balance,exit;
    String pinnumber;
    
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        
        //imageicon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        //heading
        JLabel text = new JLabel("Please Select Your Transactions");
        text.setBounds(215, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        //deposit button
        deposit = new JButton("Deposit");
        deposit.setBounds(150,390,150,25);
        deposit.addActionListener(this);
        image.add(deposit);
        
        //cashwithdrawl
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(355,390,150,25);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        //fastcash
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(150,425,150,25);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        //ministatement
        mini = new JButton("Mini Statement");
        mini.setBounds(355,425,150,25);
        mini.addActionListener(this);
        image.add(mini);
        
        //pin change
        pinchange = new JButton("PIN Change");
        pinchange.setBounds(150,460,150,25);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        //balanceenquiry
        balance = new JButton("Balance Enquiry");
        balance.setBounds(355,460,150,25);
        balance.addActionListener(this);
        image.add(balance);
        
        //exit
        exit = new JButton("Exit");
        exit.setBounds(355,495,150,25);
        exit.addActionListener(this);
        image.add(exit);
        
        
        //making frame
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== exit)
        {
            System.exit(0);
        }
        else if(ae.getSource()== deposit)
        {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==withdrawl)
        {
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }
        else if(ae.getSource() ==fastcash)
        {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==pinchange)
        {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==balance)
        {
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==mini)
        {
            setVisible(false);
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String[]args){
        new Transactions("");
    }
}