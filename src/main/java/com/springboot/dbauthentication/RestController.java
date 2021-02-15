package com.springboot.dbauthentication;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	@GetMapping("/getMessage")
	public String getMessage() {
		
		return "I am a protected resource";
	}

	public static void main(String a[]){

		String password = "123456";
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(password);
		System.out.print(encodedPassword);
	}
}
