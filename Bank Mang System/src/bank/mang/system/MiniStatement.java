
package bank.mang.system;
import java.awt.*;
import javax.swing.*;
import java.sql.*;



public class MiniStatement extends JFrame{
    
        String pinnumber;
        JLabel mini,bank,card;
    
        MiniStatement(String pinnumber){
            this.pinnumber = pinnumber;
            
            setTitle("Mini Statement");
            
            setLayout(null);
        
            mini = new JLabel();
            mini.setBounds(20,140,400,200);
            add(mini);
            
            bank = new JLabel("ONLINE BANK");
            bank.setBounds(150,20,100,20);
            add(bank);
            
            card = new JLabel();
            card.setBounds(20,80,300,20);
            add(card);
            
            
            try{
                
                Conn conn = new Conn();
                ResultSet rs = conn.s.executeQuery("select * from login where pin = '"+pinnumber+"'");
                while(rs.next()){
                    card.setText("Card Number :"+ rs.getString("cardnumber").substring(0,4)+"XXXXXXXX"+rs.getString("cardnumber").substring(12) );
                }
                
            }catch(Exception e){
                System.out.print(e);
            }
            
            try{
                
                Conn conn = new Conn();
                ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                while(rs.next()){
                
                    mini.setText(mini.getText()+ "<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
                }
                
            }catch(Exception e){
                System.out.print(e);
            }
            
            setSize(400,600);
            setLocation(20,20);
            getContentPane().setBackground(Color.WHITE);
            //setUndecorated(true);
            setVisible(true);
        }
        
        public static void main(String[]args){
            new MiniStatement("");
        }
}
