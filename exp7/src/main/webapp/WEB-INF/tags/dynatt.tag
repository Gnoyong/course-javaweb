<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ tag dynamic-attributes="attrib" %>
<c:forEach items="${attrib}" var="att">
    ${att.value}<br>
</c:forEach>
