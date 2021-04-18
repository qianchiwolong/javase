<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/17
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JqueryAjax使用josn</title>
    <script type="text/javascript" src="/JS/jquery-3.5.1.js"></script>
    <script type="text/javascript">
     $(function () {
         $("#btn").click(function () {
          var proid=  $("#proid").val();
          $.ajax({
              url:"Queryjson",
              type:"get",
              data:{"proid":proid},
              dataType:"json",
              success:function (response) {
                alert(response);
              }


          })
         })

     })
    </script>
</head>
<body>
<P>ajax使用json</P>
<table>
    <tr>
        <td>省份id</td>
        <td><input type="text" id="proid">
            <input type="button" value="搜素" id="btn">
        </td>
    </tr>
    <tr>
        <td>省份名称：</td>
        <td><input type="text" id="proname"></td>
    </tr>
    <tr>
        <td>省份间称：</td>
        <td><input type="text" id="projiancheng"></td>
    </tr>
    <tr>
        <td>省会名称：</td>
        <td><input type="text" id="proshenghui"></td>
    </tr>
</table>

</body>
</html>
