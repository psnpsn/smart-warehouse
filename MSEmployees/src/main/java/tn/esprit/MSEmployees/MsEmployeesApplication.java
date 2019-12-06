package tn.esprit.MSEmployees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsEmployeesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEmployeesApplication.class, args);
	}

}
