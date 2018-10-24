package com.example.demo.webclient.enums;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The granularity field must be one of the following values: {60, 300, 900,
 * 3600, 21600, 86400}. Otherwise, your request will be rejected. These values
 * correspond to timeslices representing one minute, five minutes, fifteen
 * minutes, one hour, six hours, and one day, respectively.
 */
public enum Granularity {

	M1(60), M5(300), M15(900), H1(3600), H6(21600), D1(86400);

	private final int value;

	private Granularity(final int value) {
		this.value = value;
	}

	@JsonValue
	public int getValue() {
		return this.value;
	}

	@JsonCreator
	public static Granularity fromValue(final int value) {
		return Arrays.stream(Granularity.values()).filter(e -> e.value == value).findFirst().orElse(null);
	}

}
