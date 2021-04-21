package com.test.docker;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PrimarySkill {


	@RequestMapping("/login")
	@GetMapping
	String testlogin(){
		
		
		System.out.println("Insiideee");
		
		return "success";
	}

}
