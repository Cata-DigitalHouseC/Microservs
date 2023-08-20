package com.example.mssubscription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class MsSubscriptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSubscriptionApplication.class, args);
	}

}
