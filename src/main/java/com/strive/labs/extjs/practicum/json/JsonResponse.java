package com.strive.labs.extjs.practicum.json;

/**
 * JSON response from server to client.
 * @author jmiremba
 *
 */
public class JsonResponse {
	private boolean success;
	private String message;
	private Object data;
	
	public JsonResponse() {
		this.success = false;
		this.message = null;
	}
	
	public JsonResponse(boolean success) {
		this();
		this.success = success;
	}
	
	public JsonResponse(String message) {
		this();
		this.message = message;
	}
	
	public JsonResponse(boolean success, String message) {
		this();
		this.success = success;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public void setSuccessData(Object data) {
		this.success = true;
		this.data = data;
	}
}