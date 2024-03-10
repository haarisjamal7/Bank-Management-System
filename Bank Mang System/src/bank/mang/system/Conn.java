package bank.mang.system;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:/// bankmanagementsystem","root","Haaris_123");
            s = c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
