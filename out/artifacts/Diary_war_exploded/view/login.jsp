<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2015/9/14
  Time: 下午21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://"
          + request.getServerName() + ":" + request.getServerPort()
          + path + "/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta charset="utf-8" />
  <link rel="stylesheet" type="text/css" href="/css/login.css">
  <script  type="text/javascript" src="/js/jquery.js"></script>
  <script  type="text/javascript" src="/js/login.js"></script>
  <title>请登录</title><base target="_blank" />
</head>

<body class="b">
<div class="lg">
  <form action="#" method="POST">
    <div class="lg_top"></div>
    <div class="lg_main">
      <div class="lg_m_1">
        <input id="uname" name="username"  type="text" class="ur" />
        <input id="upass" name="password" type="password"  class="pw" />
      </div>
    </div>
    <div class="lg_foot">
      <s:form name="loginForm" action="login" method="POST" >
      <table >
        <tr>
          <td>
            <input type="button" value="登录" class="bn" id="loginbn"/>
          </td>
          <td>
            <input type="button" value="注册" class="bm" id="registerbn"/>
          </td>
        </tr>
      </table>
      </s:form>
    </div>
  </form>
</div>
</body>
</html>