
package ATM_SYSTEM;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class connection {
    public static Connection connect()
    {
      Connection con=null;
      try{
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
          Component rootPane=null;
          System.out.println("connected");
      }
      catch(ClassNotFoundException | SQLException e)
      {
          System.out.println("NOT connected");
          JOptionPane.showMessageDialog(null, e);
      }
      return con;
    }
    
}
