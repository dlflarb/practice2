package com.itbank.api;



import java.io.PrintWriter;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.service.ApiAccessService;



@Controller
@RequestMapping("home")
public class CoronaApiExplorer {
	
	@Autowired  
	private ApiAccessService apiservice;  
	  
		@GetMapping(value = "coronavalue" )
	    public ResponseEntity CoronaInfo() throws Exception {
				
			
					
		return apiservice.CoronaApiService();
	}		
        
    
}