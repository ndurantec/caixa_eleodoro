package com.eleodoro.caixa_eleodoro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class CaixaEleodoroApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaixaEleodoroApplication.class, args);
	}

}
