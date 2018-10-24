package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("pro.coinbase")
public class CoinbaseProConfig extends CryptoExchangeConfig {

}
