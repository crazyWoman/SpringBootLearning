package com.spring.learning.bean.postprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AlbertBean albertBean(){
        return new AlbertBean();
    }

   @Bean(initMethod = "initRhea", destroyMethod = "shutdownRhea")
    public RheaBean rheaBean(){
        return new RheaBean();
    }
}

