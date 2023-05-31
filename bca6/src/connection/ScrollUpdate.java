
package connection;
import java.sql.*;
public class ScrollUpdate {
   public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca6", "root", "");// connection .......
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("select * from student");
            rs.absolute(2);
             System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("address"));
             String s=rs.getString("name");
            /*code for updating numeric values..................
             float price=rs.getFloat("price");
             float inc=80;
             float pricee=rs.getFloat("price");
             System.out.println("Previous Price:" +pricee);
             rs.updateFloat(3,pricee+inc);
            */
             System.out.println("Previous Name:" +s);
             String Change="basu";
             rs.updateString("name",Change);
             rs.updateRow(); // commit the changes to the database...............
             System.out.println("changed values: \n" +rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("address"));
             
             st.close();
             con.close();
             rs.close();
             
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
