package com.wolf.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Esta es una clase de configuracion Spring para manejar los beans
@Configuration
public class ConfigurationClass {

    @Bean
    public String name(){
        return "Wolf";
    }
}
