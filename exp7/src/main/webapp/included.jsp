<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/12/2
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head><title>Included Page</title></head>
<body>
<h3>这是被包含页面中的内容</h3>

用户名：<c:out value="${param.userName}"/>

</body>
</html>
