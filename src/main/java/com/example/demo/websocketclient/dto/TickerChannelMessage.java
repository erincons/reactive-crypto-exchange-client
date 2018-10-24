package com.example.demo.websocketclient.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.example.demo.webclient.enums.OrderSide;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class TickerChannelMessage extends ChannelMessage {

	private long tradeId;
	private long sequence;
	private Instant time;
	private String productId;
	private BigDecimal price;
	private OrderSide side;
	private BigDecimal lastSize;

	@JsonProperty("open_24h")
	private BigDecimal open24h;
	@JsonProperty("low_24h")
	private BigDecimal low24h;
	@JsonProperty("high_24h")
	private BigDecimal high24h;
	@JsonProperty("volume_24h")
	private BigDecimal volume24h;
	@JsonProperty("volume_30d")
	private BigDecimal volume30d;

	private BigDecimal bestBid;
	private BigDecimal bestAsk;

	public long getTradeId() {
		return this.tradeId;
	}

	public void setTradeId(final long tradeId) {
		this.tradeId = tradeId;
	}

	public long getSequence() {
		return this.sequence;
	}

	public void setSequence(final long sequence) {
		this.sequence = sequence;
	}

	public Instant getTime() {
		return this.time;
	}

	public void setTime(final Instant time) {
		this.time = time;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(final String productId) {
		this.productId = productId;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(final BigDecimal price) {
		this.price = price;
	}

	public OrderSide getSide() {
		return this.side;
	}

	public void setSide(final OrderSide side) {
		this.side = side;
	}

	public BigDecimal getLastSize() {
		return this.lastSize;
	}

	public void setLastSize(final BigDecimal lastSize) {
		this.lastSize = lastSize;
	}

	public BigDecimal getOpen24h() {
		return this.open24h;
	}

	public void setOpen24h(final BigDecimal open24h) {
		this.open24h = open24h;
	}

	public BigDecimal getLow24h() {
		return this.low24h;
	}

	public void setLow24h(final BigDecimal low24h) {
		this.low24h = low24h;
	}

	public BigDecimal getHigh24h() {
		return this.high24h;
	}

	public void setHigh24h(final BigDecimal high24h) {
		this.high24h = high24h;
	}

	public BigDecimal getVolume24h() {
		return this.volume24h;
	}

	public void setVolume24h(final BigDecimal volume24h) {
		this.volume24h = volume24h;
	}

	public BigDecimal getVolume30d() {
		return this.volume30d;
	}

	public void setVolume30d(final BigDecimal volume30d) {
		this.volume30d = volume30d;
	}

	public BigDecimal getBestBid() {
		return this.bestBid;
	}

	public void setBestBid(final BigDecimal bestBid) {
		this.bestBid = bestBid;
	}

	public BigDecimal getBestAsk() {
		return this.bestAsk;
	}

	public void setBestAsk(final BigDecimal bestAsk) {
		this.bestAsk = bestAsk;
	}

}
