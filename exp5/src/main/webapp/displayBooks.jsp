<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/11/13
  Time: 8:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
<head><title>Database Access Test</title>
</head>
<body>
<%
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dburl = "jdbc:mysql://localhost:3306/bookstore";
        Connection conn = DriverManager.getConnection(dburl, "root", "123456");
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM books";
        ResultSet rs = stmt.executeQuery(sql);
        out.println("<table border=1>");
        out.println("<tr><td>书号</td><td>书名</td><td>作者</td><td>价格</td></tr>");
        while (rs.next()) {
            out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2)
                    + "</td><td>" + rs.getString(3)
                    + "</td><td>" + rs.getString(5) + "</td></tr>");
        }
        out.println("</table>");
        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        out.println(e.getMessage());
    }
%>
</body>
</html>
