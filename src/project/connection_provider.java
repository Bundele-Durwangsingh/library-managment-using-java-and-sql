
package project;
import java.sql.*;

/**
 *
 * @author Drag11
 */
public class connection_provider {
    public static Connection getCon()
    {
       try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/durwangdb","root","dRAG11@#");
           return con;
       
       }
       catch(Exception e)
       {
           System.out.println(e);
           return null;
           
       }
    }
    
}
