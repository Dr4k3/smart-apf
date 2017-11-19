package edu.fatec.smartapf.domain.core;

public class APFException extends RuntimeException {

	private static final long serialVersionUID = 2332652679961209398L;

	public APFException() {
	}

	public APFException(String message) {
		super(message);
	}

	public APFException(Throwable cause) {
		super(cause);
	}

	public APFException(String message, Throwable cause) {
		super(message, cause);
	}

	public APFException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
