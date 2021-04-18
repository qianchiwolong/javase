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
    <title>Ajax使用josn</title>
    <script type="text/javascript">
        function doajax() {
            //1创建异步对象
            var xmlhttp=new XMLHttpRequest();
            //2给异步对象绑定事件
            xmlhttp.onreadystatechange=function () {
                // alert(xmlhttp.readyState);
                if (xmlhttp.readyState==4&&xmlhttp.status==200)
                {
                    //alert(xmlhttp.responseText);
                    //document.getElementById("proname").value=xmlhttp.responseText;
                    var data=xmlhttp.responseText;
                   // alert(data);
                    var jsonobj=eval("("+data+")");
                    document.getElementById("proname").value=jsonobj.name;
                    document.getElementById("projiancheng").value=jsonobj.jiancheng;
                    document.getElementById("proshenghui").value=jsonobj.shenghui;
                }

            }
            //3初始化异步对象
            //获取proid文本信息
            var proid=document.getElementById("proid").value;
            xmlhttp.open("get","Queryjson?proid="+proid,true);
            //4发送请求
            xmlhttp.send();
        }
    </script>
</head>
<body>
   <P>ajax使用json</P>
   <table>
       <tr>
           <td>省份id</td>
           <td><input type="text" id="proid">
           <input type="button" value="搜素" onclick="doajax()">
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
