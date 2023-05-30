/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class FirstServlet extends HttpServlet{
    public void doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();//generates ioexception ..............
        
        String name= request.getParameter("un");
        
        out.println("<html><body>");
        out.println("Namaste " + name);
        out.println("</body></html>");
        
        //session create object...........
        HttpSession Session=request.getSession();
        Session.setAttribute("n", name);
        out.println("<form action='secondservletsess' method ='post'>");
        out.println("<input type='submit' value='go'/>" );
        out.println("</form>");
        
        
    }
}
