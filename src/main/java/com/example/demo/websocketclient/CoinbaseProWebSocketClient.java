package com.example.demo.websocketclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;

//TODO: Extends BaseWebSocketClient
@Component
public class CoinbaseProWebSocketClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(CoinbaseProWebSocketClient.class);

	// TODO: Uses execute method to start a websocket session with ticker
	// channel and log each ticker message received.
	public Mono<Void> tickerChannel(final String productId) {
		throw new UnsupportedOperationException("Not implemented yet!!!");
	}

}
