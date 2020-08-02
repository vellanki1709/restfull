package com.example.consumingrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.consumingrest.ConsumingRestApplication;
import com.example.consumingrest.Quote;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
class HelloController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/hello")
	public Quote helloContoller() {

		//String output = null;
		

		try {

			ConsumingRestApplication consumingRestApp = new ConsumingRestApplication();

			Quote quote = consumingRestApp.getQuote(restTemplate);
			return quote;
			
		
		} catch (Exception e) {
			
			e.printStackTrace();
			
			log.info(e.getMessage()+ ""+ "exception while consuming  get quote rest api");
		}

		return null;
	}
}
