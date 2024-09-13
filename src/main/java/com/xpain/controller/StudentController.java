package com.xpain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xpain.DTO.EmailDTO;
import com.xpain.DTO.StudentDTO;
import com.xpain.service.EmailServicce;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
	
	@Autowired
	private EmailServicce emailService;
	
	@PostMapping("/api/concatenate")
	public String concatenate(@RequestBody StudentDTO studentDTO) {
		
		String concatenated = studentDTO.getFirstname()+studentDTO.getLastname();
		return concatenated;
		
	}
	
	@PostMapping("/api/email")
	public String email(@RequestBody EmailDTO emailDTO) {
		
		String name = emailDTO.getName();
		String mail = emailDTO.getEmail();
		String result = emailDTO.getResult();
		
		try {
		emailService.sendEmail(name, mail, result);
		return "Mail sended";}
		catch(Exception e) {
			return "Failed to send mail";
		}
		
	}

}
