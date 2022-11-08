package com.itbank.api;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.io.BufferedReader;
import java.io.IOException;

public class CoronaApiExplorer {
    public static void main(String[] args) throws IOException {
		
    	
		  Date now = new Date();
		  SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		  Calendar cal1 = Calendar.getInstance();
		  Calendar cal8 = Calendar.getInstance();
		  cal1.setTime(now);
		  cal1.add(cal1.DATE, -1);
		  cal8.add(cal8.DATE, -8);
		  
		  String now1 = formatter.format(cal1.getTime());
//		  String date1 = formatter.format(now1);		  
		  System.out.println(now1);
		  
		  String now8 = formatter.format(cal8.getTime());
		  System.out.println(now8);
//		  System.out.println(date1);
		  
//		  System.out.println(now1);
		  
        StringBuilder urlBuilder = new StringBuilder("http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19SidoInfStateJson"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=Ejb7y5zJZ7nnXcxN3QJYbxOcY2sCGqSN578LERVJk9n4Dx1bCrs9Thf455vZmp7RrSx7XVBIbUpp0mcx3nlT%2Fw%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("startCreateDt","UTF-8") + "=" + URLEncoder.encode("20221101", "UTF-8")); /*검색할 생성일 범위의 시작*/
        urlBuilder.append("&" + URLEncoder.encode("endCreateDt","UTF-8") + "=" + URLEncoder.encode("20221107", "UTF-8")); /*검색할 생성일 범위의 종료*/
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
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
    }
}