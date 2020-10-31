package client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestPrograIiiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestPrograIiiApplication.class, args);
	}

}
