package isi.tn.worldcup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages="isi.tn.worldcup")
@SpringBootApplication
public class WorldcupApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldcupApplication.class, args);
	}

}
