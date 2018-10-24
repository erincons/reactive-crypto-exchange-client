package com.example.demo.webclient.dto;

import java.math.BigDecimal;
import java.time.Instant;

public class Time {

	private Instant iso;
	private BigDecimal epoch;

	public Instant getIso() {
		return this.iso;
	}

	public void setIso(final Instant iso) {
		this.iso = iso;
	}

	public BigDecimal getEpoch() {
		return this.epoch;
	}

	public void setEpoch(final BigDecimal epoch) {
		this.epoch = epoch;
	}

}
