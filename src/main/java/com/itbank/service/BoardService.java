package com.itbank.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.board.BoardDAO;
import com.itbank.model.board.BoardDTO;

@Service
public class BoardService {

	
	@Autowired
	private BoardDAO dao;
	
	public List<BoardDTO> getBoardMain() {
		return dao.selectMain();
	}
	
	public Map<String, Object> getBoardList(int page) {
		
		int perPage = 10;
		int offset = (page - 1) * perPage;
		
		int boardCount = dao.countAll();
		int totalPage = boardCount / perPage;
		
		totalPage += (totalPage % 10 == 0) ? 0 : 1;
		
		int section = (page - 1) / 10;
		int begin = section * 10 + 1;
		int end = (section + 1) * 10;
		
		int abc = 3;
		
		end = (end > totalPage) ? totalPage : end;
		
		boolean next = end != totalPage;
		boolean prev = section != 0;
		

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("perPage", perPage);
		map.put("offset", offset);
		map.put("begin", begin);
		map.put("end", end);
		map.put("next", next);
		map.put("prev", prev);
		
		
		map.put("list", dao.selectAll(map));
		return map;
	}
	
	

	public int writeBoard(BoardDTO dto) {
		dao.insert(dto);
		int idx = dao.getIdx();
		
		return idx;
		
	}
	
	public BoardDTO getBoard(int idx) {
		return dao.selectOne(idx);
	}
}
