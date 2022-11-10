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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class CoronaApiService {

	public Map<String, Object> CoronaService() throws Exception{
		
		  Date now = new Date();
		  SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		  Calendar cal1 = Calendar.getInstance();
		  Calendar cal7 = Calendar.getInstance();
		  cal1.setTime(now);
		  cal1.add(cal1.DATE, -1);
		  cal7.add(cal7.DATE, -7);		  
		  String now1 = formatter.format(cal1.getTime());	
		  String now7 = formatter.format(cal7.getTime());
		  StringBuilder sb1 = new StringBuilder();
		  StringBuilder sb2 = new StringBuilder();
		  StringBuilder sb3 = new StringBuilder();
		  StringBuilder sb4 = new StringBuilder();
		  StringBuilder sb5 = new StringBuilder();
		  StringBuilder sb6 = new StringBuilder();
		  StringBuilder sb7 = new StringBuilder();
		  
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
				        sb1 = sb1.append(line);	
				        sb2 = sb2.append(line);	
				        sb3 = sb3.append(line);	
				        sb4 = sb4.append(line);	
				        sb5 = sb5.append(line);	
				        sb6 = sb6.append(line);	
				        sb7 = sb7.append(line);	 
				    }
		    rd.close();
		    conn.disconnect();
		    
		    
			String pointString = "Seoul";
			
			List<Integer> intList = new ArrayList<>();
			
			int index = sb1.indexOf(pointString);
			
			while(index > -1) {
				intList.add(index+23);			
				index = sb1.indexOf(pointString, index + 1);
			}
			
			
			
			System.out.println(intList.get(0));		
			System.out.println(Arrays.toString(intList.toArray()));
			int s1=intList.get(0);
			int s2=intList.get(1);
			int s3=intList.get(2);
			int s4=intList.get(3);
			int s5=intList.get(4);
			int s6=intList.get(5);
			int s7=intList.get(6);
			System.out.println(sb1.toString());
//			System.out.println(s+e);
			sb1.delete(0, s1);
			sb1.delete(5, 100000);
			sb2.delete(0, s2);
			sb2.delete(5, 100000);
			sb3.delete(0, s3);
			sb3.delete(5, 100000);
			sb4.delete(0, s4);
			sb4.delete(5, 100000);
			sb5.delete(0, s5);
			sb5.delete(5, 100000);
			sb6.delete(0, s6);
			sb6.delete(5, 100000);
			sb7.delete(0, s7);
			sb7.delete(5, 100000);
			
			String opStr1 = sb1.toString().replaceAll("[^0-9]", "");
			String opStr2 = sb2.toString().replaceAll("[^0-9]", "");
			String opStr3 = sb3.toString().replaceAll("[^0-9]", "");
			String opStr4 = sb4.toString().replaceAll("[^0-9]", "");
			String opStr5 = sb5.toString().replaceAll("[^0-9]", "");
			String opStr6 = sb6.toString().replaceAll("[^0-9]", "");
			String opStr7 = sb7.toString().replaceAll("[^0-9]", "");
			
			int opInt1 =Integer.parseInt(opStr1);
			int opInt2 =Integer.parseInt(opStr2);
			int opInt3 =Integer.parseInt(opStr3);
			int opInt4 =Integer.parseInt(opStr4);
			int opInt5 =Integer.parseInt(opStr5);
			int opInt6 =Integer.parseInt(opStr6);
			int opInt7 =Integer.parseInt(opStr7);
			int opIntAll = opInt1+opInt2+opInt3+opInt4+opInt5+opInt6+opInt7;
			
			//[6219, 12808, 19413, 26020, 32630, 39239, 45852]
			//[6243, 12808, 19413, 26020, 32630, 39239, 45852]
			//[6243, 12832, 19437, 26044, 32654, 39263, 45876]
//			sb.delete(0, 6196);
//			sb.delete(27, 100000);
		    System.out.println(opInt1);
		    System.out.println(opInt2);
		    System.out.println(opInt3);
		    System.out.println(opInt4);
		    System.out.println(opInt5);
		    System.out.println(opInt6);
		    System.out.println(opInt7);
		    System.out.println(opIntAll);	
		    
		    String opIntAllStr = Integer.toString(opIntAll);
		
		    Map<String, Object> map = new HashMap<String, Object>();
		    map.put("opIntAllStr", opIntAllStr);		
		
		return map;
		
	}
}
