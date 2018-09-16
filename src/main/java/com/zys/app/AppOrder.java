package com.zys.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 * 订单服务启动类
 * @author ASUS
 *
 */

@SpringBootApplication
@EnableEurekaClient
public class AppOrder {

	public static void main(String[] args) {
		SpringApplication.run(AppOrder.class, args);

	}
	
	//:开启负载均衡
	@Bean
	@LoadBalanced
	RestTemplate restTemplate (){
		return new RestTemplate();
	}

}
