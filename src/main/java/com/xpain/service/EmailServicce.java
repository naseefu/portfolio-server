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
			newEmail.setTo("naseefrahman90@gmail.com");
			newEmail.setSubject("Let's Talk - "+name);
			newEmail.setText("Hi " + "\n\n"+ "Mail of "+name+ " - "+ email+ "\n\n" +result);

			javaMailSenderImpl.send(newEmail);

		}

	}

