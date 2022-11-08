package com.itbank.service;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ApiAccessServiceImpl implements ApiAccessService{

	@Override
	public ResponseEntity CoronaApiService() throws Exception {
		
		
		
		Date now = new Date();
		  SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		  Calendar cal1 = Calendar.getInstance();
		  Calendar cal7 = Calendar.getInstance();
		  cal1.setTime(now);
		  cal1.add(cal1.DATE, -1);
		  cal7.add(cal7.DATE, -7);		  
		  String now1 = formatter.format(cal1.getTime());	
		  String now7 = formatter.format(cal7.getTime());
		  StringBuilder sb = new StringBuilder();
		  
	try {
	    StringBuilder urlBuilder = new StringBuilder("http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19SidoInfStateJson"); /*URL*/
	    urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=Ejb7y5zJZ7nnXcxN3QJYbxOcY2sCGqSN578LERVJk9n4Dx1bCrs9Thf455vZmp7RrSx7XVBIbUpp0mcx3nlT%2Fw%3D%3D"); /*Service Key*/
	    urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
	    urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
	    urlBuilder.append("&" + URLEncoder.encode("startCreateDt","UTF-8") + "=" + URLEncoder.encode(now7, "UTF-8")); /*검색할 생성일 범위의 시작*/
	    urlBuilder.append("&" + URLEncoder.encode("endCreateDt","UTF-8") + "=" + URLEncoder.encode(now1, "UTF-8")); /*검색할 생성일 범위의 종료*/
	    
	    URL url = new URL(urlBuilder.toString());
	    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	    conn.setRequestMethod("GET");
	    conn.setRequestProperty("Content-type", "application/json");
	    System.out.println("Response code: " + conn.getResponseCode());
	    BufferedReader rd;
		    if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
		        rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		    } else {
		        rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		    }
	  
	    String line;
			    while ((line = rd.readLine()) != null) {
			        sb.append(line);
			    }
	    rd.close();
	    conn.disconnect();
	} catch (Exception e) {
			  throw new Exception();
			}
	
		String pointString = "Seoul";
		
		List<Integer> intList = new ArrayList<>();
		
		int index = sb.indexOf(pointString);
		
		while(index > -1) {
			intList.add(index+24);			
			index = sb.indexOf(pointString, index + 1);
		}
		
		System.out.println(Arrays.toString(intList.toArray()));
		
		//[6219, 12808, 19413, 26020, 32630, 39239, 45852]
		//[6243, 12808, 19413, 26020, 32630, 39239, 45852]
//		sb.delete(0, 6196);
//		sb.delete(27, 100000);
	    System.out.println(sb.toString());
	    
	  
	    return ResponseEntity.ok().body(sb);
	}

	
}
