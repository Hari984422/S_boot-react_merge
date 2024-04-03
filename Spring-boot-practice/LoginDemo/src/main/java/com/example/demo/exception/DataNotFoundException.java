package com.example.demo.exception;

public class DataNotFoundException extends RuntimeException{

	private String enity;
	private String attribute;
	private String value;
	
	
	
	public DataNotFoundException(String enity, String attribute, String value) {
		this.enity = enity;
		this.attribute = attribute;
		this.value = value;
	}
	public String getEnity() {
		return enity;
	}
	public void setEnity(String enity) {
		this.enity = enity;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	 
	
}
