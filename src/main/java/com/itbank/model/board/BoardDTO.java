package com.itbank.model.board;

import java.sql.Date;

//IDX        NOT NULL NUMBER        
//TITLE               VARCHAR2(100) 
//CONTENTS            CLOB          
//WRITER              VARCHAR2(50)  
//WRITE_DATE          DATE          
//VIEWCOUNT           NUMBER   

public class BoardDTO {
	
	private int idx, viewcount;
	private String title,contents,writer;
	Date write_date;
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}

}
