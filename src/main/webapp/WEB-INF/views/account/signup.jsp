<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header.jsp" %>
	<hr>
	<article class="inputForm">
		<h4 class="">회      원      가      입</h4>		
		<form method="POST">
			<table>
				<tr>
					<th>아이디</th>
					<td>
						<input name="userid" placeholder="ID" required>
					</td>
				<tr>
				<tr>
					<th>비밀번호</th>
					<td>
						<input name="userpw" type="password" placeholder="PW" required>
					</td>
				<tr>
				<tr>
					<th>닉네임</th>
					<td>
						<input name="nick" placeholder="닉네임" required>
					</td>
				<tr>
				<tr>
					<th>이름</th>
					<td>
						<input name="name" placeholder="이름" required>
					</td>
				<tr>
				<tr>
					<th>이메일</th>
					<td>
						<input name="email" type="email" placeholder="이메일" required>
					</td>
				<tr>		
			</table>
			<br>
			<button class="submit"> 회원가입 </button>
		</form>
	
	</article>		
<%@ include file = "../footer.jsp" %>




