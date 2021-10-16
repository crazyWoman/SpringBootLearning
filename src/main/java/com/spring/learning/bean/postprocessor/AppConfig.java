package com.spring.learning.bean.postprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AlbertBean albertBean(){
        return new AlbertBean();
    }
}
