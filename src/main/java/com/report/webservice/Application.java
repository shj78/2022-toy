package com.report.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})//일단 DB를 사용하지 않는다는 의미 - 오류 해결중...
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
