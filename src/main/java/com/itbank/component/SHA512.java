package com.itbank.component;

import java.math.BigInteger;
import java.security.MessageDigest;

import org.springframework.stereotype.Component;

@Component					//스프링 빈으로 등록하는 어노테이션
public class SHA512 {

	public String getHash(String pw) throws Exception {
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		md.reset();		
		
		md.update(pw.getBytes("UTF-8"));	
		
		String hash = String.format("%0128x", new BigInteger(1, md.digest()));
		
		return hash;
	}		
	
}
