<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/16
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Ajax根据省份id查询省份名称</title>
      <script type="text/javascript">
          function search() {
              //1创建异步对象
              var xmlhttp=new XMLHttpRequest();
              //2给异步对象绑定事件
              xmlhttp.onreadystatechange=function () {
                 // alert(xmlhttp.readyState);
                  if (xmlhttp.readyState==4&&xmlhttp.status==200)
                  {
                      //alert(xmlhttp.responseText);
                      document.getElementById("proname").value=xmlhttp.responseText;
                  }

              }
              //3初始化异步对象
              //获取proid文本信息
              var proid=document.getElementById("proid").value;
            xmlhttp.open("get","QueryProvince?proid="+proid,true);
              //4发送请求
              xmlhttp.send();
          }
      </script>
  </head>
  <body>
      <p>Ajax根据省份id查询省份名称</p>
      <table>
        <tr>
            <td>省份编号：</td>
            <td>
                <input type="text" id="proid">
                <input type="button" value="搜素" onclick="search()">
            </td>
        </tr>
          <tr>
              <td>省份名称：</td>
              <td><input type="text" id="proname"></td>
          </tr>

      </table>
  </body>
</html>
