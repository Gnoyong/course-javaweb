<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/12/2
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Using JSTL</title></head>
<body>
<c:out value="Welcome to using JSTL"/>
<br>
Request Method:${pageContext.request.method}<br>
Remote Address:${pageContext.request.remoteAddr}
</body>
</html>
