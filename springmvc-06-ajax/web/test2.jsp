<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 2020/11/4
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.js"></script>

    <script>
        $(function () {
            $("#btn").click(function () {
                $.post("${pageContext.request.contextPath}/a2", function (data) {
                    var html="";

                    for(let i=0;i<data.length;i++) {
                        html += "<tr>"
                            + "<td>" + data[i].name + "<td>"
                            + "<td>" + data[i].age + "<td>"
                            + "<td>" + data[i].gender + "<td>"
                            + "</tr>"
                    }
                    $("#content").html(html);
                });
            });
        });

    </script>
</head>
<body>

<input type="button" value="load" id="btn"> <br/>
<table>
    <tr>姓名</tr>
    <tr>年龄</tr>
    <tr>性别</tr>
    <tbody id="content">

    </tbody>
</table>

</body>
</html>
