package com.example.demo.webclient.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Ticker {

	private String tradeId;
	private BigDecimal price;
	private BigDecimal size;
	private BigDecimal bid;
	private BigDecimal ask;
	private BigDecimal volume;
	private Instant time;

	public String getTradeId() {
		return this.tradeId;
	}

	public void setTradeId(final String tradeId) {
		this.tradeId = tradeId;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(final BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getSize() {
		return this.size;
	}

	public void setSize(final BigDecimal size) {
		this.size = size;
	}

	public BigDecimal getBid() {
		return this.bid;
	}

	public void setBid(final BigDecimal bid) {
		this.bid = bid;
	}

	public BigDecimal getAsk() {
		return this.ask;
	}

	public void setAsk(final BigDecimal ask) {
		this.ask = ask;
	}

	public BigDecimal getVolume() {
		return this.volume;
	}

	public void setVolume(final BigDecimal volume) {
		this.volume = volume;
	}

	public Instant getTime() {
		return this.time;
	}

	public void setTime(final Instant time) {
		this.time = time;
	}

}
