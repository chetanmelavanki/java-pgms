package bec.com;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class EmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Database credentials and connection
        String url = "jdbc:mysql://localhost:3306/Employee";
        String username = "root";
        String password = "Somu@2002";

        // HTML table header
        out.println("<html><body>");
        out.println("<h1>Employees with Salary > 10,000</h1>");
        out.println("<table border='1'><tr><th>EmpID</th><th>EmpName</th><th>DeptID</th><th>Salary</th></tr>");

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection conn = DriverManager.getConnection(url, username, password);

            // SQL query
            String query = "SELECT empid, empname, dept_id, salary FROM employee WHERE salary > 10000.00";
            PreparedStatement stmt = conn.prepareStatement(query);

            // Execute query
            ResultSet rs = stmt.executeQuery();

            // Display result in table format
            while (rs.next()) {
                int empid = rs.getInt("empid");
                String empname = rs.getString("empname");
                int dept_id = rs.getInt("dept_id");
                double salary = rs.getDouble("salary");

                out.println("<tr><td>" + empid + "</td><td>" + empname + "</td><td>" + dept_id + "</td><td>" + salary + "</td></tr>");
            }

            // Close connections
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }

        // End HTML table
        out.println("</table>");
        out.println("</body></html>");
    }
}
