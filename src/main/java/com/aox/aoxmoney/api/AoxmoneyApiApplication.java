package com.aox.aoxmoney.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.aox.aoxmoney.api.config.property.AlgamoneyApiProperty;



@SpringBootApplication
@EnableConfigurationProperties(AlgamoneyApiProperty.class)
public class AoxmoneyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AoxmoneyApiApplication.class, args);

	}
}
