
package bank.mang.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener{
    long random;
    //defining all textfield buttons and radio buttons globally
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JDateChooser DateChooser;
    JRadioButton male,female,yes,no;
    SignUpOne(){
        
        //generating random form no
        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong()%9000L ) + 1000L);
        JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        //persondetails
        JLabel PersonDetails = new JLabel("Page 1 : Personal Details");
        PersonDetails.setBounds(280, 80, 400, 30);
        PersonDetails.setFont(new Font("Raleway",Font.BOLD,24));
        add(PersonDetails);
        //name
        JLabel name = new JLabel("Name :");
        name.setBounds(100, 140, 100, 30);
        name.setFont(new Font("Raleway",Font.BOLD,20));
        add(name);
        //nametextfield
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        //fathersname
        JLabel fname = new JLabel("Father's Name :");
        fname.setBounds(100, 190, 200, 30);
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        add(fname);
        //fnametextfield
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

        //dob
        JLabel dob = new JLabel("D.O.B :");
        dob.setBounds(100, 240, 100, 30);
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        add(dob);
        //dobcalender
        DateChooser  = new JDateChooser();
        DateChooser.setBounds(300,240,400,30);
        add(DateChooser);
        
        //gender
        JLabel gender = new JLabel("Gender :");
        gender.setBounds(100, 290, 100, 30);
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        add(gender);
        //genderradiobuttons
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 70, 30);
        add(female);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        //maritalstatus
        JLabel marital = new JLabel("Marital Status :");
        marital.setBounds(100, 340, 200, 30);
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        add(marital);
        //maritalradiobuttons
        yes = new JRadioButton("Yes");
        yes.setBounds(300, 340, 50, 30);
        add(yes);
        no = new JRadioButton("No");
        no.setBounds(450, 340, 50, 30);
        add(no);
        
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(yes);
        maritalGroup.add(no);
        
        //email
        JLabel email = new JLabel("Email :");
        email.setBounds(100, 390, 100, 30);
        email.setFont(new Font("Raleway",Font.BOLD,20));
        add(email);
        //emailtextfield
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300, 390, 400, 30);
        add(emailTextField);
        
        
        //address
        JLabel address = new JLabel("Address :");
        address.setBounds(100, 440, 100, 30);
        address.setFont(new Font("Raleway",Font.BOLD,20));
        add(address);
        //addresstextfield
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        
        //city
        JLabel city = new JLabel("City :");
        city.setBounds(100, 490, 100, 30);
        city.setFont(new Font("Raleway",Font.BOLD,20));
        add(city);
        //citytextfield
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        
        //state
        JLabel state = new JLabel("State :");
        state.setBounds(100, 540, 100, 30);
        state.setFont(new Font("Raleway",Font.BOLD,20));
        add(state);
        //statetextfield
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        
        //pincode
        JLabel pin = new JLabel("Pin Code :");
        pin.setBounds(100, 590, 100, 30);
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        add(pin);
        //pintextfield
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextField.setBounds(300, 590, 400, 30);
        add(pinTextField);
        
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
        String formno = ""+random ; // added empty string because random have a long datatype
        String name = nameTextField.getText();
        String dob = ((JTextField)DateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected())
        {
           gender = "Male";
        }
        else if(female.isSelected()){
            gender = "Female";
        }
        String marital = null;
        if(yes.isSelected()){
           marital = "Yes";
        }
        else if(no.isSelected()){
            marital = "No";
            }

        String fname = fnameTextField.getText();
        String email = emailTextField.getText();
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
        
        try{
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Name is Required");
            }
            else if(fname.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Father's Name is Required");
            }
            else if(address.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Addeess is Required");
            }
            else if(email.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Email is Required");
            }
            else if(state.equals(""))
            {
                JOptionPane.showMessageDialog(null,"State is Required");
            }
            else if(city.equals(""))
            {
                JOptionPane.showMessageDialog(null,"City is Required");
            }
            else if(pin.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Pin is Required");
            }
            else if(dob.equals(""))
            {
                JOptionPane.showMessageDialog(null,"DOB is Required");
            }
            else
            {
                Conn c = new Conn();
                String query = "insert into signup1 values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+marital+"','"+email+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignUpTwo(formno).setVisible(true);
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[]args){
        new SignUpOne();
    }
}
