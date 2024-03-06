
package complainant_management_system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    
    public static Connection mycon(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/complainant","root","abraham@074021");
            return con;
        }
        catch (ClassNotFoundException | SQLException e){
            return null;
        }
            
        
    }
    
}
