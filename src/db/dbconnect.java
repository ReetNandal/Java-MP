package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class dbconnect {
    public static Connection con;
    public static Statement stat;
    static{
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/expensedb?useSSL=false", "root","Reet!721");
        stat=con.createStatement();
        }
        catch(Exception ex){
        JOptionPane.showConfirmDialog(null, ex);
        }
    }
}
