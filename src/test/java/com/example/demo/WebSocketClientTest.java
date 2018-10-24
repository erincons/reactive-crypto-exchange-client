package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.websocketclient.CoinbaseProWebSocketClient;

import reactor.test.StepVerifier;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebSocketClientTest {

	@Autowired
	private CoinbaseProWebSocketClient exchangeWebSocketClient;

	@Test
	public void testTicker() {
		StepVerifier.create(this.exchangeWebSocketClient.tickerChannel("BTC-EUR")).expectComplete().verify();
	}

}
