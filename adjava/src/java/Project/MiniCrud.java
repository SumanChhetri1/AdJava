/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class MiniCrud extends HttpServlet{
    public void doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();//generates ioexception ..............
        //getting values from form..........
        
        int id= Integer.parseInt(request.getParameter("id"));
        String name= request.getParameter("un");
        String address= request.getParameter("address");
        
        //sql part............
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//sql define......
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca6", "root", "");// connection .......
            PreparedStatement pst=con.prepareStatement("insert into student value(?,?,?)");
            pst.setInt(1,id);
            pst.setString(2,name);
            pst.setString(3,address);
            int a=pst.executeUpdate();
            out.println(a+" Row Inserted");
            pst.close();
            con.close();
    }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
}