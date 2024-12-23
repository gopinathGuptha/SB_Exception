package in.gopinath.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.gopinath.exception.NoUserFoundException;

@RestController
public class UserRestController {

	@GetMapping("/user/{uid}")
	public String getnameById(@PathVariable("uid") Integer uid) {
		if (uid == 100) {
			return "Rithwik Sai";
		} else {
			throw new NoUserFoundException("Invalid User ID");
		}
	}

}
