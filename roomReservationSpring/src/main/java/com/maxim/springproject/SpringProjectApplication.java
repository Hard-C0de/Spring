package com.maxim.springproject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//метааннотация
public class SpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);//запуск те тоже самое что
		//ApplicationContext applicationContext =new AnnotationConfigEmbeddedWebApplicationContext(SpringProjectApplication.class,args);

	}


}