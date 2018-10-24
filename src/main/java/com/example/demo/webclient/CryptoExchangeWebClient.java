package com.example.demo.webclient;

import com.example.demo.webclient.dto.Candle;
import com.example.demo.webclient.dto.Product;
import com.example.demo.webclient.dto.Ticker;
import com.example.demo.webclient.dto.Time;
import com.example.demo.webclient.enums.Granularity;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CryptoExchangeWebClient {

	Mono<String> rawTime();

	Mono<Time> time();

	Mono<String> rawProducts();

	Flux<Product> products();

	Mono<String> rawTicker(String productId);

	Mono<Ticker> ticker(String productId);

	Mono<String> rawCandles(String productId, Granularity granularity, Long start, Long end);

	Flux<Candle> candles(String productId, Granularity granularity, Long start, Long end);

}