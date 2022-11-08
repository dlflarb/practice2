package com.itbank.model.api;

import org.apache.ibatis.annotations.Select;

public interface CoronaApiDAO {
	
	@Select("select DEF_CNT from "
			+ "where GUBUN='서울'")
	CoronaApiDTO selectOne(CoronaApiDTO dto);

}
