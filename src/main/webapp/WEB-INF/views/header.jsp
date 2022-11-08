<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>     
    
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${cpath }/resources/css/Style.css" type="text/css" />
</head>
<body>
	<div class="userInfo">
		<c:if test="${not empty user }">
			${user.nick }님 어서오세요!
		</c:if>
	</div>
	
	<header>	
		<h1>
			<a href="${cpath}/">정보공유</a>
		</h1>
		
		<nav class="menu">
			<ul>				
				<li><a href="${cpath }">Home</a></li>
				<c:if test="${empty user }">
					<li><a href="${cpath }/account/login">로 그 인</a></li>
					<li><a href="${cpath }/account/signup">회 원 가 입</a></li>		
				</c:if>
				<c:if test="${not empty user }">
					<li><a href="${cpath }/account/mypage">내 정 보</a></li>
					<li><a href="${cpath }/account/logout">로 그 아 웃</a></li>			
				</c:if>
				<li><a href="${cpath }">게시판</a></li>				
			</ul>
		</nav>			
	</header>