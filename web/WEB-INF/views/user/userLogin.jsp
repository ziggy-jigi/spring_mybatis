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
    <h2>로그인</h2>
    <form role="form" action="/api/userLogin" method="post">
        <sec:csrfInput/>
        <div class="mb-3 mt-3">
            <label for="email">이메일 아이디:</label>
            <input type="email" class="form-control" id="email" placeholder="Enter email" name="user_email">
        </div>
        <div class="mb-3">
            <label for="pwd">비밀번호:</label>
            <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="user_password">
        </div>

        <button type="submit" class="btn btn-primary">로그인</button>
    </form>
</div>
</body>
<script type="text/javascript">
    $(".btn-primary").on("click", function(e) {
        e.preventDefault();
        $("form").submit();
    });
</script>
</html>
