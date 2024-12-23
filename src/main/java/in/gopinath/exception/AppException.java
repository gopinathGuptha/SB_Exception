package in.gopinath.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppException {
	
	@ExceptionHandler(value = NoUserFoundException.class)
	public ResponseEntity<AppExInfo> handleUserEx(NoUserFoundException ex) {

		AppExInfo info = new AppExInfo();
		info.setExCode("SBI0000001");
		info.setExMsg(ex.getMessage());
		info.setExDate(LocalDateTime.now());

		return new ResponseEntity<AppExInfo>(info, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<AppExInfo> handleEx(Exception ex) {

		AppExInfo info = new AppExInfo();
		info.setExCode("SBI000798");
		info.setExMsg(ex.getMessage());
		info.setExDate(LocalDateTime.now());

		return new ResponseEntity<AppExInfo>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
