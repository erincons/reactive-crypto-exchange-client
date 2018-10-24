package com.example.demo.websocketclient.enums;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ChannelOperation {

	SUBSCRIBE, UNSUBSCRIBE;

	@JsonValue
	public String getValue() {
		return name().toLowerCase();
	}

	@JsonCreator
	public static ChannelOperation fromValue(final String value) {
		return Arrays.stream(ChannelOperation.values()).filter(e -> e.name().equalsIgnoreCase(value)).findFirst()
				.orElse(null);
	}

}
