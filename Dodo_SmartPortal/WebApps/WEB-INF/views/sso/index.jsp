<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String contextPath = request.getContextPath();
%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <title>로그인</title>
   
    <!-- Bootstrap core CSS -->
	<link href="<%=contextPath %>/resources/script/bootstrap/assets/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="<%=contextPath %>/resources/css/index/signin.css" rel="stylesheet">
  </head>
  <body class="text-center">
    <form class="form-signin">
  <img class="mb-4" src="<%=contextPath %>/resources/script/bootstrap/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
  <h1 class="h3 mb-3 font-weight-normal">
  	SmartWork 페이지
  </h1>
  <label for="inputEmail" class="sr-only">이메일 주소</label>
  <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
  <label for="inputPassword" class="sr-only">비밀번호</label>
  <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
  <div class="checkbox mb-3">
    <label>
      <input type="checkbox" value="remember-me"> 기억하기
    </label>
  </div>
  <button class="btn btn-lg btn-primary btn-block" type="submit">로그인</button>
  <p class="mt-5 mb-3 text-muted">&copy; 2020-2020</p>
</form>
</body>
</html>
