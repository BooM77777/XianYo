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
    <title>啦啦啦啦我也不知道这什么页面</title>
    <link href="../../../static/css/regist.css" rel="stylesheet" type="text/css">
    <link href="../../../static/css/login.css" rel="stylesheet" type="text/css">
    <link href="../../../static/icon/fish.ico" rel="shortcut icon " type="images/x-icon">
    <script src="../../../static/js/loginandregister.js"></script>
    <script src="../../../static/js/buttonclick.js"></script>
</head>
<body>
<%--登陆--%>
<%--<form action="user.login" method="post">--%>
<%--UserName<input type="text" name="username"><br/>--%>
<%--Password<input type="text" name="password"><br/>--%>
<%--<input type="submit" value="登陆"><br/>--%>
<%--</form>--%>
<%--<form action="user.findpassword" method="post">--%>
<%--<input type="submit" value="找回密码"><br/>--%>
<%--</form>--%>
<h1>${loginMessage}</h1>


<button onclick="document.getElementById('id01').style.display='block'" style="width:auto;background-color:rgba(94, 163, 129, 1)">登录</button>
<div id="id01" class="modal" >

    <form class="modal-content animate" action="user.login" method="post">
        <div class="imgcontainer">
            <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
            <img src="../../../static/image/fishme.png" alt="Avatar" class="avatar">
        </div>

        <div class="container">
            <label><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="username"
                   id="username"  required>

            <label><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="password"
                   id="password"  required>
            <span id="loginmessage"></span>

            <button type="submit" style="background-color:rgba(94, 163, 129, 1)" id="submit">登陆</button>
            <input type="checkbox" checked="checked" name="sessionflag"> 记住我
        </div>

        <div class="container" style="background-color:#f1f1f1">
            <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
            <span class="psw">Forgot <a href="#">password?</a></span>
        </div>
    </form>
</div>

<h1>${registerMessage}</h1>

<%--注册--%>
<button onclick="document.getElementById('id02').style.display='block'" style="width:auto;background-color:rgba(94, 163, 129, 1)">注册</button>
<div id="id02" class="modal">

    <form class="modal-content animate" action="user.register" method="post">
        <div class="imgcontainer">
            <span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal">&times;</span>
            <img src="../../../static/image/fishme.png" alt="Avatar" class="avatar">
        </div>

        <div class="container">
            <label><b>Email</b></label>
            <input type="text" placeholder="Enter Email" name="email"
                   id="mail" onblur="checkmail()" required>
            <span id="checkmail"></span><br/>
            <span id="mailya"></span>
            <br/>

            <label><b>Phone number</b></label>
            <input type="text" placeholder="Enter phone number" name="phonenumber"
                   id="phonenumber" onblur="checkphonenumber()" required>
            <span id="checkphonenumber"></span><br/>
            <span id="phonenumberya"></span>
            <br/>

            <label><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="username"
                   id="regname" onblur="checkname()"  required/>
            <span id="checkname"></span><br/>
            <label><b>Password</b></label>

            <input type="password" placeholder="Enter Password" name="password" id="thepassword" required>

            <label><b>Repeat Password</b></label>
            <input type="password" placeholder="Repeat Password" name="password-repeat"
                   id="secondpassword" onkeyup="checkpassword()" required>
            <span id="checkpassword"></span>

            <button type="submit" style="background-color:rgba(94, 163, 129, 1)" onclick="warn()">确认注册</button>
            <input type="checkbox" checked="checked" name="sessionflag" required> 记住我
        </div>

        <div class="container" style="background-color:#f1f1f1">
            <button type="button" onclick="document.getElementById('id02').style.display='none'" class="cancelbtn">Cancel</button>
            <span class="psw"> <a href="#">agree to our Terms & Privacy.</a></span>

        </div>
    </form>
</div>

</body>

</html>
