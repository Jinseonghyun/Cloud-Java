<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="bean" class="com.dao.Calculator" />
    <jsp:useBean id="bean" class="com.dao.Calculator" />
    <%
        int m = bean.process(5);
        out.print("5의 3제곱 :  " + m);
    %>
</body>
</html>
