package com.example.FirstProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//main class which will called when springboot starts
@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {
        //run method return the ConfigurableApplicationContext to we will save the same
        // context will have all beans created by spring
        // default SpringApplication.run(FirstProjApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjApplication.class, args);
        //console log will be printed
        System.out.println("welcome to Boot...");

        //manually creating object
        //Alien a = new Alien();
        //a.show();


        //get bean - gets a bean from spring container of type Alien.class
        //dependency injection
        //Alien b = context.getBean(Alien.class);
        //b.show();

        Alien c = context.getBean(Alien.class);

        //manully adding the autowire object from context
        //c.setLaptop(context.getBean(Laptop.class));
        c.show();
	}

}
