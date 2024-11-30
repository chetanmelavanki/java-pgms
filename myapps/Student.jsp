<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert Student Information</title>
</head>
<body>
    <h1>Insert Student Information</h1>

    <%
        // Define variables
        String usn = request.getParameter("usn");
        String stdName = request.getParameter("std_name");
        String deptId = request.getParameter("dept_id");
        String message = "";

        // Check if form is submitted
        if (usn != null && stdName != null && deptId != null) {
            // Database connection details
            String dbUrl = "jdbc:mysql://localhost:3306/s";
            String dbUsername = "root";
            String dbPassword = "ROOT";

            Connection conn = null;
            PreparedStatement stmt = null;

            try {
                // Load the JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish a connection
                conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

                // Prepare SQL query
                String sql = "INSERT INTO s(usn, std_name, dept_id) VALUES (?, ?, ?)";
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, usn);
                stmt.setString(2, stdName);
                stmt.setString(3, deptId);

                // Execute update
                int rows = stmt.executeUpdate();
                if (rows > 0) {
                    message = "Student information inserted successfully!";
                } else {
                    message = "Failed to insert student information.";
                }
            } catch (Exception e) {
                message = "Error: " + e.getMessage();
            } finally {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }
        }
    %>

    <!-- Display message if available -->
    <%
        if (!message.isEmpty()) {
            out.println("<h2>" + message + "</h2>");
        }
    %>

    <!-- Input form -->
    <form method="post">
        <label for="usn">USN:</label>
        <input type="text" id="usn" name="usn" required><br><br>
        <label for="std_name">Student Name:</label>
        <input type="text" id="std_name" name="std_name" required><br><br>
        <label for="dept_id">Department ID:</label>
        <input type="text" id="dept_id" name="dept_id" required><br><br>
        <button type="submit">Insert</button>
    </form>
</body>
</html>
