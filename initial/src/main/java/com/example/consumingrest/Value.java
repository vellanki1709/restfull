package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.Setter;
import lombok.Getter;


@Getter 
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

  
  private Long id;
 

  public Value() {
  }
  
	
	/*
	 * public Long getId() { return this.id; }
	 * 
	 * public String getQuote() { return this.quote; }
	 * 
	 * public void setId(Long id) { this.id = id; }
	 * 
	 * public void setQuote(String quote) { this.quote = quote; }
	 */  
}