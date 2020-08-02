package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

  private String type;
  private Value chamu;

  public Quote() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Value getValue() {
    return chamu;
  }

  public void setValue(Value chamu) {
    this.chamu = chamu;
  }

@Override
public String toString() {
	return "Quote [type=" + type + ", chamu=" + chamu + "]";
}

  
  
}