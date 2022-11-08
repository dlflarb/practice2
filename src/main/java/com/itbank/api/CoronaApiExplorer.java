package com.itbank.api;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itbank.model.api.CoronaApiDTO;
import com.itbank.service.ApiAccessService;

import java.io.BufferedReader;
import java.io.IOException;

@RestController
@RequestMapping("/api")
public class CoronaApiExplorer {
	  private ApiAccessService apiservice;  
	  
		@GetMapping
	    public ReponseEntity CoronaInfo() {
			
		return apiservice.CoronaApiService();
	}		
        
    
}