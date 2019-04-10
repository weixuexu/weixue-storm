package com.weixue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.weixue.storm.storage.mysql.dao")
public class WeixueStormStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeixueStormStorageApplication.class, args);
	}

}
