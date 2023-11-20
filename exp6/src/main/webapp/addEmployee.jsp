<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/11/20
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
请输入雇员信息:
<form action="employee.do" method="post">
    <table>
        <tr>
            <td>雇员号:</td>
            <td><input type="text" name="eno"></td>
        </tr>
        <tr>
            <td>雇员名:</td>
            <td><input type="text" name="ename"></td>
        </tr>
        <tr>
            <td>公司名:</td>
            <td><input type="text" name="ecompany"></td>
        </tr>
    </table>
    <input type="submit" value="提交">
</form>
</body>
</html>
