package com.example.demo.config;

public class CryptoExchangeConfig {

	private String baseUrl;
	private String webSocketUrl;

	public String getBaseUrl() {
		return this.baseUrl;
	}

	public void setBaseUrl(final String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public String getWebSocketUrl() {
		return this.webSocketUrl;
	}

	public void setWebSocketUrl(final String webSocketUrl) {
		this.webSocketUrl = webSocketUrl;
	}

}
