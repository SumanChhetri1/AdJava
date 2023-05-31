/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;
public class UpdateDemo {
    public static void main (String[]args)throws Exception{
    Class.forName("com.mysql.cj.jdbc.Driver");//sql define......
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca6", "root", "");// connection .......
    Statement st = con.createStatement();
    int a = st.executeUpdate("update student set id=1,name='sandip',address='kalika' where id=2");// updated data.........
    System.out.println(a +"row is updated");
    st.close();
    con.close();
    }
    
}
