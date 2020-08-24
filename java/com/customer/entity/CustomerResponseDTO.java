package com.customer.entity;

public class CustomerResponseDTO {
	
	private int statusCode;
	private String message;

	/**
	 * Default constructor.
	 *
	 */
	public CustomerResponseDTO() {
	}

	/**
	 * Parameterized constructor.
	 *
	 */
	public CustomerResponseDTO(int statusCode, String message) {
		this.setStatusCode(statusCode);
		this.setMessage(message);
	}

	/**
	 * Returns the status code of the request.
	 *
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * Sets the status code of the request.
	 *
	 * @param badRequest the statusCode to set
	 */
	public void setStatusCode(int badRequest) {
		this.statusCode = badRequest;
	}

	/**
	 * Returns the message of the request.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message of the request.
	 *
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{" + "\"statusCode\":" + statusCode + "," + "\"message\":\"" + message + "\"" + "}";
	}

}
