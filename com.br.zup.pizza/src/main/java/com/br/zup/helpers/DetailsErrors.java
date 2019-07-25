package com.br.zup.helpers;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class DetailsErrors {
	private int Status;
	private Date date;
	private String origin;
	
	private String message;
	public DetailsErrors( HttpStatus status, String origin, String message) {
		super();
		Status = status.value();
		this.date = new Date();
		this.origin = origin;
		this.message = message;
	}
	public int getStatus() {
		return Status;
	}
	public Date getDate() {
		return date;
	}
	public String getOrigin() {
		return origin;
	}
	public String getMessage() {
		return message;
	}
	
	
	
}
