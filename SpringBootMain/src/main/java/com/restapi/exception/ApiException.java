package com.restapi.exception;

public class ApiException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	

	private String message;

	 public ApiException() {}

	 public ApiException(String msg)
	 {
	     super(msg);
	     this.message = msg;
	     //Optional Syso
	     System.out.println(message);
	 }
}
