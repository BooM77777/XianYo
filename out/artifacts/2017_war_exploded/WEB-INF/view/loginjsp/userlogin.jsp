<%--
  Created by IntelliJ IDEA.
  User: 32936
  Date: 2017/9/6
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
<html>
<head>
    <title>用户登录界面</title>
</head>

<body>
<form action="user.login" method="post">
    UserName<input type="text" name="username"><br/>
    Password<input type="text" name="password"><br/>
    <input type="submit" value="登陆"><br/>
</form>

<form action="user.register" method="post">
    UserName<input type="text" name="username"><br/>
    Password<input type="text" name="password"><br/>
    Phonenumber<input type="text" name="phonenumber"><br/>
    Email<input type="text" name="email"><br/>
    <input type="submit" value="注册"><br/>
</form>

<form action="findpassword" method="post"/>

${registerMessage}

</body>

</html>
