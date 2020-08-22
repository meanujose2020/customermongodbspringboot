package com.customer.controller;

import org.springframework.http.HttpStatus;

import com.vz.cpi.common.CPIMessages;

public class RestException extends Exception {

	private static final long serialVersionUID = 1L;

	  private String className;
	  private String method;
	  private int errorCode;
	  private HttpStatus httpStatusCode;
	  private CPIMessages cpiMessages = null;

	  public int getErrorCode() {
	    return errorCode;
	  }

	  public CPIMessages getCpiMessages() {
	    return cpiMessages;
	  }

	  /**
	   * Use to set the CPI Message, which will contain the error description.
	   * 
	   * @param message
	   *          This is message.
	   */
	  public RestException(String message) {
	    super(message);
	    cpiMessages = new CPIMessages(message);
	  }

	  public RestException(Throwable cause) {
	    super(cause);
	  }

	  /**
	   * <br>
	   * Use to set the CPI Message, which will contain the error description.
	   * 
	   * @param cpiMessages
	   *          This is message.
	   */
	  public RestException(HttpStatus httpStatusCode, int errorCode, CPIMessages cpiMessages, Throwable cause) {
	    super(cause);
	    this.httpStatusCode = httpStatusCode;
	    this.cpiMessages = cpiMessages;
	    this.errorCode = errorCode;
	  }

	  /**
	   * <br>
	   * Use to set the CPI Message, which will contain the error description.
	   * 
	   * @param cpiMessage
	   *          This is message.
	   */
	  public RestException(HttpStatus httpStatusCode, int errorCode, String cpiMessage) {
	    this.httpStatusCode = httpStatusCode;
	    this.cpiMessages = new CPIMessages(cpiMessage);
	    this.errorCode = errorCode;
	  }

	  /**
	   * <br>
	   * Use to set the CPI Message, which will contain the error description.
	   * 
	   * @param messages
	   *          This is message.
	   */
	  public RestException(HttpStatus httpStatusCode, int errorCode, String messages, Throwable cause) {
	    super(cause);
	    this.httpStatusCode = httpStatusCode;
	    this.cpiMessages = new CPIMessages(messages);
	    this.errorCode = errorCode;

	  }

	  public HttpStatus getHttpStatusCode() {
	    return httpStatusCode;
	  }

	  /**
	   * StringBuffer.
	   * @return
	   */
	  public String print() {
	    StringBuffer sb = new StringBuffer();
	    sb.append("Class: " + className + "\n");
	    sb.append("Method: " + method + "\n");
	    sb.append("Error Code = " + errorCode);
	    sb.append("cpiMessages: " + cpiMessages.print() + "\n");
	    return sb.toString();
	  }
}
