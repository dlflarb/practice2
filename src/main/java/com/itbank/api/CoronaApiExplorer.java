package com.itbank.api;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.service.ApiAccessService;



@Controller
@RequestMapping("api/")
public class CoronaApiExplorer {
	
	@Autowired  
	private ApiAccessService apiservice;  
	  
		@GetMapping(value = "coronavalue" )
	    public ResponseEntity CoronaInfo() throws Exception {
			
		return apiservice.CoronaApiService();
	}		
        
    
}