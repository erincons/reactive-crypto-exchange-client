package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.demo.config.CoinbaseProConfig;

@SpringBootApplication
@EnableConfigurationProperties({ CoinbaseProConfig.class })
public class DemoApplication {

	public static void main(final String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
