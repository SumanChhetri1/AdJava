/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;
public class DeleteDemo {
    public static void main (String[]args)throws Exception{
    Class.forName("com.mysql.cj.jdbc.Driver");//sql define......
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca6", "root", "");// connection .......
    Statement st = con.createStatement();
    int a = st.executeUpdate("delete from student where id=1 ");// delete data.........
    System.out.println(a +"row is deleted");
    st.close();
    con.close();
    }
    
}
