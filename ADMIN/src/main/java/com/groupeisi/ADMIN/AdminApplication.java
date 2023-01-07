package com.groupeisi.ADMIN;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import org.springframework.web.client.RestTemplate;


@SpringBootApplication(excludeName = {"ADMIN.com.groupeisi.ADMIN.Controller.AdminController"})
@EnableDiscoveryClient
public class AdminApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(AdminApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

}
