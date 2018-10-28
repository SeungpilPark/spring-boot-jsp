<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<%@ page import="org.springframework.web.util.UrlPathHelper" %>
<%
    UrlPathHelper urlPathHelper = new UrlPathHelper();
    String uri = urlPathHelper.getOriginatingRequestUri(request);
    String mySession = session.getId();
    System.out.println(mySession);
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Sample</title>

    <script type="text/javascript">

    </script>
</head>
<body>
    <div>page1</div>
    <div>Session: <%=mySession %></div>
</body>
</html>
