package com.example.demo.websocketclient.dto;

import java.time.Instant;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class HeartbeatChannelMessage extends ChannelMessage {

	private long sequence;
	private long lastTradeId;
	private String productId;
	private Instant time;

	public long getSequence() {
		return this.sequence;
	}

	public void setSequence(final long sequence) {
		this.sequence = sequence;
	}

	public long getLastTradeId() {
		return this.lastTradeId;
	}

	public void setLastTradeId(final long lastTradeId) {
		this.lastTradeId = lastTradeId;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(final String productId) {
		this.productId = productId;
	}

	public Instant getTime() {
		return this.time;
	}

	public void setTime(final Instant time) {
		this.time = time;
	}

}
