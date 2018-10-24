package com.example.demo.websocketclient.enums;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ChannelMessageType {

	ERROR, SUBSCRIPTIONS, HEARTBEAT, TICKER;

	@JsonValue
	public String getValue() {
		return name().toLowerCase();
	}

	@JsonCreator
	public static ChannelMessageType fromValue(final String value) {
		return Arrays.stream(ChannelMessageType.values()).filter(e -> e.name().equalsIgnoreCase(value)).findFirst()
				.orElse(null);
	}

}
