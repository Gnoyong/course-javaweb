<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/11/20
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="demo" uri="/WEB-INF/tags/taglib.tld" %>
<html>
<head><title>Using Function </title></head>
<body>
<h3>palindrome</h3>
<p>
<form action="palindrome.jsp" method="post">
  string = <input type="text" name="x" size="5"/>
  <input type="submit" value="判断">
</form>
<p>
  是否回文：${demo:palindrome(param["x"])}
</body>
</html>
