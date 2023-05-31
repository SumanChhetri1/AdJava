
package preparedst;
import java.sql.*;
public class Insert {
    public static void main (String[]args)throws Exception{
    Class.forName("com.mysql.cj.jdbc.Driver");//sql define......
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca6", "root", "");// connection .......
    PreparedStatement pst=con.prepareStatement("insert into student value(?,?,?)");
    pst.setInt(1,2);
    pst.setString(2,"sudeep");
    pst.setString(3,"bharatpur");
    pst.executeUpdate();
    pst.close();
    con.close();
    }
    
}
