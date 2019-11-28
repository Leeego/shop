package com.cmp.shop.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @CLassName EurekaServer
 * @Description: TODO
 * @Author: shenhao
 * @date: 2019/11/28 15:19
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer.class,args);
	}
}
