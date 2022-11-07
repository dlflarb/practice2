<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header.jsp" %>
	<article>
		<h4>${user.nick }님 마이페이지</h4>
		
		<form method="POST">
			<table border="1" cellspacing="0" cellpadding="5">
				<tr>
					<th>회원번호</th>
					<td>${user.idx }</td>
				</tr>
				
				<tr>
					<th>ID</th>
					<td>${user.userid }</td>
				</tr>
				
				<tr>
					<th>PW</th>
					<td>
						<input name="userpw" type="password" required>
					</td>
				</tr>
				
				<tr>
					<th>닉네임</th>
					<td>${user.nick }</td>
				</tr>
				
				<tr>
					<th>이름</th>
					<td>${user.name }</td>
				</tr>
				
				<tr>
					<th>이메일</th>
					<td>
						<input name="email" type="email" required value="${user.email }">
					</td>
				</tr>
				
				<tr>
					<th>가입일</th>
					<td>${user.joinDate }</td>
				</tr>
			</table>
	
			<br>
	
			<input name="idx" type="hidden" value="${user.idx }">
			
			<button>수정</button>
			
			<a href="${cpath }/delete/${user.idx }">
				<button type="button">삭제</button>
			</a>
		</form>
	</article>

<%@ include file = "../footer.jsp" %>