
package bank.mang.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener{
    //defining all textfield buttons and radio buttons globally
    JTextField pantextfield,adhaarTextField;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox Religion,Category,Income,Occupation,Qualification;
    String formno;
    SignUpTwo(String formno){
        
        this.formno=formno;
        
        setLayout(null);
        setTitle("NEW APPLICATION FORM PAGE 2");
        
        //additionaldetails
        JLabel AdditionalDetails = new JLabel("Page 2 : Additional Details");
        AdditionalDetails.setBounds(280, 80, 400, 30);
        AdditionalDetails.setFont(new Font("Raleway",Font.BOLD,24));
        add(AdditionalDetails);
        
        //religion
        JLabel religion = new JLabel("Religion :");
        religion.setBounds(100, 140, 100, 30);
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        add(religion);
        //religion combobox means dropdown button
        String valReligion[] = {"Hindu", "Muslim","Christian","Sikh","Buddhists","Jain","Others"};
        Religion = new JComboBox(valReligion);
        Religion.setFont(new Font("Raleway",Font.BOLD,14));
        Religion.setBounds(300, 140, 400, 30);
        add(Religion);
        
        //Category
        JLabel category = new JLabel("Category :");
        category.setBounds(100, 190, 200, 30);
        category.setFont(new Font("Raleway",Font.BOLD,20));
        add(category);
        //Category combo box
        String valCategory[] = {"General","OBC A", "OBC B", "SC", "ST","Others"};
        Category = new JComboBox(valCategory);
        Category.setFont(new Font("Raleway",Font.BOLD,14));
        Category.setBounds(300, 190, 400, 30);
        add(Category);

        //Income
        JLabel income = new JLabel("Income :");
        income.setBounds(100, 240, 100, 30);
        income.setFont(new Font("Raleway",Font.BOLD,20));
        add(income);
        //income combo box
        String valIncome[] = {"None","< 1,00,000","< 1,50,000", "< 2,50,000", "< 3,50,000", "< 5,00,000","More than 5,00,000"};
        Income = new JComboBox(valIncome);
        Income.setFont(new Font("Raleway",Font.BOLD,14));
        Income.setBounds(300, 240, 400, 30);
        add(Income);        
        
        //occupation
        JLabel occupation = new JLabel("Occupation :");
        occupation.setBounds(100, 290, 300, 30);
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        add(occupation);
        //Occupation Combo Box
        String valOccupation[] = {"None","Businessman","Self-Employed","Retired","Student","Home Maker","Others"};
        Occupation = new JComboBox(valOccupation);
        Occupation.setFont(new Font("Raleway",Font.BOLD,14));
        Occupation.setBounds(300, 290, 400, 30);
        add(Occupation); 
        
        //educational
        JLabel educational = new JLabel("Educational");
        educational.setBounds(100, 340, 300, 30);
        educational.setFont(new Font("Raleway",Font.BOLD,20));
        add(educational);
        //qualification
        JLabel qualification = new JLabel("Qualification :");
        qualification.setBounds(100, 370, 300, 30);
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        add(qualification);
        //Qualification combo box
        String valQualification[] = {"None","Less than 10th","10th Above", "Under Graduate","Post Graduate", "Others"};
        Qualification = new JComboBox(valQualification);
        Qualification.setFont(new Font("Raleway",Font.BOLD,14));
        Qualification.setBounds(300, 370, 400, 30);
        add(Qualification);
        
        //Pan no.
        JLabel pan = new JLabel("PAN No. :");
        pan.setBounds(100, 440, 100, 30);
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        add(pan);
        //pantextfield
        pantextfield = new JTextField();
        pantextfield.setFont(new Font("Raleway",Font.BOLD,14));
        pantextfield.setBounds(300, 440, 400, 30);
        add(pantextfield);
        
        //adhaar
        JLabel adhaar = new JLabel("Adhaar No. :");
        adhaar.setBounds(100, 490, 300, 30);
        adhaar.setFont(new Font("Raleway",Font.BOLD,20));
        add(adhaar);
        //citytextfield
        adhaarTextField = new JTextField();
        adhaarTextField.setFont(new Font("Raleway",Font.BOLD,14));
        adhaarTextField.setBounds(300, 490, 400, 30);
        add(adhaarTextField);
        
        //senior citizen 
        JLabel Senior = new JLabel("Senior Citizen :");
        Senior.setBounds(100, 540, 300, 30);
        Senior.setFont(new Font("Raleway",Font.BOLD,20));
        add(Senior);
        //seniorcitizen radio button
        syes = new JRadioButton("Yes");
        syes.setFont(new Font("Raleway",Font.BOLD,14));
        syes.setBounds(300, 540, 60, 30);
        add(syes);
        sno = new JRadioButton("No");
        sno.setFont(new Font("Raleway",Font.BOLD,14));
        sno.setBounds(400, 540, 60, 30);
        add(sno);
      
        //existing Account
        JLabel existing = new JLabel("Existing Account :");
        existing.setBounds(100, 590, 300, 30);
        existing.setFont(new Font("Raleway",Font.BOLD,20));
        add(existing);
        //Existing account radio button
        eyes = new JRadioButton("Yes");
        eyes.setFont(new Font("Raleway",Font.BOLD,14));
        eyes.setBounds(300, 590, 60, 30);
        add(eyes);
        eno = new JRadioButton("No");
        eno.setFont(new Font("Raleway",Font.BOLD,14));
        eno.setBounds(400, 590, 60, 30);
        add(eno);
        
        
        //nextbutton
        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
       //making frame 
       getContentPane().setBackground(Color.WHITE);
       setSize(850,800) ;
       setLocation(350,10);
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
          String sReligion = (String)Religion.getSelectedItem();
          String sCategory = (String)Category.getSelectedItem();
          String sIncome = (String)Income.getSelectedItem();
          String sOccupation = (String)Occupation.getSelectedItem();
          String sQualification = (String)Qualification.getSelectedItem();
        String sCitizen = null;
        if(syes.isSelected())
        {
           sCitizen = "Yes";
        }
        else if(sno.isSelected()){
            sCitizen = "No";
        }
        String sExisting = null;
        if(eyes.isSelected()){
           sExisting = "Yes";
        }
        else if(sno.isSelected()){
            sExisting = "No";
            }

        String sPan = pantextfield.getText();
        String sAdhaar = adhaarTextField.getText();
    
        try{
                Conn c = new Conn();
                String query = "insert into signup2 values('"+formno+"','"+sReligion+"','"+sCategory+"','"+sIncome+"','"+sQualification+"','"+sOccupation+"','"+sPan+"','"+sAdhaar+"','"+sCitizen+"','"+sExisting+"')";
                c.s.executeUpdate(query);  
                
              //  signup3 ka object hoga yaha
              setVisible(false);
              new SignUpThree(formno).setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    public static void main(String[]args){
        new SignUpTwo("");
    }
}
