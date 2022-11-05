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
<%--    <sec:csrfInput/>--%>
    <div class="mb-3 mt-3">
        <label for="email">이메일 아이디:</label>
        <input type="email" class="form-control" id="email" placeholder="Enter email" name="user_email">
        <button id="insertUserCheck" class="btn btn-warning">이메일_아이디 중복 체크</button>
    </div>
    <div class="mb-3">
        <label for="pwd">비밀번호:</label>
        <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="user_password">
    </div>
    <div class="mb-3">
        <label for="name">이름:</label>
        <input type="text" class="form-control" id="name" placeholder="Enter name" name="user_name">
    </div>

    <button id="insertUser" class="btn btn-primary">회원가입</button>


</div>
<p>해야할 일 : </p>
<p>(해결)1.이메일 아이디 중복 체크</p>
<p>(해결_했으나 좀 아름답게 짜보자..)2.공백 입력시 false 처리</p>
<p>3.비밀번호 암호화</p>
<p>4.이메일 아이디 좀 올바르게 ~~~@~~~.com 형식 맞춰서 데이터 넣을 수 있게</p>
<p>5.비밀번호 글자 수 3자리 이상(특수문자는 구현만 해놓고 주석처리)</p>
<p>6.이름은 3글자 이상(이름도 중복체크 해야하나....?)--> 그냥 화면단에서 가능할듯</p>
<p>7.좀 다양한 컬럼들 추가 시켜서 디비 디비 좀 더 아름답게</p>
<p>js 밖으로 빼려면 리소스폴더에 넣나 아님 웹폴더에 넣나.......??</p>
<div class="col-sm-4"></div>

</body>
</html>

<script>
    let token = $("meta[name='_csrf']").attr("content");
    let header = $("meta[name='_csrf_header']").attr("content");

    $(function() {
        $(document).ajaxSend(function(e, xhr, options) {
            xhr.setRequestHeader(header, token);
        });
    });

    $('#insertUserCheck').click(function () {
        const userEmail = $('#email').val();

        if(userEmail == ''){
            alert('적고 ~')
            return false;
        }

        $.ajax({
            type :'POST',
            url: '/api/user/userInsertCheck',
            data:  {
                userEmail : userEmail
            },
            dataType: "json",
            beforeSend: function (xhr) {
                xhr.setRequestHeader(header, token);
            },
            success : function (result){
                if(result == 1){
                    alert('사용불가능')
                }else{
                    alert('사용가능')
                }
            }
        })
    });

    $('#insertUser').click(function (){
        if(document.getElementById('email').value == ''){
            alert('email 공백');
            return false;
        }else if(document.getElementById('pwd').value == ''){
            alert('pwd 공백');
            return false;
        }else if(document.getElementById('name').value == ''){
            alert('name 공백');
            return false;
        }
        return true;


        // const userEmail = $('#email').val();
        // const pwd = $('#pwd').val();
        // const name = $('#name').val();
        //
        // $.ajax({
        //
        // })


    })

    // function submitIdCheck(){
    //     if(document.getElementById('email').value == ''){
    //
    //     }
    // }
    // function submitNullCheck(){ // 왜 fn 이름을 submit()으로 하면 에러가 나지.....?
    //     if(document.getElementById('email').value == ''){
    //         alert('email 공백');
    //         return false;
    //     }else if(document.getElementById('pwd').value == ''){
    //         alert('pwd 공백');
    //         return false;
    //     }else if(document.getElementById('name').value == ''){
    //         alert('name 공백');
    //         return false;
    //     }
    //     return true;
    // }
</script>