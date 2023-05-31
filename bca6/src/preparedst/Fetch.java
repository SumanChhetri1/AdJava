
package preparedst;
import java.sql.*;
public class Fetch {
    public static void main (String[]args)throws Exception{
    Class.forName("com.mysql.cj.jdbc.Driver");//sql define......
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca6", "root", "");// connection .......
    PreparedStatement pst=con.prepareStatement("select * from student");
    ResultSet rs=pst.executeQuery();
    while(rs.next())
    {
        System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("address"));
        
    }
    
    pst.close();
    con.close();
    }
}
