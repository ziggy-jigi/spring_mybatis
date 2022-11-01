<%--
  Created by IntelliJ IDEA.
  User: sonbj
  Date: 2022-10-27
  Time: 오후 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link active" href="/">[인텔리제이+스프링 프로젝트]</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/api/goBoard">게시판</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/api/goBoardGuest">방명록</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/api/goBoardNotice">공지사항</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">마이바티스 및 조인문 연습하려고 하는데 어떤 기능을 할지...</a>
      </li>
    </ul>
    <ul class="navbar-nav navbar-right">
      <li class="nav-item">
        <a class="nav-link" href="/api/goUserLogin">로그인</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/api/goUserInsert">회원가입</a>
      </li>
    </ul>
  </div>
</nav>
</body>
</html>
