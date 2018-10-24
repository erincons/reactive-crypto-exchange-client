package com.example.demo.websocketclient.dto;

public class ChannelSubscriptionsMessage extends ChannelMessage {

	private Channel[] channels;

	public Channel[] getChannels() {
		return this.channels;
	}

	public void setChannels(final Channel[] channels) {
		this.channels = channels;
	}

}
