package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.board.BoardDTO;
import com.itbank.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService bs;
	
	@GetMapping("/list/{page}")
	public ModelAndView getBoardList(@PathVariable int page) {
		ModelAndView mav = new ModelAndView("/board/list");
		mav.addObject("map", bs.getBoardList(page));
		
		return mav;
	}
	
	@GetMapping("view")
	public ModelAndView view(int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("dto", bs.getBoard(idx));
		
		return mav;
	}
	
	@GetMapping("write")
	public void write() {}
	
	@PostMapping("write")
	public String write(BoardDTO dto) {
		
		int idx = bs.writeBoard(dto);		
		
		
		return "redirect:/board/view?idx=" + idx;
	}

}
