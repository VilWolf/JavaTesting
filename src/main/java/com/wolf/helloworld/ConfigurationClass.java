package com.wolf.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Crea automaticamente getters and setters
record Person (String name, int age, Address address) {};
record Address (String firsLitne, String city) {};

//Esta es una clase de configuracion Spring para manejar los beans
@Configuration
public class ConfigurationClass {

    @Bean
    public String name(){
        return "Wolf";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        var person = new Person("Juan", 20, new Address("Santiago", "condes"));

        return person;
    }

    @Bean
    public Person person2MethodCall(){
        //Llama al metodo address
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3){//name, age, address2
        //Usa los parametros de entrada
        return new Person(name, age, address3);
    }

    @Bean(name = "address2")
    @Primary //Hace el bean primario en caso de ser llamado de forma general
    public Address address(){
        var addres = new Address("Juan", "Villa Alemana");

        return addres;
    }

    @Bean(name = "address3")
    public Address address3(){
        var addres = new Address("Valparaiso", "alemania");

        return addres;
    }

    
    
}
