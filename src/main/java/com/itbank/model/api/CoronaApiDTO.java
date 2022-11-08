package com.itbank.model.api;

import java.util.Date;

public class CoronaApiDTO {
	private String ServiceKey, resultMsg, GUBUN, DEF_CNT;
	private int pageNo, nymOfRows, resultCode, numOfRows, totalCount, SEQ, DEATH_CNT;
	private Date startCreateDt, endCreateDt, CREATE_DT ;
	public String getServiceKey() {
		return ServiceKey;
	}
	public void setServiceKey(String serviceKey) {
		ServiceKey = serviceKey;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getGUBUN() {
		return GUBUN;
	}
	public void setGUBUN(String gUBUN) {
		GUBUN = gUBUN;
	}
	public String getDEF_CNT() {
		return DEF_CNT;
	}
	public void setDEF_CNT(String dEF_CNT) {
		DEF_CNT = dEF_CNT;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getNymOfRows() {
		return nymOfRows;
	}
	public void setNymOfRows(int nymOfRows) {
		this.nymOfRows = nymOfRows;
	}
	public int getResultCode() {
		return resultCode;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	public int getNumOfRows() {
		return numOfRows;
	}
	public void setNumOfRows(int numOfRows) {
		this.numOfRows = numOfRows;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getSEQ() {
		return SEQ;
	}
	public void setSEQ(int sEQ) {
		SEQ = sEQ;
	}
	public int getDEATH_CNT() {
		return DEATH_CNT;
	}
	public void setDEATH_CNT(int dEATH_CNT) {
		DEATH_CNT = dEATH_CNT;
	}
	public Date getStartCreateDt() {
		return startCreateDt;
	}
	public void setStartCreateDt(Date startCreateDt) {
		this.startCreateDt = startCreateDt;
	}
	public Date getEndCreateDt() {
		return endCreateDt;
	}
	public void setEndCreateDt(Date endCreateDt) {
		this.endCreateDt = endCreateDt;
	}
	public Date getCREATE_DT() {
		return CREATE_DT;
	}
	public void setCREATE_DT(Date cREATE_DT) {
		CREATE_DT = cREATE_DT;
	}
	
}
