package com.dgbiztech.core.exception;

public class NotExistsException extends ApplicationException {

	private static final long serialVersionUID = 1L;

	public NotExistsException(String message) {
		super(ExceptionConstants.EXISTS,message);
	}

}
