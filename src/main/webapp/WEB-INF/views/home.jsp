<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="header.jsp" %>

        <article>
            <img src="${cpath }/resources/src/back.png" width="100%">
        </article>
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
                
	          <c:forEach var="dto" items="${list }"> 
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
			<br>
	
			<a href="${cpath }/board/list/1">
				<button>전체보기</button>
			</a>	
        </article>


<%@ include file="footer.jsp" %>
