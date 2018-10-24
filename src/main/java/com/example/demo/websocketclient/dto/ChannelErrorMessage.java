package com.example.demo.websocketclient.dto;

public class ChannelErrorMessage extends ChannelMessage {

	private String message;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}

}
