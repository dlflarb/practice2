package com.itbank.model.account;

import org.apache.ibatis.annotations.Select;

public interface AccountDAO {

	@Select("select * from account "
			+ "where userid = #{userid} and userpw = #{userpw}")
	AccountDTO selectOne(AccountDTO dto);

	
	int insert(AccountDTO dto);

}
