
package bank.mang.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class PinChange extends JFrame implements ActionListener{
    
    JLabel text,pintext,repintext;
    JPasswordField pin,repin;
    JButton change,back;
    String pinnumber;
    
    PinChange(String pinnumber){
        
        this.pinnumber = pinnumber;
        //imageicon
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        text = new JLabel("CHANGE YOUR PIN");
        text.setBounds(250, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        pintext = new JLabel("New Pin :");
        pintext.setBounds(165, 360, 180, 25);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,16));
        image.add(pintext);
        
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330,360,180,25);
        image.add(pin);
        
        repintext = new JLabel("Re-Enter New Pin :");
        repintext.setBounds(165, 400, 180, 25);
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System",Font.BOLD,16));
        image.add(repintext);
        
        repin = new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(330,400,180,25);
        image.add(repin);
    
        change = new JButton("CHANGE");
        change.setBounds(355,485,150,25);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(355,520,150,25);
        back.addActionListener(this);
        image.add(back);
    
        //making frame
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == change){
          try{
            
            String npin = pin.getText();
            String rpin = repin.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            
            if(npin.equals("")){
                JOptionPane.showMessageDialog(null, "Enter new PIN");
                return;
            }
            
            if(rpin.equals("")){
                JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                return;
            }
            
            Conn conn = new Conn();
            String query1 = "update bank set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
            String query2 = "update login set pinnumber = '"+rpin+"' where pinnumber = '"+pinnumber+"'";
            String query3 = "update signup3 set pin = '"+rpin+"' where pin = '"+pinnumber+"'";     
            
            conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query2);
            conn.s.executeUpdate(query3);
            
            JOptionPane.showMessageDialog(null, "PIN Changed Sucessfully");
            
            setVisible(false);
            new Transactions(npin).setVisible(true);
            
          }catch(Exception e){
            System.out.println(e);
          }
        }
        else{
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        
        
        
    }
    
    public static void main(String[]args){
        
        new PinChange("").setVisible(true);
    }
}
