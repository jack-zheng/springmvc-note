<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 2020/11/3
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.js"></script>

    <script>
      function a() {
        $.post({
          url:"${pageContext.request.contextPath}/a1",
          data:{"name":$("#username").val()},
          success: function (data,status) {
            console.log("data:"+data);
            console.log("status:"+status);
          }
        })
      }
    </script>
  </head>
  <body>
  用户名:<input type="text"id="username" onblur="a()">
  </body>
</html>
