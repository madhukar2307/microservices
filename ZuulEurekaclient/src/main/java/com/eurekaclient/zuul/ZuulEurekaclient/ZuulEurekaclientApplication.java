package com.eurekaclient.zuul.ZuulEurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulEurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulEurekaclientApplication.class, args);
	}
}
