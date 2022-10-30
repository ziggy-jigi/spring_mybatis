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
            <input type="email" class="form-control" id="email" placeholder="Enter email" name="user_email">
        </div>
        <div class="mb-3">
            <label for="pwd">비밀번호:</label>
            <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="user_password">
        </div>
        <div class="mb-3">
            <label for="name">이름:</label>
            <input type="text" class="form-control" id="name" placeholder="Enter name" name="user_name">
        </div>

        <button type="submit" class="btn btn-primary">회원가입</button>
    </form>
</div>
<p>해야할 일 : </p>
<p>이메일 아이디 중복 체크 프라이머리키</p>
<p>공백 입력시 에러나는데 이것도 해결</p>
<p>비밀번호 암호화</p>
<p></p>
<div class="col-sm-4"></div>

</body>
</html>
