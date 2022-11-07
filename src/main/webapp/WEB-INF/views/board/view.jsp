<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>

	<hr>

	<article class="boardView">
		<table>
			<tr>
				<th>제목</th>
				<td colspan="5">${dto.idx }. ${dto.title }</td>		
			</tr>
			<tr>
				<th>작성자</th>
				<td>${dto.writer }</td>	
				<th>조회수</th>
				<td>${dto.viewcount }</td>	
				<th>작성일자</th>
				<td>${dto.write_date }</td>	
			</tr>
			
			<tr>
				<td colspan="6">
					<pre>${dto.contents }</pre>
				</td>
			</tr>
		</table>
		<br>
		<c:if test="${user.nick == dto.writer }">
		<button>수정</button>
		<button>삭제</button>
		</c:if>
	</article>
<%@include file="../footer.jsp" %>