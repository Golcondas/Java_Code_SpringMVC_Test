<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/17
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${name}" var="item">
    <tr>
        <td>${item}</td>
    </tr>
</c:forEach>
</body>
</html>
