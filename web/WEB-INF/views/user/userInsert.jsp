<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: sonbj
  Date: 2022-10-27
  Time: 오후 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="../header/header.jsp"%>

<div class="col-sm-4"></div>

<div class="container mt-3 col-sm-4">
    <h2>회원가입</h2>
    <form action="/api/userInsert" method="post">
        <sec:csrfInput/>
        <div class="mb-3 mt-3">
            <label for="email">이메일 아이디:</label>
            <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
        </div>
        <div class="mb-3">
            <label for="pwd">비밀번호:</label>
            <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
        </div>

        <button type="submit" class="btn btn-primary">회원가입</button>
    </form>
</div>

<div class="col-sm-4"></div>

</body>
</html>
