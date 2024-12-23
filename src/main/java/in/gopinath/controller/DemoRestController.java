package in.gopinath.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/welcome")
	public String welcome() {
		System.out.println("Demo Controller");
		String s1 = null;
		s1.length();
		return "Hello, Welcome to Rest API's";
	}
}
