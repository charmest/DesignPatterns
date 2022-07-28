package com.Facade;

public class OutOfStockException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OutOfStockException(String message) {
		super(message);
	}
}
