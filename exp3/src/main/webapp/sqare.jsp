<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/10/30
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<table border=’1’ cellspacing=’0’ cellpadding=’5’>
    <tr>
        <% for (int i = 0; i < 10; i++) { %>
        <td><%= i %>
        </td>
        <% } %>
    </tr>
    <tr>
        <% for (int i = 0; i < 10; i++) { %>
        <td><%= i * i %>
        </td>
        <% } %>
    </tr>
</table>
</body>
</html>

