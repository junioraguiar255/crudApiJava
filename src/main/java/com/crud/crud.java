package com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication


public class crud {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Bem vindo na minha aplicação!";
	}

	public static void main(String[] args) {
		SpringApplication.run(crud.class, args);
	}

}
