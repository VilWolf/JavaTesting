package com.wolf.helloworld;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HelloWorldSpring {

	public static void main(String[] args) {

		// Se lanza a spring contex
		try (var contex = new AnnotationConfigApplicationContext(ConfigurationClass.class)) {

			// Se configuran las cosas que queremos que maneje Spring
			// @Configuration el archivo ConfigurationClass - name @Bean

			// Recivimos los beans manejados por spring
			System.out.println(contex.getBean("name"));

			System.out.println(contex.getBean("age"));

			System.out.println(contex.getBean("person"));

			System.out.println(contex.getBean("person2MethodCall"));

			System.out.println(contex.getBean("person3Parameters"));

			System.out.println(contex.getBean("address2"));

			System.out.println(contex.getBean(Address.class));

			Arrays.stream(contex.getBeanDefinitionNames()).forEach(System.out::println);

		}

	}

}
