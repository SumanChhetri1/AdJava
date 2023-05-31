
package rowset;
import java.sql.*;
import javax.sql.rowset.*;
public class CatchedRow_SetDemo {
    public static void main (String[]args)throws Exception{
    Class.forName("com.mysql.cj.jdbc.Driver");//sql define......
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca6", "root", "");// connection .......
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from student");
    RowSetFactory rsf = RowSetProvider.newFactory();
    CachedRowSet crs = rsf.createCachedRowSet();
    crs.populate(rs);
    con.close();
    
    while(crs.next()){
        System.out.println(crs.getInt("id")+" "+crs.getString("name")+" "+crs.getString("address"));
    }
    }
}
