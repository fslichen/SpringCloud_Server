package evolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Application {
	// Once you start the APP, clients will automatically contact the current spring cloud config server for configurations. 
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
