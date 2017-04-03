package evolution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnyController {
	@GetMapping("/server")
	public void server() {
		System.out.println("Welcome to the spring cloud config server.");
	}
}
