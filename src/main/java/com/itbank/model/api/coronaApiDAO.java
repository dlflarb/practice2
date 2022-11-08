package com.itbank.model.api;

import org.apache.ibatis.annotations.Select;

public interface coronaApiDAO {
	
	@Select("select DEF_CNT from "
			+ "where GUBUN='서울'")
	coronaApiDTO selectOne(coronaApiDTO dto);

}
