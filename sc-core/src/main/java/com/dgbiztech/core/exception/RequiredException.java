package com.dgbiztech.core.exception;

public class RequiredException extends ApplicationException {

	private static final long serialVersionUID = 1L;

	public RequiredException(String message) {
		super(ExceptionConstants.REQUIRED,message);
	}

}
