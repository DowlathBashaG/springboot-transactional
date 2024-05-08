package io.dowalth.springboottransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class SpringbootTransactonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTransactonApplication.class, args);
	}

}
