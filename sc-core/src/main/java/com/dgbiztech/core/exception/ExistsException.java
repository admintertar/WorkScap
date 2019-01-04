package com.dgbiztech.core.exception;

public class ExistsException extends ApplicationException {

	private static final long serialVersionUID = 1L;

	public ExistsException(String message) {
		super(ExceptionConstants.EXISTS, message);
	}

}
