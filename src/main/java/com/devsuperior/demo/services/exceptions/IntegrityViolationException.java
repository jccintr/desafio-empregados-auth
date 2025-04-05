package com.devsuperior.demo.services.exceptions;

public class IntegrityViolationException extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IntegrityViolationException(Object id) {
		super("Referential integrity constraint violation for Id: " + id);
	}
}

