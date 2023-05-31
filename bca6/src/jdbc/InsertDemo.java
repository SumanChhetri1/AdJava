/*connecting and inserting data into database.........
 */
package jdbc;
import java.sql.*;
public class InsertDemo {
    public static void main (String[]args)throws Exception{
    Class.forName("com.mysql.cj.jdbc.Driver");//sql define......
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca6", "root", "");// connection .......
    Statement st = con.createStatement();
    int a = st.executeUpdate("insert into student values(2,'sakshyam','kalika')");// insering data.........
    System.out.println(a +"row is added");
    st.close();
    con.close();
    }
    
}
