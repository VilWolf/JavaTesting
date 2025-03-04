package com.wolf.hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wolf.hello.config.ConfigurationClass;

@SpringBootApplication
public class HelloWorldSpring {

	public static void main(String[] args) {

		// Se lanza a spring contex

		var contex =
			new AnnotationConfigApplicationContext(ConfigurationClass.class);

		// Se configuran las cosas que queremos que maneje Spring
		//@Configuration el archivo ConfigurationClass - name @Bean

		//Recivimos los beans manejados por spring
		System.out.println(contex.getBean("name"));	

	}

}
