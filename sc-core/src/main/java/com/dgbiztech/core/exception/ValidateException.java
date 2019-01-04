package com.dgbiztech.core.exception;

public class ValidateException extends ApplicationException {

	private static final long serialVersionUID = 1L;

	public ValidateException(String message) {
		super(ExceptionConstants.VALIDATE_FAIL, message);
	}

}
