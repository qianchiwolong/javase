<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/21
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>省市级联查询</title>
    <script type="text/javascript" src="JS/jquery-3.5.1.js"></script>
    <script type="text/javascript">
        $(function () {
          $("#load").click(function () {
            //做Ajax请求
            $.ajax({
              url: "QP",
              dataType: "json",
              success: function (responsedata) {
                $("#province").empty();
                //将返回数据写入到下拉列表框
                $.each(responsedata, function (i, n) {
                  $("#province").append("<option value='" + n.id + "'>" + n.name + "</option>");

                })
              }
            })

          })
          //给省份下拉列表框绑定事件
          $("#province").change(function () {
            //alert("下拉列表框事件发生了")
            //获取选中的下拉列表框的值
            var obj = $("#province>option:selected");
            var porid = obj.val();
            alert(porid);
            //通过Ajax来更新市的信息
               $.ajax({
                 data:{porid:porid},
                 type:"post",
                 url:"QC",
                 dataType: "json",
                 success:function (responsedata) {
                   alert(responsedata);
                  //对返回数据进行处理
                   $("#city").empty();
                   //将返回数据写入到下拉列表框
                  $.each(responsedata,function (i,n) {
                     $("#city").append("<option value='"+n.id+"'>"+n.name+"</option>");

                 })
                }
               })

            // $.post("QC",{porid:porid},function (responsedata) {
            //        // alert(responsedata);
            //   //处理返回数据
            //   $("#city").empty();
            //   $.each(responsedata,function (i,n) {
            //     $("#city").append("<option value='"+n.id+"'>"+n.name+"</option>");
            //
            //   })
            //
            // },"json")

          })
        })
    </script>
  </head>
  <body>
  <p>省市记录查询</p>
  <div>
    <table>
      <tr>
        <td>
          省份:
        </td>
        <td>
          <select id="province">
            <option value="0">请选择</option>
          </select> <input type="button" value="load数据" id="load">
        </td>

      </tr>
      <tr>
        <td>城市:</td>
        <td>
          <select id="city">
          <option value="0">请选择</option>
        </select>
        </td>

      </tr>

    </table>

  </div>
  </body>
</html>
