package bec.com;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;
public class MyServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
    {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if("admin".equals(username)&&"admin@123".equals(password))
        {
            out.println("<h1>You have loged in succesfully</h1>");
        }
        else
        {
            out.println("<h1>plese check your username & password</h1>");
        }
    }
}