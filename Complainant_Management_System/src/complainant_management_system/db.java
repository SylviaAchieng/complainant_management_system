
package complainant_management_system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    
    public static Connection mycon(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/complainant","root","");
            return con;
        }
        catch (ClassNotFoundException | SQLException e){
            return null;
        }
            
        
    }
    
}
