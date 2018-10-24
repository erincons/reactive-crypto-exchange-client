package com.example.demo.websocketclient.dto;

import com.example.demo.websocketclient.enums.ChannelType;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Channel {

	private ChannelType name;
	private String[] productIds;

	public ChannelType getName() {
		return this.name;
	}

	public void setName(final ChannelType name) {
		this.name = name;
	}

	public String[] getProductIds() {
		return this.productIds;
	}

	public void setProductIds(final String[] productIds) {
		this.productIds = productIds;
	}

}
