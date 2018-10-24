package com.example.demo.webclient.enums;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderSide {

	BUY, SELL;

	@JsonValue
	public String getValue() {
		return name().toLowerCase();
	}

	@JsonCreator
	public static OrderSide fromValue(final String value) {
		return Arrays.stream(OrderSide.values()).filter(e -> e.name().equalsIgnoreCase(value)).findFirst().orElse(null);
	}

}
