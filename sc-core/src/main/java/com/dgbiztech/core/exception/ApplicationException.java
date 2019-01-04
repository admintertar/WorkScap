package com.dgbiztech.core.exception;

public class ApplicationException extends RuntimeException {
    
	private static final long serialVersionUID = 1L;

	private String code;

	public ApplicationException(String code, String message) {
		super(message);
		this.code = code;
	}
	
	public ApplicationException(String code) {
		super(code);
		this.code = code;
	}
	
	public ApplicationException( String message,Throwable cause) {
		super(message,cause);
	}
	
	public ApplicationException(Throwable cause) {
		super(cause);
	}
	

	public String getCode() {
		return code;
	}

}
