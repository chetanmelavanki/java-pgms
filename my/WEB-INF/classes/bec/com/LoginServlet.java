package bec.com;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*; // Import for I/O operations

public class LoginServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        // Set response content type
        resp.setContentType("text/html");

        // Get PrintWriter to send response
        PrintWriter out = resp.getWriter();

        // Retrieve form parameters
        String username = req.getParameter("user");
        String password = req.getParameter("pw");

        // Basic response output
        if (username != null && password != null) {
            out.println("<html><body>");
            out.println("<h2>Login Successful</h2>");
            out.println("<p>Welcome, " + username + "!</p>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h2>Login Failed</h2>");
            out.println("<p>Please provide valid credentials.</p>");
            out.println("</body></html>");
        }

        out.close(); // Always close the PrintWriter
    }
}
