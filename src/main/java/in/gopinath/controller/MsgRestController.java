package in.gopinath.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	@GetMapping("/greet")
	public String greet() {
		int i = 10 / 0;
		return "Hi , How are you...!";
	}

	// Creating exception in class level that is local to particular class 
	// we can write the Exception class globally also for entire project
//	@ExceptionHandler(value = Exception.class) 
//	public ResponseEntity<String> handleEx(Exception ex) {
//		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//	}

}
