
package connection;
import java.sql.*;
public class ScrollDemo {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca6", "root", "");// connection .......
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("select * from student");
            rs.absolute(2);
            System.out.println(rs.getRow());
             System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("address"));
             rs.first();
             System.out.println(rs.getRow());
             System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("address"));
             
             st.close();
             con.close();
             
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
