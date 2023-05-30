/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;
import javax.servlet.*;
import java.io.*;
public class GenericServl extends GenericServlet {
    
    
    public void service(ServletRequest request , ServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();//generates ioexception ..............
        
        out.println("<html><body>");
        out.println("This is my web app");
        out.println("</body></html>");
        out.close();
    }
}
