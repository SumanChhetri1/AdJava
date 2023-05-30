/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class SecondServlet extends HttpServlet {
     public void doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession Session=request.getSession(false);
        String name=(String)Session.getAttribute("n");
        out.println("Welcome " +name );
        out.close();
        
        
    }
}
