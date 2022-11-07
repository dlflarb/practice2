package com.itbank.model.account;

import java.sql.Date;

//IDX      NOT NULL NUMBER        
//USERID   NOT NULL VARCHAR2(20)  
//USERPW   NOT NULL VARCHAR2(150) 
//NICK     NOT NULL VARCHAR2(20)  
//NAME     NOT NULL VARCHAR2(20)  
//EMAIL    NOT NULL VARCHAR2(50)  
//JOINDATE          DATE   


public class AccountDTO {

	private int idx;
	private String userid,userpw,nick,name,email;
	private Date joinDate;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
	
	
}
