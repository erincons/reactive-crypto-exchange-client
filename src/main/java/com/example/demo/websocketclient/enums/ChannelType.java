package com.example.demo.websocketclient.enums;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ChannelType {

	HEARTBEAT, TICKER;

	@JsonValue
	public String getValue() {
		return name().toLowerCase();
	}

	@JsonCreator
	public static ChannelType fromValue(final String value) {
		return Arrays.stream(ChannelType.values()).filter(e -> e.name().equalsIgnoreCase(value)).findFirst()
				.orElse(null);
	}

}
