package tn.esprit.MSTagReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(TagBinding.class)
@SpringBootApplication
public class MsTagReaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsTagReaderApplication.class, args);
	}

}
