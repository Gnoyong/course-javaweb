<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/12/2
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL中用于流程控制的标签</title>
</head>
<body>
<h2>标签c:if的使用</h2>
<c:if test="${param.username == 'Tom'}" var="condition" scope="session">
    您好,Tom
</c:if>
<c:if test="${param.username == 'Jerry'}" var="condition" scope="session">
    您好,Jerry
</c:if>
<c:if test="${param.username == 'Mike'}" var="condition" scope="session">
    您好,Mike
</c:if>
<c:if test="${param.username == 'Ben'}" var="condition" scope="session">
    您好,Ben
</c:if>
<h2>标签c:choose c:when c:otherwise使用</h2>
<c:choose>
    <c:when test="${param.username == 'Tom'}">
        您好,Tom
    </c:when>
    <c:when test="${param.username == 'Jerry'}">
        您好,Jerry
    </c:when>
    <c:when test="${param.username == 'Mike'}">
        您好,Mike
    </c:when>
    <c:otherwise>
        您好,Ben
    </c:otherwise>
</c:choose>

</body>
</html>
