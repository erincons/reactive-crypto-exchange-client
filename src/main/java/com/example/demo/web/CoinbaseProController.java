package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.example.demo.webclient.CryptoExchangeWebClient;
import com.example.demo.webclient.dto.Candle;
import com.example.demo.webclient.dto.Product;
import com.example.demo.webclient.dto.Ticker;
import com.example.demo.webclient.dto.Time;
import com.example.demo.webclient.enums.Granularity;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping("/demo")
public class CoinbaseProController {

	private final CryptoExchangeWebClient exchangeWebClient;

	@Autowired
	public CoinbaseProController(final CryptoExchangeWebClient exchangeWebClient) {
		this.exchangeWebClient = exchangeWebClient;
	}

	@ExceptionHandler
	public ResponseEntity<String> handleWebClientResponseException(final WebClientResponseException ex) {
		return ResponseEntity.status(ex.getRawStatusCode()).body(ex.getMessage());
	}

	@GetMapping("/raw/time")
	@ResponseBody
	public Mono<String> rawTime() {
		return this.exchangeWebClient.rawTime();
	}

	@GetMapping("/time")
	@ResponseBody
	public Mono<Time> time() {
		return this.exchangeWebClient.time();
	}

	@GetMapping("/raw/products")
	@ResponseBody
	public Mono<String> rawProducts() {
		return this.exchangeWebClient.rawProducts();
	}

	@GetMapping("/products")
	@ResponseBody
	public Flux<Product> products() {
		return this.exchangeWebClient.products();
	}

	@GetMapping("/raw/products/{productId}/ticker")
	@ResponseBody
	public Mono<String> rawTicker(@PathVariable final String productId) {
		return this.exchangeWebClient.rawTicker(productId);
	}

	@GetMapping("/products/{productId}/ticker")
	@ResponseBody
	public Mono<Ticker> ticker(@PathVariable final String productId) {
		return this.exchangeWebClient.ticker(productId);
	}

	@GetMapping("/raw/products/{productId}/candles")
	@ResponseBody
	public Mono<String> rawCandles(@PathVariable final String productId,
			@RequestParam(required = true) final Granularity granularity,
			@RequestParam(required = false) final Long start, @RequestParam(required = false) final Long end) {
		return this.exchangeWebClient.rawCandles(productId, granularity, start, end);
	}

	@GetMapping("products/{productId}/candles")
	@ResponseBody
	public Flux<Candle> candles(@PathVariable final String productId,
			@RequestParam(required = true) final Granularity granularity,
			@RequestParam(required = false) final Long start, @RequestParam(required = false) final Long end) {
		return this.exchangeWebClient.candles(productId, granularity, start, end);
	}

}
