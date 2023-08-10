package com.example.demo.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
	

	    @Autowired
	    private Email email;

	    @GetMapping("/sendemail")
	    public String sendEmail() {
	        email.sendSimpleEmail("divyapalani010@gmail.com", "Hello", "This is a test email.");
	        return "Email sent!";
	    }
	}

