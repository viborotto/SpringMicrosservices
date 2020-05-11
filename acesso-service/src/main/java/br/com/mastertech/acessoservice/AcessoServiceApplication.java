package br.com.mastertech.acessoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AcessoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcessoServiceApplication.class, args);
	}

}
