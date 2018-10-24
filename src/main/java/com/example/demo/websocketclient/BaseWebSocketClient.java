package com.example.demo.websocketclient;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.function.Consumer;

import org.springframework.web.reactive.socket.WebSocketMessage;
import org.springframework.web.reactive.socket.client.ReactorNettyWebSocketClient;
import org.springframework.web.reactive.socket.client.WebSocketClient;

import com.example.demo.config.CryptoExchangeConfig;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class BaseWebSocketClient {

	protected final WebSocketClient webSocketClient;
	protected final URI url;

	public BaseWebSocketClient(final CryptoExchangeConfig config) throws URISyntaxException {
		this.url = new URI(config.getWebSocketUrl());
		this.webSocketClient = new ReactorNettyWebSocketClient();
	}

	public Mono<Void> execute(final String textMessage, final Consumer<String> consumer) {
		return this.webSocketClient.execute(this.url, session -> {
			final Mono<WebSocketMessage> out = Mono.just(session.textMessage(textMessage));
			final Flux<String> in = session.receive().map(WebSocketMessage::getPayloadAsText);
			return session.send(out).thenMany(in).doOnNext(consumer).then();
		});
	}

}
