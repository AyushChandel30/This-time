package how.com.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Yes {

	@GetMapping("/hello")
	public ResponseEntity<String> m1 (){
		
		String s = "Trying";
		return new ResponseEntity<String> (s, HttpStatus.OK);
	}
	
}
