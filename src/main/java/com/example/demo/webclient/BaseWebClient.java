package com.example.demo.webclient;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.config.CryptoExchangeConfig;

public class BaseWebClient {

	protected final WebClient webClient;

	public BaseWebClient(final CryptoExchangeConfig config) {
		this.webClient = WebClient.builder().baseUrl(config.getBaseUrl())
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();
	}

}
