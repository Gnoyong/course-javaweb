<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/11/13
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="book" class="com.yong.exp5.BookBean" scope="request"/>
<html>
<body>
书号：
<jsp:getProperty name="book" property="bookid"/>
书名：
<jsp:getProperty name="book" property="title"/>
作者：
<jsp:getProperty name="book" property="author"/>
出版社：
<jsp:getProperty name="book" property="publisher"/>
价格：
<jsp:getProperty name="book" property="price"/>
</body>
</html>
