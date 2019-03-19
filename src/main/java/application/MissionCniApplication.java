package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EntityScan("application.*")
public class MissionCniApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(MissionCniApplication.class, args);
	}
	
}
