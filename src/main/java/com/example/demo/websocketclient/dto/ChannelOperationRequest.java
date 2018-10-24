package com.example.demo.websocketclient.dto;

import com.example.demo.websocketclient.enums.ChannelOperation;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ChannelOperationRequest {

	private ChannelOperation type;
	private String[] productIds;
	private Channel[] channels;

	public ChannelOperation getType() {
		return this.type;
	}

	public void setType(final ChannelOperation type) {
		this.type = type;
	}

	public String[] getProductIds() {
		return this.productIds;
	}

	public void setProductIds(final String[] productIds) {
		this.productIds = productIds;
	}

	public Channel[] getChannels() {
		return this.channels;
	}

	public void setChannels(final Channel[] channels) {
		this.channels = channels;
	}

}
