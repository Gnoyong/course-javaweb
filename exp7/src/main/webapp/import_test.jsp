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
<head><title>Using URL JSTL</title></head>
<body>
<h3>这是包含页面中的内容</h3>

<c:import url="included.jsp" charEncoding="gb2312">
    <c:param name="userName" value="Harry Porter"/>
</c:import>

<br>

</body>
</html>
