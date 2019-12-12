package tn.esprit.MSProxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MsProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProxyApplication.class, args);
	}

}
