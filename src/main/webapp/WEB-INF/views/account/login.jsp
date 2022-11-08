<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header.jsp" %>

<link href="${cpath }/resources/css/member/login.css" type="text/css" rel="stylesheet">


<script type="text/javascript" src="${cpath }/resources/js/member/login_userJoin.js"></script>
<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
<script type="text/javascript" src="https://static.nid.naver.com/js/naveridlogin_js_sdk_2.0.0.js" charset="utf-8"></script>

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
				
				<p class="snsLogTit">SNS 계정으로 로그인</p>
			</form>
			
			<a  href="javascript:loginWithKakao()"  class="clickBtn kakao mouseHand">카카오 로그인</a>	

		</fieldset>
	
	
	
	
	</article>		
<%@ include file = "../footer.jsp" %>