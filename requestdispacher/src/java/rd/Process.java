
package rd;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Process extends HttpServlet{
     public void doGet(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();//generates ioexception ..............
        
        String name= request.getParameter("un");
        
        if(name.equals("ram")){
            out.println("You are In...Congrats!!");
            RequestDispatcher rd=request.getRequestDispatcher("welcomepage.html");
            rd.forward(request, response);
        }else{
            out.println("Invalid User Name...Try again!!");
            RequestDispatcher rd=request.getRequestDispatcher("index.html");
            rd.include(request, response);
        }
    }
}
