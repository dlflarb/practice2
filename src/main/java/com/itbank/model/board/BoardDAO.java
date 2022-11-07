package com.itbank.model.board;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


public interface BoardDAO {
	
	@Select("select * from board " + 
			"where rownum <=5 "	+
			"order by idx desc " 				
			)
	List<BoardDTO> selectMain();

	@Select("select * from board " + 
			"order by idx desc " + 
			"offset #{offset} rows " + 
			"fetch first #{perPage} rows only")
	List<BoardDTO> selectAll(Map<String, Object> map);
	
	@Select("select count(*) from board")
	int countAll();

	@Select("select * from board where idx=#{idx}")
	BoardDTO selectOne(int idx);

	@Insert("insert into "
			+ "board(title, contents, writer) "
			+ "values(#{title}, #{contents}, #{writer})")
	int insert(BoardDTO dto);

	@Select("select idx from board where rownum = 1 order by idx desc")
	int getIdx();
	
}
