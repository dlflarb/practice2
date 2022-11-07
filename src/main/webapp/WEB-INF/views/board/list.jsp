<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="../header.jsp" %>

		 <article class="board">
			<table>
                <caption>
                    <h3>ITBANK 자유 게시판</h3>

                </caption>
                <tr>
                    <th>글 번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>조회수</th>
                    <th>작성일</th>
                </tr>
                
	            <c:forEach var="dto" items="${map['list'] }">
	                <tr>
	                    <td>${dto.idx }</td>
	                    <td class="title">
		                    <a href="${cpath }/board/view?idx=${dto.idx }">
		                    	${dto.title }
		                    </a>	
	                    </td>
	                    <td>${dto.writer }</td>
	                    <td>${dto.viewcount }</td>
	                    <td>${dto.write_date }</td>
	                </tr>           
				</c:forEach>
			 </table>
			 
	       	<nav class="page">
				<ul>
					<c:if test="${map['prev'] }">
					<li>
						<a href="${map['begin'] - 1 }">이전</a>
					</li>
					</c:if>
				
					<c:forEach var="i" begin="${map['begin'] }" end="${map['end'] }" step="1">
					<li>
						<a href="${cpath }/board/list/${i }">${i }</a>
					</li>
					</c:forEach>
					
					<c:if test="${map['next'] }">
					<li>
						<a href="${map['end'] + 1}">다음</a>
					</li>
					</c:if>
				</ul>
			</nav>	
			
			<a href="${cpath }/board/write">
				<button>글작성</button>
			</a>
		</article>
</body>
</html>