package evolution.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import evolution.util.Sys;

@RestController
public class AnyController {
	// Correspond to server.port in application.properties.
	@Value("${server.port}")
	private Integer port;
	
	@GetMapping("/server")
	public void server() {
		Sys.println("Welcome to spring cloud config server.");
		Sys.println("Port = " + port);
	}
}
