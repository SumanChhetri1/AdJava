
package preparedst;
import java.sql.*;
public class Delete {
     public static void main (String[]args)throws Exception{
    Class.forName("com.mysql.cj.jdbc.Driver");//sql define......
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca6", "root", "");// connection .......
    PreparedStatement pst=con.prepareStatement("delete from student where id=?");
    pst.setInt(1,2);
    pst.executeUpdate();
    pst.close();
    con.close();
    }
}
