package org.springframework.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@RestController
public class SpringTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringTestApp.class, args);
    }
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    
}