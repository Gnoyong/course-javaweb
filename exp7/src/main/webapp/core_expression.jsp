<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/12/2
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>表达式相关的标签</title>
</head>
<body>
<h2>使用<c:out value="<c:out> <c:set> <c:remove>"/>的例子</h2>
<hr>
<c:set scope="page" var="number">
    <c:out value="${5}"/>
</c:set>
<br>
<c:set scope="request" var="number">
    <c:out value="${15}"/>
</c:set>
<br>
<c:set scope="session" var="number">
    <c:out value="${25}"/>
</c:set>
不同作用域的number变量的初始值</p>
pageScope.number =<c:out value="${pageScope.number}" default="No Data"/>
<br>
requestScope.number =<c:out value="${requestScope.number}"
                            default="No Data"/>
<br>
sessionScope.number =<c:out value="${sessionScope.number}"
                            default="No Data"/>
<br>
<p><c:out value='执行<c:remove var="number" />之后'/></p>
<c:remove var="number" scope="request"/>
pageScope.number =<c:out value="${pageScope.number}"
                         default="No Data"/>
<br>
requestScope.number =<c:out value="${requestScope.number}"
                            default="No Data"/>
<br>
sessionScope.number =<c:out value="${sessionScope.number}"
                            default="No Data"/>
<br>
</body>
</html>
