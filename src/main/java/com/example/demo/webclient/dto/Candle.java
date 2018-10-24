package com.example.demo.webclient.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Candle {

	/** Bucket start time. */
	private long time;
	/** Lowest price during the bucket interval. */
	private BigDecimal low;
	/** Highest price during the bucket interval. */
	private BigDecimal high;
	/** Opening price (first trade) in the bucket interval. */
	private BigDecimal open;
	/** Closing price (last trade) in the bucket interval. */
	private BigDecimal close;
	/** Volume of trading activity during the bucket interval. */
	private BigDecimal volume;

	public Candle() {
		// TODO Auto-generated constructor stub
	}

	@JsonCreator
	public Candle(final Object[] array) {
		this.time = Long.valueOf(array[0].toString());
		this.low = new BigDecimal(array[1].toString());
		this.high = new BigDecimal(array[2].toString());
		this.open = new BigDecimal(array[3].toString());
		this.close = new BigDecimal(array[4].toString());
		this.volume = new BigDecimal(array[5].toString());
	}
	/* @formatter:off
	@formatter:on */

	public long getTime() {
		return this.time;
	}

	public void setTime(final long time) {
		this.time = time;
	}

	public BigDecimal getLow() {
		return this.low;
	}

	public void setLow(final BigDecimal low) {
		this.low = low;
	}

	public BigDecimal getHigh() {
		return this.high;
	}

	public void setHigh(final BigDecimal high) {
		this.high = high;
	}

	public BigDecimal getOpen() {
		return this.open;
	}

	public void setOpen(final BigDecimal open) {
		this.open = open;
	}

	public BigDecimal getClose() {
		return this.close;
	}

	public void setClose(final BigDecimal close) {
		this.close = close;
	}

	public BigDecimal getVolume() {
		return this.volume;
	}

	public void setVolume(final BigDecimal volume) {
		this.volume = volume;
	}

}
