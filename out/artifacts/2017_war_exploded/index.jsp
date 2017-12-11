<%--
  Created by IntelliJ IDEA.
  User: 32936
  Date: 2017/9/5
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <meta charset="utf-8">
      <title>管理员登录</title>
      <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
      <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <%--<script type="text/javascript">--%>
              <%--function showCustomer() {--%>

              <%--}--%>
      <%--</script>--%>

  </head>
  <body>
    <%--<form action="toUser.login">--%>
        <%--<input type="submit" value="用户登录"/>--%>
    <%--</form>--%>
    <%--<form action="toAdmin.login">--%>
        <%--<input type="submit" value="管理员登录"/>--%>
    <%--</form>--%>
    <%--<form action="mainPage.admin">--%>
        <%--<input type="submit" value="管理员主页">--%>
    <%--</form>--%>
  <%--<form action="main.blog">--%>
        <%--<input type="submit" value="微博">--%>
  <%--</form>--%>
  <%--<form action="toFeedback">--%>
        <%--<input type="submit" value="反馈">--%>
  <%--</form>--%>
    <%--<form action="toReport">--%>
        <%--<input type="submit" value="举报">--%>
    <%--</form>--%>
    <%--<form action="toScenic">--%>
        <%--<input type="submit" value="设置景点">--%>
    <%--</form>--%>
    <%--<form action="toUser.change">--%>
        <%--<input type="submit" value="修改用户信息">--%>
    <%--</form>--%>
    <div class="jumbotron" style="background-color:rgba(94, 163, 129, 1);height: 450px;">
        <h1 style="color:white;margin-left: 40px;">欢迎登陆</h1>

        <div class="center-block" style="width:570px" >

            <form class="form-horizontal" role="form" style="width: 500px">
                <div class="form-group" style="color:white;margin-top: 200px;">
                    <label for="inputPassword" class="col-sm-2 control-label">管理员ID</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="inputID"
                               placeholder="请输入手机/邮箱/ID">
                    </div>
                </div>
                <div class="form-group" style="color:white">
                    <label for="inputPassword" class="col-sm-2 control-label">密码</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" id="inputPassword"
                               placeholder="请输入密码">
                    </div>
                </div>
            </form>
        </div>
    </div>
    <div class="center-block" style="width: 200px">
        <p>
        <form action="mainPage.admin">
            <button type="submit" class="btn btn btn-default btn-lg " style="color:rgba(94, 163, 129, 1);float: left;" >登陆</button>
        </form>
        <form action="regist.admin">
            <button type="submit" class="btn btn btn-default btn-lg " style="background-color:rgba(94, 163, 129, 1);color: white;float: left;margin-left: 60px;">注册</button>
        </form>
        </p>
    </div>

    <br><br><br>
    <div class="center-block" style="width: 70px;">
        <form action="passwordfind0.admin">
            <button type="submit" class="btn btn-default btn-sm ">找回密码</button>
        </form>
    </div>
    <%--<button type="button" onclick="showCustomer()">天气</button>--%>
  
  </body>
</html>
