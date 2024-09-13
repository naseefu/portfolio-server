package com.xpain.demo;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class AppConfig {

    @Bean(name = "javaMailSender")
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();

        // Set mail server properties directly
        javaMailSenderImpl.setHost("smtp.gmail.com");
        javaMailSenderImpl.setPort(587);
        javaMailSenderImpl.setUsername("xpain0070@gmail.com");
        javaMailSenderImpl.setPassword("kkfoihdibzjzamjd");

        javaMailSenderImpl.setJavaMailProperties(getMailProperties());

        return javaMailSenderImpl;
    }

    private Properties getMailProperties() {
        Properties mailProperties = new Properties();
        mailProperties.put("mail.smtp.auth", "true");
        mailProperties.put("mail.smtp.starttls.enable", "true");
        mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        return mailProperties;
    }
}
