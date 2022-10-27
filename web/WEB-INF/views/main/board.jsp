<%--
  Created by IntelliJ IDEA.
  User: sonbj
  Date: 2022-10-27
  Time: 오후 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="../header/header.jsp"%>

<div class="container mt-3">
  <h2>게시판이에요(지금은 하드코딩)</h2>
  <p>요구사항은.. 로그인가능하게 할 것, 기본적인 crud, 댓글, 답글, 파일첨부, 또 뭐가 있을까?</p>
  <table class="table">
    <thead>
    <tr>
      <th>글번호</th>
      <th>제목(댓글수)</th>
      <th>글쓴이</th>
      <th>조회수</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td>1</td>
      <td>글제목(3)</td>
      <td>지기</td>
      <td>34</td>
    </tr>
    <tr>
      <td>2</td>
      <td>글제목(3)</td>
      <td>지지지</td>
      <td>0</td>
    </tr>
    <tr>
      <td>3</td>
      <td>글제목(0)</td>
      <td>기기기</td>
      <td>0</td>
    </tr>
    </tbody>
  </table>
</div>
</body>
</html>
