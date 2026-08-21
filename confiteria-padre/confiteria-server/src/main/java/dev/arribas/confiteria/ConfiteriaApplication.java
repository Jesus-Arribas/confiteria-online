package dev.arribas.confiteria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConfiteriaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(ConfiteriaApplication.class, args);
	}
}
