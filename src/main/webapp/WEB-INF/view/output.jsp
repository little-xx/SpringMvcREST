<%--
  Created by IntelliJ IDEA.
  User: tyxqaq
  Date: 2019/12/23
  Time: 8:29 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>output</title>
</head>
<body>
<h1>hello</h1>
pageContext:${pageScope.msg}<br/>
requestContext:${requestScope.msg}<br/>
sessionContext:${sessionScope.msg}<br/>
applicationContext:${applicationScope.msg}<br/>
</body>
</html>
