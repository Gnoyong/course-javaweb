<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/11/20
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="demo" uri="/WEB-INF/tags/taglib.tld" %>
<html>
<head><title>Using Function </title></head>
<body>
<h3>计算两个整数之和</h3>
<p>
<form action="sum.jsp" method="post">
    X = <input type="text" name="x" size="5"/>
    Y = <input type="text" name="y" size="5"/>
    <input type="submit" value="计算">
</form>
<p>
    两个整数的和为：${demo:add(param["x"],param["y"])}
</body>
</html>
