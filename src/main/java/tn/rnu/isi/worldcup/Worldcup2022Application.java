package tn.rnu.isi.worldcup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories(basePackages="tn.rnu.isi.worldcup")
@SpringBootApplication
public class Worldcup2022Application {

	public static void main(String[] args) {
		SpringApplication.run(Worldcup2022Application.class, args);
	}
}

