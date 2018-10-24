package com.example.demo.websocketclient.dto;

import com.example.demo.websocketclient.enums.ChannelMessageType;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({ @Type(value = ChannelErrorMessage.class, name = "error"),
		@Type(value = ChannelSubscriptionsMessage.class, name = "subscriptions"),
		@Type(value = HeartbeatChannelMessage.class, name = "heartbeat"),
		@Type(value = TickerChannelMessage.class, name = "ticker") })
public abstract class ChannelMessage {

	private ChannelMessageType type;

	public ChannelMessageType getType() {
		return this.type;
	}

	public void setType(final ChannelMessageType type) {
		this.type = type;
	}

}
