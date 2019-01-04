package com.dgbiztech.core.exception;

public class VerifyVersionException extends ApplicationException {

	private static final long serialVersionUID = 1L;

	public VerifyVersionException(String message) {
		super(ExceptionConstants.VERSION, message);
	}
}
