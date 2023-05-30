/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class HttpServl extends HttpServlet{
     public void doGet(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();//generates ioexception ..............
        
        String name= request.getParameter("un");
        
        out.println("<html><body>");
        out.println("Namaste " + name);
        out.println("</body></html>");
        out.close();
    }
}
