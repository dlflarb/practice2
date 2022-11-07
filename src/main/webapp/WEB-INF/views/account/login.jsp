<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header.jsp" %>
	<hr>
	<article class="inputForm">
	
		<fieldset>
			<legend>Login</legend>
			
			<form method="POST">
				<input name="userid" placeholder="ID" required>
				<input name="userpw" type="password" placeholder="PW" required>
				
				<div>
					<button>로그인</button>
					<button type="button" onclick="location.href='${cpath }/account/signup'">회원가입</button>
				</div>
			
			</form>
		</fieldset>
	
	
	
	
	</article>		
<%@ include file = "../footer.jsp" %>