
package bank.mang.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class SignUpThree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
    SignUpThree(String formno)
    {
        this.formno = formno;
        setLayout(null);
        //Account details heading
        setLayout(null);
        JLabel l1 = new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        //account type
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        //Savings acct radio button
        r1 = new JRadioButton("Savings Account");
        r1.setFont(new Font("Raleway",Font.BOLD,22));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,210,30);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,22));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,270,30);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,22));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,210,30);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,22));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,320,30);
        add(r4);
        
        //Button group
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        //card number
        JLabel card = new JLabel("Card Number :");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100, 300, 200, 30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330, 300, 300, 30);
        add(number);
        
        JLabel cardDetail = new JLabel("Your 16 Digit Card No.");
        cardDetail.setFont(new Font("Raleway",Font.BOLD,12));
        cardDetail.setBounds(100, 320, 300, 30);
        add(cardDetail);
        
        //pin
        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100, 380, 200, 30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330, 380, 300, 30);
        add(pnumber);
        
        JLabel pinDetail = new JLabel("Your 4 Digit PIN");
        pinDetail.setFont(new Font("Raleway",Font.BOLD,12));
        pinDetail.setBounds(100, 400, 300, 30);
        add(pinDetail);
        
        //services required label and checkbox
        JLabel services = new JLabel("Services Required");
        services.setFont(new Font("Raleway",Font.BOLD,18));
        services.setBounds(100, 450, 300, 30);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(100,540,200,30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,580,200,30);
        add(c3);
        
        c4 = new JCheckBox("Email & SMS Alert");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,500,200,30);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(350,540,200,30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,580,200,30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,16));
        c7.setBounds(100,650,650,30);
        add(c7);
        
        //submitbutton & cancelbutton
        submit = new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("CANCEL");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        //making frame
        setSize(850,820);
        setLocation(350,0);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == submit)
        {
            String accountType = "";
            if(r1.isSelected())
            {
                accountType = "Savings Account";
            }
            else if(r2.isSelected())
            {
                accountType = "Fixed Deposit Account";
            }
            else if(r3.isSelected())
            {
                accountType = "Current Account";
            }
            else if(r4.isSelected())
            {
                accountType = "Recurring Deposit Account";
            }
            //generating random card and pin no.
            Random random = new Random();
            String cardno = ""+ Math.abs((random.nextLong()% 90000000L)+ 5040934600000000L);
            
            String pinno = ""+ Math.abs((random.nextLong()% 9000L) + 1000L);
            
           // storing facility
           String facility = "";
           if(c1.isSelected())
           {
               facility = facility + "ATM CARD";
           }
           else if(c2.isSelected())
           {
               facility = facility + "Internet Banking";
           }
           else if(c3.isSelected())
           {
               facility = facility + "Mobile Banking";
           }
           else if(c4.isSelected())
           {
               facility = facility + "Email & SMS Alert";
           }
           else if(c5.isSelected())
           {
               facility = facility + "Cheque Book";
           }
           else if(c6.isSelected())
           {
               facility = facility + "E-Statement";
           }
           
           try{
               if(accountType.equals(""))
               {
                   JOptionPane.showMessageDialog(null,"Account type is required");
               }
               else
               {
                   Conn conn = new Conn();
                   String query1 = "insert into signup3 values('"+formno+"','"+accountType+"','"+cardno+"','"+pinno+"','"+facility+"')";
                   String query2 = "insert into login values('"+formno+"','"+cardno+"','"+pinno+"')";
                   conn.s.executeUpdate(query1);
                   conn.s.executeUpdate(query2);

                   JOptionPane.showMessageDialog(null, "Card No : "+cardno+"\n PIN : "+pinno);
                   
                   setVisible(false);
                   new Deposit(pinno).setVisible(false);
               }    
           }
           catch(Exception e){
               System.out.println(e);
           }
        }
        else if(ae.getSource() == cancel)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String[]args){
        new SignUpThree("");
    }
}