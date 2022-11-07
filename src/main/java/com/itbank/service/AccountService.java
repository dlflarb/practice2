package com.itbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.component.SHA512;
import com.itbank.model.account.AccountDAO;
import com.itbank.model.account.AccountDTO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO dao;	
	
	@Autowired
	private SHA512 sha;	
	
	
	public AccountDTO login(AccountDTO dto) throws Exception {	
		String pw = dto.getUserpw();
		String hash = sha.getHash(pw);
		
		dto.setUserpw(hash);
		
		return dao.selectOne(dto);		
	}

	public int signup(AccountDTO dto) throws Exception {
		
		
		
		String pw = dto.getUserpw();
		String hash = sha.getHash(pw);
		
		dto.setUserpw(hash);
		 
		return dao.insert(dto);
		
	}
	
}
