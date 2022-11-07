<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header.jsp" %>
<%-- 	<c:if test="${empty user }">
		<c:redirect url="/account/login"/>
	</c:if> --%>
	
	
	<article class="boardWrite">
		<form method="POST">
			<table>
				<tr>
					<th>제목</th>
					<td>
						<input name="title" required>
					</td>
				</tr>
				
				<tr>
					<td colspan="2">
						<textarea name="contents"></textarea>
					</td>
				</tr>		
			</table>
			
			<input name="writer" type="hidden" value="${user.nick }">
			
			
			
			<button>작성</button>
			
		</form>
	</article>
<%@ include file = "../footer.jsp" %>