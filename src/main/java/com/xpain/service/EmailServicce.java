package com.xpain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServicce {

		@Autowired
		private JavaMailSender javaMailSenderImpl;
		
		public void sendEmail(String name, String email, String result) {
			SimpleMailMessage newEmail = new SimpleMailMessage();
			newEmail.setTo(email);
			newEmail.setSubject("Love Calculator Application Result");
			newEmail.setText("Hi " + name + "\n\n" + result);

			javaMailSenderImpl.send(newEmail);

		}

	}

