/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;
public class FetchDemo {
    public static void main (String[]args)throws Exception{
    Class.forName("com.mysql.cj.jdbc.Driver");//sql define......
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca6", "root", "");// connection .......
    Statement st = con.createStatement();
    ResultSet rs=st.executeQuery("select * from student");
    while(rs.next())
    {
        System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("address"));
    }
    st.close();
    con.close();
    }
    
}
